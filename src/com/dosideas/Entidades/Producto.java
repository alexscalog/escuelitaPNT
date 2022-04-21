package com.dosideas.Entidades;

public class Producto implements Comparable<Producto> {

    protected String nombre;
    protected double contenido;
    protected int precio;

    public Producto() {
    }

    public Producto(String nombre, double contenido, int precio) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getContenido() {
        return contenido;
    }

    public void setContenido(double contenido) {
        this.contenido = contenido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto p) {
        return (this.precio > p.precio) ? 1 : -1;

    }

}
