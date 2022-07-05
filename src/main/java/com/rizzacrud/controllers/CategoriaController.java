package com.rizzacrud.controllers;

import com.rizzacrud.models.Categoria;
import com.rizzacrud.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @PostMapping(value = "/cadastraCategoria")
    Categoria cadastraManga(@RequestBody Categoria categoria) {

        return categoriaService.cadastraCategoria(categoria);
    }

}
