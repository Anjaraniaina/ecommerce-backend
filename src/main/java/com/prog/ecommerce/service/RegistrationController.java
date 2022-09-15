package com.prog.ecommerce.service;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class RegistrationController {
    private final RegistrationService registrationService;

    @PostMapping("/registration")
    public String register(@RequestBody RegistrationRequest request) {
        registrationService.register(request);
        return "Registred";
    }
}
