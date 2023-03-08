package com.clone.microsvc.categories.controllers;

import com.clone.microsvc.categories.dto.CategoryDTO;
import com.clone.microsvc.categories.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/controller")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<CategoryDTO> create (@RequestBody CategoryDTO categoryDTO){
        return ResponseEntity.ok(categoryService.create(categoryDTO));
    }
}
