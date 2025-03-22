package com.example.microservicio_peliculas.service;

import com.example.microservicio_peliculas.model.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService {
    private final List<Pelicula> peliculas = new ArrayList<>();

public PeliculaService(){
    peliculas.add(new Pelicula(1, "El Padrino", 1972, "Francis Ford Coppola", "Crimen", "La historia de la familia Corleone en el mundo de la mafia."));
    peliculas.add(new Pelicula(2, "Interestelar", 2014, "Christopher Nolan", "Ciencia Ficción", "Un grupo de astronautas busca un nuevo hogar para la humanidad."));
    peliculas.add(new Pelicula(3, "Titanic", 1997, "James Cameron", "Romance", "Historia de amor en el trágico hundimiento del Titanic."));
    peliculas.add(new Pelicula(4, "Matrix", 1999, "Lana y Lilly Wachowski", "Acción", "Un hacker descubre la verdad sobre su realidad."));
    peliculas.add(new Pelicula(5, "El Caballero de la Noche", 2008, "Christopher Nolan", "Acción", "Batman enfrenta al Joker en Gotham."));
    peliculas.add(new Pelicula(6, "Forrest Gump", 1994, "Robert Zemeckis", "Drama", "La increíble vida de un hombre con un gran corazón."));
    peliculas.add(new Pelicula(7, "Avatar", 2009, "James Cameron", "Ciencia Ficción", "Un ex-marine en un mundo alienígena."));

}

public List<Pelicula> getPeliculas (){
    return peliculas;
}

public Optional<Pelicula> getPorId(long id){
    return peliculas.stream().filter(q -> q.getId() == id).findFirst();
}

public boolean eliminarPorId(long id) {
    return peliculas.removeIf(p -> p.getId() == id);
}

}

