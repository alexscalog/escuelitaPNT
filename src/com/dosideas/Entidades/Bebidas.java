package com.dosideas.Entidades;

public class Bebidas extends Producto {

    public Bebidas() {
        super();
    }

    public Bebidas(String nombre, double contenido, int precio) {
        super(nombre, contenido, precio);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Litros: " + contenido + " /// Precio: $" + precio;
    }

}
