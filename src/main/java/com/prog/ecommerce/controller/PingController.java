package com.prog.ecommerce.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PingController {

    @GetMapping(value = {"/ping", "/"}, produces = "text/plain")
    public String ping() {
        return "pong";
    }
}
