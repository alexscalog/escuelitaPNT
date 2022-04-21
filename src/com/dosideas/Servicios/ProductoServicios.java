package com.dosideas.Servicios;

import com.dosideas.Entidades.Bebidas;
import com.dosideas.Entidades.Frutas;
import com.dosideas.Entidades.Higiene;
import com.dosideas.Entidades.Producto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductoServicios {

    private List<Producto> listaProductos = new ArrayList<>();

    public ProductoServicios() {
    }

    public void crearProductos() {
        listaProductos.add(new Bebidas("Coca-Cola Zero", 1.5, 20));
        listaProductos.add(new Bebidas("Coca-Cola", 1.5, 18));
        listaProductos.add(new Higiene("Shampoo Sedal", 500, 19));
        listaProductos.add(new Frutas("Frutillas", 0, 64, "kilo"));
    }

    public void mostrarProductos() {
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }

    public void visualizarBarato() {
        System.out.println("Producto más barato: " + Collections.min(listaProductos).getNombre());

    }

    public void visualizarCaro() {
        System.out.println("Producto más caro: " + Collections.max(listaProductos).getNombre());
    }
}
