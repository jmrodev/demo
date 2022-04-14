/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sprinboot.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jmro
 */
@RestController
public class HolaController {

    /**
     *
     * @param nombre
     * @param edad
     * @param profesion
     * @return
     */
    @GetMapping("/hola")

    public String decirHola(
            @RequestParam String nombre,
            @RequestParam int edad,
            @RequestParam String profesion) {
        return "Hello World ,tu nombre es : " + nombre + " tu edad es : " + edad + " y tu profesion es : " + profesion;
    }

    /**
     *
     * @param cli
     */
    @PostMapping ("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli){
        System.out.println("Datos cliente : " + cli.getNombre() + "Apellido: " + cli.getApellido());
    }
}
