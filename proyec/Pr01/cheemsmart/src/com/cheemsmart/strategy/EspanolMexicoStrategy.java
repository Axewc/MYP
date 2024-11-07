package com.cheemsmart.strategy;

public class EspanolMexicoStrategy implements IdiomaStrategy {

    @Override

    public String saludar() {
        return "¡Hola! Bienvenido a CheemsMart.";
    }

    @Override

    public String despedir() {
        return "¡Gracias por su compra!";
    }

    @Override

    public String mostrarMenu() {
        return "1. Ver catálogo\n2. Realizar compra\n3. Salir";
    }

    @Override

    public String confirmarCompra() {
        return "Su compra ha sido confirmada.";
    }

    @Override

    public String obtenerFechaEntrega() {
        return "Su pedido llegará en 5 días.";
    }

}