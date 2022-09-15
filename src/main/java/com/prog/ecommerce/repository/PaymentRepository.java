package com.prog.ecommerce.repository;

import com.prog.ecommerce.model.Client;
import com.prog.ecommerce.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment getById(Long id);
}