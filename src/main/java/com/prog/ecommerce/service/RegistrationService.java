package com.prog.ecommerce.service;

import com.prog.ecommerce.model.Client;
import com.prog.ecommerce.model.ClientRole;
import com.prog.ecommerce.model.Order;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final ClientService clientService;
    public void register(Order.RegistrationRequest request) {
        clientService.signUpClient(
                new Client(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        ClientRole.CLIENT
                )
        );
    }
}
