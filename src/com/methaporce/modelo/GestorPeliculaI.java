package com.methaporce.modelo;

import java.util.List;

//Creación de Interface que representa un gestor de películas.
public interface GestorPeliculaI {

    //Metodos
    //Agregar Película
    void agregarPelicula(Pelicula pelicula); //Primero es el tipo de tu parametro y luego es el nombre del objeto

    //Eliminar Película
    void eliminarPelicula(int id);

   //Obtener una lista de Películas.
    List<Pelicula> obtenerPeliculas();

    //Obtener una lista de Películas Disponibles.
    List<Pelicula> obtenerPeliculasDisponibles();

    //Obtener una lista de Películas No Disponibles.
    List<Pelicula> obtenerPeliculasNoDisponibles();

    //Marcar una película como disponible con su ID
    void marcarPeliculaComoDisponible(int id);

}
