package com.rizzacrud.services;

import com.rizzacrud.models.Categoria;
import com.rizzacrud.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria cadastraCategoria(Categoria categoria) {
        return categoriaRepository.saveAndFlush(categoria);
    }

}
