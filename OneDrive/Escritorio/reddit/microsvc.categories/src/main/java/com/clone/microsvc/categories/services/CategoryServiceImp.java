package com.clone.microsvc.categories.services;

import com.clone.microsvc.categories.dto.CategoryDTO;
import com.clone.microsvc.categories.models.Category;
import com.clone.microsvc.categories.repositories.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CategoryServiceImp implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper; //Se hizo la inyección para acceder a sus metodos y hacer la conversión

    //En estos metodos vamos a "igual el DTO y la entidad, dicha entidad la vamos a convertir en un DTO para que el ORM se comunique con ella
    @Override
    public CategoryDTO create(CategoryDTO categoryDTO) {
        Category category= modelMapper.map(categoryDTO, Category.class); //IMPORTANTE: Debemos recibir el parámetro que estamos especificando en el tipo de clase (SIEMPRE), Por eso se hizo la conversión
        Category SavedCategory= categoryRepository.save(category); //Esa clase anterior que convertimos, la guardamos del mismo tipo y se convierte
        return modelMapper.map(SavedCategory,CategoryDTO.class);   //Se convierte la clase Category para que coincida con el tipo de retorno del método
    }

    @Override
    public List<CategoryDTO> findAll() {
        return null;
    }

    @Override
    public CategoryDTO findById(Long id) {
        return null;
    }

    @Override
    public CategoryDTO update(Long id, CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {


    }
}
