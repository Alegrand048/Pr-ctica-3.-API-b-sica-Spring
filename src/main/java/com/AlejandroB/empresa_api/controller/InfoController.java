package com.AlejandroB.empresa_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * Esta clase ...
 *
 * @Author: Alejandro Betanzos Álvarez
 * @Versión: 2026, 01
 */
@RestController
public class InfoController {

    @GetMapping("/informacion")
    public String info() {
        return "Hola mundo";
    }
}
