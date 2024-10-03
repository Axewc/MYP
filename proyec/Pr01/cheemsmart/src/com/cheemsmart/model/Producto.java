package com.cheemsmart.model;

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

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return nombre + " - " + departamento + ": $" + precio;
    }
}
