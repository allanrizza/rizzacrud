package com.rizzacrud.models;

import com.rizzacrud.repositories.CategoriaRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RIZZA_MANGA")
@Getter
@Setter
public class Manga {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "ANO_LANCAMENTO")
    private Date anoDeLancamento;

    @Column(name = "CATEGORIA_ID")
    private Long categoriaId;
}