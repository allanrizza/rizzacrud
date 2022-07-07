package com.rizzacrud.models.requests;

import com.rizzacrud.models.Categoria;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
public class MangaRequest {

    private String titulo;

    private Date anoDeLancamento;

    private Long categoriaId;
}