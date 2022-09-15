package com.prog.ecommerce.controller;

import com.prog.ecommerce.model.Category;
import com.prog.ecommerce.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/categories/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        try {
            return categoryService.getCategoryById(id);
        }
        catch(Exception e){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Category Not Found",e);
        }
    }

    @GetMapping("/categories")
    public List<Category> getCategories() {
        return categoryService.getCategories();
    }
}
