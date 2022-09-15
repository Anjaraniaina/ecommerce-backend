package com.prog.ecommerce.service;

import com.prog.ecommerce.model.Category;
import com.prog.ecommerce.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {

  private CategoryRepository categoryRepository;

  public Category getCategoryById(Long orderId) {
    return categoryRepository.getById(orderId);
  }

  public List<Category> getCategories(){
    return categoryRepository.findAll();
  }

}
