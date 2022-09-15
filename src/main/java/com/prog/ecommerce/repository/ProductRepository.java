package com.prog.ecommerce.repository;

import com.prog.ecommerce.model.Order;
import com.prog.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product getById(Long id);
    List<Product> findByPrice(double price);

}
