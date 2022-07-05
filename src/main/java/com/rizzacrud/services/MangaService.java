package com.rizzacrud.services;

import com.rizzacrud.models.Categoria;
import com.rizzacrud.models.Manga;
import com.rizzacrud.repositories.CategoriaRepository;
import com.rizzacrud.repositories.MangaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MangaService {

    @Autowired
    MangaRepository mangaRepository;

    public Manga cadastraManga(Manga manga) {
        return mangaRepository.saveAndFlush(manga);
    }

}
