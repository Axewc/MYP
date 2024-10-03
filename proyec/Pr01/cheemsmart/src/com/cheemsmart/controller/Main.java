package com.cheemsmart.controller;

import com.cheemsmart.model.Cliente;

/**
 * Clase principal de la aplicación.
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("usuario1", "contraseña1", "Juan Pérez", "1234567890", "Calle Falsa 123",
                "0987654321", "México", 10000.0);
        CheemsMartController controller = new CheemsMartController();
        controller.iniciarSesion(cliente);
    }
}
