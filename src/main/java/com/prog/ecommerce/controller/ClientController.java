package com.prog.ecommerce.controller;

import com.prog.ecommerce.model.Client;
import com.prog.ecommerce.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
public class ClientController {
    private ClientService clientService;

    @GetMapping("/clients/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @DeleteMapping("/clients/{id}")
    public String deleteClientById(@PathVariable Long id) {
        clientService.deleteById(id);
        return "Ressource deleted";
    }

    @GetMapping("/clients")
    public List<Client> getClients() {
        return clientService.getClients();
    }

    @PutMapping("/clients")
    public List<Client> saveAll(@RequestBody List<Client> toWrite) {
        return clientService.saveAll(toWrite);
    }
}
