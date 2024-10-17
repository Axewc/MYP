package com.cheemsmart.model;

/**
 * Clase que representa un cliente de CheemsMart.
 */
public class Cliente {
    private String nombreUsuario;
    private String contraseña;
    private String nombre;
    private String telefono;
    private String direccion;
    private String cuentaBancaria;
    private String paisOrigen;
    private double saldo;

    /**
     * Constructor de la clase Cliente.
     * @param nombreUsuario
     * @param contraseña
     * @param nombre
     * @param telefono
     * @param direccion
     * @param cuentaBancaria
     * @param paisOrigen
     * @param saldo
     */
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

    /**
     * Obtiene el pais de origen del cliente
     * @return paisOrigen
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * Obtiene la cuenta bancaria del cliente
     * @return cuentaBancaria
     */
    public String getCuentaBancaria() {
        return cuentaBancaria;
    }


    /**
     * Obtiene el nombre del cliente
     * @return nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }


    /**
     * Obtiene la contraseña del cliente
     * @return contraseña
     */
    public String getContraseña() {
        return contraseña;
    }


    /**
     * Obtiene el saldo del cliente
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo del cliente.
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
