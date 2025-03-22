package com.example.microservicio_peliculas.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pelicula {
    private long id;
    private String Titulo;
    private int anio;
    private String director;
    private String genero;
    private String sinopsis;
}
