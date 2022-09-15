package com.prog.ecommerce.controller;

import com.prog.ecommerce.model.Order;
import com.prog.ecommerce.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
public class OrderController {

    private OrderService orderService;

    @GetMapping("/orders/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    @DeleteMapping("/orders/{id}")
    public String deleteOrderById(@PathVariable Long id) {
        orderService.deleteById(id);
        return "Ressource deleted";
    }

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return orderService.getOrders();
    }
}
