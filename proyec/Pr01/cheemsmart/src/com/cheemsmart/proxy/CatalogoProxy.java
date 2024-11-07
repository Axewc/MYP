package com.cheemsmart.proxy;

import com.cheemsmart.model.Producto;

import java.util.ArrayList;
import java.util.List;

/**
 * Proxy para el catálogo de productos de CheemsMart.
 * Controla el acceso al catálogo.
 */
public class CatalogoProxy {
    private List<Producto> catalogo;


    /**
     * Constructor del proxy del catálogo.
     */
    public CatalogoProxy() {
        this.catalogo = new ArrayList<>();
        cargarCatalogo(); // Simula la carga remota desde el servidor
    }

    /**
     * Carga el catálogo de productos.
     */
    private void cargarCatalogo() {
        catalogo.add(new Producto("12345", "Refrigerador", "Electrodomésticos", 8000.0));
        catalogo.add(new Producto("67890", "TV", "Electrónica", 12000.0));
        catalogo.add(new Producto("54321", "Arroz", "Alimentos", 50.0));
    }
    
    /**
     * Obtiene el catálogo de productos.
     * @return Catálogo de productos.
     */
    public List<Producto> obtenerCatalogo() {
        return catalogo; // El proxy controla el acceso
    }
}
