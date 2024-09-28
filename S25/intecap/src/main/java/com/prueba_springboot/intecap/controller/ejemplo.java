package com.prueba_springboot.intecap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class ejemplo {

    @GetMapping("/otro")
    public String saludo() {
        return "Hola Mundo";
    }

    @GetMapping("/saludo")
    public String saludo2() {
        return "Hola Mundo 2";
    }

}
