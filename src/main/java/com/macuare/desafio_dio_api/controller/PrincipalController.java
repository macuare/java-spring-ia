package com.macuare.desafio_dio_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class PrincipalController {
    @GetMapping("/")
    public ResponseEntity<String> home() {
        System.out.println("Ejecutando home");
        return ResponseEntity.ok("Bienvenido");
    }
}
