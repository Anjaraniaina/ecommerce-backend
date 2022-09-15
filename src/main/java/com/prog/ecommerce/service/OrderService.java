package com.prog.ecommerce.service;

import com.prog.ecommerce.model.Order;
import com.prog.ecommerce.repository.OrderRepository;
import com.prog.ecommerce.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {

  private OrderRepository orderRepository;

  public Order getOrderById(Long orderId) {
    return orderRepository.getById(orderId);
  }

  public List<Order> getOrders(){
    return orderRepository.findAll();
  }

  @Transactional
  public void deleteById(Long orderId){
    orderRepository.deleteById(orderId);
  }
}
