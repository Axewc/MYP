package com.cheemsmart.model;

/**
 * Clase que representa un producto en el catálogo de CheemsMart.
 */
public class Producto {
    private String codigoBarras;
    private String nombre;
    private String departamento;
    private double precio;

    public Producto(String codigoBarras, String nombre, String departamento, double precio) {
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.departamento = departamento;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del producto.
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del producto.
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene el departamento del producto.
     * @return
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Obtiene el código de barras del producto.
     */
    @Override
    public String toString() {
        return nombre + " - " + departamento + ": $" + precio;
    }
}
