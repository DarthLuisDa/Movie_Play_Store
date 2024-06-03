package com.methaporce.vista;

import com.methaporce.GestorPelicula;
import com.methaporce.modelo.Pelicula;
//Creamos Clase Main. Punto de entrada de la aplicación.
public class Main {

    public static void main(String[] args)  {

        GestorPelicula gestorPelicula = new GestorPelicula();

        //Lista de Peliculas con sus tres atributos.
        Pelicula pelicula1 = new Pelicula(1, "EL Señor de los Anillos", true);
        //Para imprimir todas las peliculas, agregamos una por una al GestorPelicula.
        gestorPelicula.agregarPelicula(pelicula1);
        Pelicula pelicula2 = new Pelicula(2, "Harry Potter", true);
        gestorPelicula.agregarPelicula(pelicula2);
        Pelicula pelicula3 = new Pelicula(3, "Narnia", true);
        gestorPelicula.agregarPelicula(pelicula3);
        Pelicula pelicula4 = new Pelicula(4, "El Hobbit", true);
        gestorPelicula.agregarPelicula(pelicula4);
        Pelicula pelicula5 = new Pelicula(5, "Kung Fu Panda", false);
        gestorPelicula.agregarPelicula(pelicula5);
        Pelicula pelicula6 = new Pelicula(6, "Los Juegos del Hambre", true);
        gestorPelicula.agregarPelicula(pelicula6);
        Pelicula pelicula7 = new Pelicula(7, "EL Laberinto del Fauno", true);
        gestorPelicula.agregarPelicula(pelicula7);
        Pelicula pelicula8 = new Pelicula(8, "Hellboy", true);
        gestorPelicula.agregarPelicula(pelicula8);
        Pelicula pelicula9 = new Pelicula(9, "Madagascar", false);
        gestorPelicula.agregarPelicula(pelicula9);
        Pelicula pelicula10 = new Pelicula(10, "Sherk", false);
        gestorPelicula.agregarPelicula(pelicula10);


        // Imprimir lista de todas las películas.
        System.out.println(); //Renglón vacío para separar
        System.out.println("<<<<<------------------------------------------------------------>>>>>");
        System.out.println("<<<<<-------------  Lista de todas las películas  --------------->>>>>"); //Leyenda a Imprimir
        System.out.println("<<<<<------------------------------------------------------------>>>>>");
        gestorPelicula.obtenerPeliculas().forEach(pelicula -> System.out.println(pelicula.toString()));

        // Imprimir películas disponibles.
        System.out.println();
        System.out.println("<<<<<------------------------------------------------------------>>>>>");
        System.out.println("<<<<<--------------  Películas disponibles  --------------------->>>>>");
        System.out.println("<<<<<------------------------------------------------------------>>>>>");
        gestorPelicula.obtenerPeliculasDisponibles().forEach(pelicula -> System.out.println(pelicula.toString()));

        // Imprimir películas no disponibles.
        System.out.println();
        System.out.println("<<<<<------------------------------------------------------------>>>>>");
        System.out.println("<<<<<--------------  Películas no disponibles ------------------->>>>>");
        System.out.println("<<<<<------------------------------------------------------------>>>>>");
        gestorPelicula.obtenerPeliculasNoDisponibles().forEach(pelicula -> System.out.println(pelicula.toString()));

        // Eliminar una película.
        System.out.println();
        System.out.println("<<<<<------------------------------------------------------------>>>>>");
        System.out.println("<<<<<---------  Eliminar película con identificador 1  ---------->>>>>");
        System.out.println("<<<<<------------------------------------------------------------>>>>>");
        gestorPelicula.eliminarPelicula(1);

        // Imprimir todas las películas para comprobar que se eliminó la pelicula con el ID número 1.
        System.out.println();
        System.out.println("<<<<<------------------------------------------------------------>>>>>");
        System.out.println("<<<<<---  Lista de todas las películas sin la que se eliminó  --->>>>>");
        System.out.println("<<<<<------------------------------------------------------------>>>>>");
        gestorPelicula.obtenerPeliculas().forEach(pelicula -> System.out.println(pelicula.toString()));

        // Marcar una película como activa.
        System.out.println();
        System.out.println("<<<<<------------------------------------------------------------>>>>>");
        System.out.println("<<<<<---  Marcar la película con identificador 8 como activa  --->>>>>");
        System.out.println("<<<<<------------------------------------------------------------>>>>>");
        gestorPelicula.marcarPeliculaComoDisponible(8);
        System.out.println(pelicula8.toString());


    }
}