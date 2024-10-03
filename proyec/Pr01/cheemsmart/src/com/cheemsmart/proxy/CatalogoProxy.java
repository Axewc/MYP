package com.cheemsmart.proxy;

import com.cheemsmart.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class CatalogoProxy {
    private List<Producto> catalogo;

    public CatalogoProxy() {
        this.catalogo = new ArrayList<>();
        cargarCatalogo(); // Simula la carga remota desde el servidor
    }

    private void cargarCatalogo() {
        catalogo.add(new Producto("12345", "Refrigerador", "Electrodomésticos", 8000.0));
        catalogo.add(new Producto("67890", "TV", "Electrónica", 12000.0));
        catalogo.add(new Producto("54321", "Arroz", "Alimentos", 50.0));
    }

    public List<Producto> obtenerCatalogo() {
        return catalogo; // El proxy controla el acceso
    }
}
