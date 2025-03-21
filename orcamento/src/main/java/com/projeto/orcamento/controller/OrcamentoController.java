package com.projeto.orcamento.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orcamento")
public class OrcamentoController {
    @GetMapping
    public String teste(){
        return "teste ok!";
    }

}
