package com.cheemsmart.strategy;

public class PortuguesBrasilStrategy implements IdiomaStrategy {

    @Override

    public String saludar() {
        return "Olá! Bem-vindo ao CheemsMart.";
    }

    @Override

    public String despedir() {
        return "Obrigado pela sua compra!";
    }

    @Override

    public String mostrarMenu() {
        return "1. Ver catálogo\n2. Fazer compra\n3. Sair";
    }

    @Override

    public String confirmarCompra() {
        return "Sua compra foi confirmada.";
    }

    @Override

    public String obtenerFechaEntrega() {
        return "Seu pedido chegará em 5 dias.";
    }

}