package com.prog.ecommerce.controller;

import com.prog.ecommerce.model.Product;
import com.prog.ecommerce.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
public class ProductController {

    private ProductService productService;
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @DeleteMapping("/products/{id}")
    public String deleteProductById(@PathVariable Long id) {
        productService.deleteById(id);
        return "Ressource deleted";
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @PutMapping("/products")
    public List<Product> saveAll(@RequestBody List<Product> toWrite) {
        return productService.saveAll(toWrite);
    }
}
