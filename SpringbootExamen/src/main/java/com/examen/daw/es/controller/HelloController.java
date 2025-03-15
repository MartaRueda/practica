package com.examen.daw.es.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hola a las 5 AM";
    }


    @PostMapping("/saludo")
    public String enviarSaludo(){
        String mensaje = "Saludando desde PostMapping";
        System.out.println("Mensaje: " + mensaje);
        return "Mensaje:" + mensaje;
    }
    @PutMapping("/actualizar")
    public String actualizarMensaje(){
        String mensaje = "Saludando desde PutMapping";
        return "Mensaje actualizado: " + mensaje;
    }
}
