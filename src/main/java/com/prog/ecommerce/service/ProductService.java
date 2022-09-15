package com.prog.ecommerce.service;

import com.prog.ecommerce.model.Product;
import com.prog.ecommerce.repository.ProductRepository;
import com.prog.ecommerce.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

  private ProductRepository productRepository;

  public Product getProductById(Long productId) {
    return productRepository.getById(productId);
  }

  public List<Product> getProducts(){
    return productRepository.findAll();
  }

  @Transactional
  public List<Product> saveAll(List<Product> clients) {
    return productRepository.saveAll(clients);
  }

  @Transactional
  public void deleteById(Long productId){
    productRepository.deleteById(productId);
  }

}
