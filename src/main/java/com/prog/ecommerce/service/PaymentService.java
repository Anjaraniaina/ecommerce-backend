package com.prog.ecommerce.service;

import com.prog.ecommerce.model.Payment;
import com.prog.ecommerce.repository.PaymentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class PaymentService {

  private PaymentRepository paymentRepository;

  public Payment getById(Long paymentId) {
    return paymentRepository.getById(paymentId);
  }

  public List<Payment> getPayments(){
    return paymentRepository.findAll();
  }

  @Transactional
  public void deleteById(Long paymentId){
    paymentRepository.deleteById(paymentId);
  }
}
