package com.AlejandroB.empresa_api.controller;

import com.AlejandroB.empresa_api.entity.Empresa;
import com.AlejandroB.empresa_api.service.EmpresaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 *
 * Esta clase ...
 *
 * @Author: Alejandro Betanzos Álvarez
 * @Versión: 2026, 01
 */
@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping
    public List<Empresa> listar() {
        return empresaService.listar();
    }

    @PostMapping
    public Empresa crear(@RequestBody Empresa empresa) {
        return empresaService.crear(empresa);
    }
}