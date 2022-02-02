package com.example.Ejercicio_Java_2;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controladores {
    @GetMapping("/user/{name}")
    public String greeting (@PathVariable String nombre){
        return "Hello "+ nombre;
    }

    @PostMapping("/useradd")
    public Persona postPersona (@RequestBody Persona persona){
        persona.setEdad(persona.getEdad()+1);
        return persona;
    }


}
