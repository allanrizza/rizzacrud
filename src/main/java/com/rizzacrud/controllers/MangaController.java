package com.rizzacrud.controllers;

import com.rizzacrud.models.Manga;
import com.rizzacrud.services.MangaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/manga")
public class MangaController {

    @Autowired
    MangaService mangaService;

    @PostMapping(value = "/cadastraManga")
    Manga cadastraManga(@RequestBody Manga manga) {
        return mangaService.cadastraManga(manga);
    }

}
