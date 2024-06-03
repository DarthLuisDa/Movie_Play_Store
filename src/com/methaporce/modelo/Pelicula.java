package com.methaporce.modelo;

//Creamos Clase que representa: una Película.
public class Pelicula {
    private Integer id;   //Atributo: Identificador único, encapsulado como dato privado.

    private String nombre;  //Atributo: Nombre película, encapsulado como dato privado.

    private Boolean disponible;  //Atributo: Indica si está disponible o no, encapsulado como dato privado.

    // Se genera el constructor con los tres atributos de la clase.
    public Pelicula(Integer id, String nombre, Boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    // Se genera un constructor vacío de la clase.
    public Pelicula() {
    }

    // Se generan los getters y setters respectivos de cada atributo de la clase.
    public Integer getId() {          //GET: para obtener
        return id;
    }

    public void setId(Integer id) {
        this.id = id;                 //SET: para colocar
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    //Se genera el toString(), para retornar los atributos de la lista dependiendo del método que se ponga en función.
    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}


