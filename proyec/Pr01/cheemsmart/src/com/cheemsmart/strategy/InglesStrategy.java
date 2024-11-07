package com.cheemsmart.strategy;

public class InglesStrategy implements IdiomaStrategy {

    @Override

    public String saludar() {
        return "Hello! Welcome to CheemsMart.";
    }

    @Override

    public String despedir() {
        return "Thank you for your purchase!";
    }

    @Override

    public String mostrarMenu() {
        return "1. View Catalog\n2. Make a Purchase\n3. Exit";
    }

    @Override

    public String confirmarCompra() {
        return "Your purchase has been confirmed.";
    }

    @Override

    public String obtenerFechaEntrega() {
        return "Your order will arrive in 5 days.";
    }

}