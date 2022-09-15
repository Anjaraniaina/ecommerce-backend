package com.prog.ecommerce.repository;

import com.prog.ecommerce.model.Client;
import com.prog.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order getById(Long id);
}
