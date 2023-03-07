package com.clone.microsvc.categories.services;

import com.clone.microsvc.categories.dto.CategoryDTO;
import com.clone.microsvc.categories.models.Category;
import com.clone.microsvc.categories.repositories.CategoryRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImp implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<CategoryDTO> findAll() {
        List<Category> categories = categoryRepository.findAll();

        return categories.stream()
                .map(category -> modelMapper.map(category, CategoryDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO findById(Long id) {
         Category category = categoryRepository.findById(id).
                orElseThrow(()->new EntityNotFoundException("Category not found with id" + id));                           //Aquí no se especifica el tipo de dato del Id, porque lo paso como parámetro
        return modelMapper.map(category, CategoryDTO.class);
    }

    @Override
    public CategoryDTO create(CategoryDTO categoryDTO) {
        Category category= modelMapper.map(categoryDTO, Category.class);
        Category savedCategory= categoryRepository.save(category);
        return modelMapper.map(savedCategory, CategoryDTO.class);
    }

    @Override
    public CategoryDTO update(Long id, CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
