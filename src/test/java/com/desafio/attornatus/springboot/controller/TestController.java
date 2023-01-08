package com.desafio.attornatus.springboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String saudacao(String nome){
        return String.format("Ola sou, %s", nome);
    }
}
