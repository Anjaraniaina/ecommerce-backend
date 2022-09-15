package com.prog.ecommerce.controller;

import com.prog.ecommerce.model.Order;
import com.prog.ecommerce.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class RegistrationController {
    private final RegistrationService registrationService;

    @PostMapping("/registration")
    public String register(@RequestBody Order.RegistrationRequest request) {
        registrationService.register(request);
        return "Registred";
    }
}
