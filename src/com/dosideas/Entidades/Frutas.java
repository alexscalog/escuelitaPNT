package com.dosideas.Entidades;

public class Frutas extends Producto {

    private String unidadVenta;

    public Frutas() {
        super();
    }

    public Frutas(String nombre, double contenido, int precio, String unidadVenta) {
        super(nombre, contenido, precio);
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Precio: $" + precio + " /// Unidad de venta: " + unidadVenta;
    }

}
