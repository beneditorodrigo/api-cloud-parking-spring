package com.beneditorodrigo.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String hello(){
        return "Olá, bem-vindo! Desenvolvido por Rodrigo Dev Back End Java";
    }
}
