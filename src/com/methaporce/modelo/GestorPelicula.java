package com.methaporce.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Creamos la clase GestorPelicula que contiene una lista(colección) de películas implementando la Interface.
public class GestorPelicula implements GestorPeliculaI {

    private List<Pelicula> peliculas;
    public GestorPelicula() {
        this.peliculas = new ArrayList<>();
    }

    //Creación de métodos
    //Creación agregarPelicula()
    @Override
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    //Creación eliminarPelicula()
    @Override
    public void eliminarPelicula(int id) {
        for (Iterator<Pelicula> iterator = peliculas.iterator(); iterator.hasNext(); ) {
            Pelicula pelicula = iterator.next();
            if (pelicula.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }
    //Creación obtenerPeliculas()
    @Override
    public List<Pelicula> obtenerPeliculas() {
        return peliculas;
    }


    //Creación obtenerPeliculasDisponibles()
    @Override
    public List<Pelicula> obtenerPeliculasDisponibles() {
        List<Pelicula> peliculasDisponibles = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDisponible()) {
                peliculasDisponibles.add(pelicula);
            }
        }
        return peliculasDisponibles;
    }

    //Creación obtenerPeliculasNoDisponibles()
    @Override
    public List<Pelicula> obtenerPeliculasNoDisponibles() {
        List<Pelicula> peliculasNoDisponibles = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            if (!pelicula.getDisponible()) {
                peliculasNoDisponibles.add(pelicula);
            }
        }
        return peliculasNoDisponibles;
    }

    //Creación marcarPeliculaComoDisponible()
    @Override
    public void marcarPeliculaComoDisponible(int id) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId() == id) {
                pelicula.setDisponible(true);
                break;
            }
        }
    }
}

