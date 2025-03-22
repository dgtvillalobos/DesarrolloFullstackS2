package com.example.microservicio_peliculas.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservicio_peliculas.model.Pelicula;
import com.example.microservicio_peliculas.service.PeliculaService;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/peliculas")


public class PeliculaController {

    
    private final PeliculaService peliculaService;


    public PeliculaController(PeliculaService peliculaService){
        this.peliculaService = peliculaService;
    }

    @GetMapping
    public List<Pelicula> getPeliculas() {
        return peliculaService.getPeliculas();
    }

    @GetMapping("/{id}")
    public Optional<Pelicula> getPorId(@PathVariable long id) {
        return peliculaService.getPorId(id);
    }
    
    @GetMapping("/eliminar/{id}")
    public boolean getRemovePorId(@PathVariable long id) {
        return peliculaService.eliminarPorId(id);
    }

}
