package com.clone.microsvc.categories.controllers;

import com.clone.microsvc.categories.dto.CategoryDTO;
import com.clone.microsvc.categories.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> findAll (){
        return ResponseEntity.ok(categoryService.findAll());
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> create (@RequestBody CategoryDTO categoryDTO){
        return ResponseEntity.ok(categoryService.create(categoryDTO));
    }
}
