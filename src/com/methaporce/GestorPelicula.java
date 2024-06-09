package com.methaporce;

import com.methaporce.modelo.Pelicula;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Creamos la clase GestorPelicula que contiene una lista(colección) de películas implementando la Interface.
public class GestorPelicula implements GestorPeliculaI {   //Implementamos los metodos declarados en la Interfaz GestorPeliculaI


    //Creamos la variable para la lista de películas completa
    private List<Pelicula> peliculas;
    public GestorPelicula() {
        this.peliculas = new ArrayList<>();  //Arreglo Inmutable
    }

    //Creación de métodos
    //Creación agregarPelicula()
    @Override  //Como nota: recordar que el @Override es para heredar los metodos de la clase padre interfaz GestorPeliculaI
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    //Creación eliminarPelicula()
    @Override
    public void eliminarPelicula(int id) {    //Nota: void es el tipo de retorno
        for (Iterator<Pelicula> iterator = peliculas.iterator(); iterator.hasNext(); ) {   //Bucle for   :itera sobre la lista de peliculas utilizando un iterador.
            Pelicula pelicula = iterator.next();                                           //El iterador recorre la lista elemento por elemento.
            if (pelicula.getId() == id) {                                                  //La condicion del bucle "iterator.hasNext()" verifica si hay mas elementos
                iterator.remove();                                                         //en la lista antes de continuar con la siguiente iteracion.
                break;                                                             //if  :Esta sentencia condicional verifica si el ID de la película actual (pelicula.getId())
            }                                                                      //     coincide con el ID proporcionado como parámetro (id).
        }                                                                          //iterator.remove();  :Si la condición del if se cumple, esta línea elimina la película
    }                                                                              //                     actual de la lista utilizando el método remove() del iterador.
                                                                                   //break;  :Esta sentencia break termina el bucle for una vez que se encuentra la película con el ID coincidente y se elimina.


    //Creación obtenerPeliculas()
    @Override
    public List<Pelicula> obtenerPeliculas() {
        return peliculas;
    }


    //Creación obtenerPeliculasDisponibles()
    @Override
    public List<Pelicula> obtenerPeliculasDisponibles() {                         //Es muy parecido
        List<Pelicula> peliculasDisponibles = new ArrayList<>();                  //Se crea el bucle for para retornar las peliculas disponibles,
        for (Pelicula pelicula : peliculas) {                                     //una vez obtenidas con el get
            if (pelicula.getDisponible()) {
                peliculasDisponibles.add(pelicula);
            }
        }
        return peliculasDisponibles;
    }

    //Creación obtenerPeliculasNoDisponibles()
    @Override
    public List<Pelicula> obtenerPeliculasNoDisponibles() {
        List<Pelicula> peliculasNoDisponibles = new ArrayList<>();                //Igual al metodo obtener peliculas disponibles
        for (Pelicula pelicula : peliculas) {                                     //con la diferencia que retornará las peliculas con atributo "false"
            if (!pelicula.getDisponible()) {
                peliculasNoDisponibles.add(pelicula);
            }
        }
        return peliculasNoDisponibles;
    }

    //Creación marcarPeliculaComoDisponible()
    @Override
    public void marcarPeliculaComoDisponible(int id) {                           //Muy parecido con la diferencia que indicamos la peli marcada
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId() == id) {
                pelicula.setDisponible(true);
                break;
            }
        }
    }

}

