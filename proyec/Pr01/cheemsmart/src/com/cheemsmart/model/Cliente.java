package com.cheemsmart.model;

public class Cliente {
    private String nombreUsuario;
    private String contraseña;
    private String nombre;
    private String telefono;
    private String direccion;
    private String cuentaBancaria;
    private String paisOrigen;
    private double saldo;

    public Cliente(String nombreUsuario, String contraseña, String nombre, String telefono, String direccion, String cuentaBancaria, String paisOrigen, double saldo) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cuentaBancaria = cuentaBancaria;
        this.paisOrigen = paisOrigen;
        this.saldo = saldo;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
