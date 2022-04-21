package com.dosideas.Entidades;

public class Higiene extends Producto {

    public Higiene() {
        super();
    }

    public Higiene(String nombre, double contenido, int precio) {
        super(nombre, contenido, precio);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Contenido: " + contenido + "ml /// Precio: $" + precio;
    }
}
