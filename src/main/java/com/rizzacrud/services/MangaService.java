package com.rizzacrud.services;

import com.rizzacrud.models.Categoria;
import com.rizzacrud.models.Manga;
import com.rizzacrud.models.requests.MangaRequest;
import com.rizzacrud.repositories.CategoriaRepository;
import com.rizzacrud.repositories.MangaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MangaService {

    @Autowired
    MangaRepository mangaRepository;

    @Autowired
    CategoriaRepository categoriaRepository;

    public Manga cadastraManga(MangaRequest mangaRequest) {
        Manga manga = new Manga();

        manga.setCategoria(categoriaRepository.findById(mangaRequest.getCategoriaId()).get());

        manga.setTitulo(mangaRequest.getTitulo());

        manga.setAnoDeLancamento(mangaRequest.getAnoDeLancamento());

        return mangaRepository.saveAndFlush(manga);
    }

}
