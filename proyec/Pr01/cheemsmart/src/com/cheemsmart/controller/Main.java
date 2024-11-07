package com.cheemsmart.controller;

import com.cheemsmart.model.Cliente;
import com.cheemsmart.strategy.EspanolMexicoStrategy;
import com.cheemsmart.strategy.InglesStrategy;
import com.cheemsmart.strategy.PortuguesBrasilStrategy;

/**
 * Clase principal de la aplicación.
 */
public class Main {
    /**
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente("usuario1", "contraseña1", "Juan Pérez", "1234567890", "Calle Falsa 123",
                    "0987654321", "México", 10000.0);
            CheemsMartController controller = new CheemsMartController();
            TiendaVirtual tienda = new TiendaVirtual();
            controller.iniciarSesion(cliente);

            // Verificamos el pais de origen del cliente, si es mexicano, se le asigna el idioma
            // correspondiente, en este caso, español de México.
            switch (cliente.getPaisOrigen()) {
                case "México":
                    tienda.setIdioma(new EspanolMexicoStrategy());
                    break;
                case "Estados Unidos":
                    tienda.setIdioma(new InglesStrategy());
                    break;
                case "Brasil":
                    tienda.setIdioma(new PortuguesBrasilStrategy());
                    break;
                default:
                    tienda.setIdioma(new EspanolMexicoStrategy());
                    break;
            }
            tienda.mostrarInterfaz();
            tienda.confirmarCompra();
            tienda.salir();
        } catch (Exception e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
 */

    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente("usuario1", "contraseña1", "Juan Pérez", "1234567890", "Calle Falsa 123",
                    "0987654321", "México", 10000.0);
            CheemsMartController controller = new CheemsMartController();
            TiendaVirtual tienda = new TiendaVirtual();
            controller.iniciarSesion(cliente);

            // Verificamos el pais de origen del cliente, si es mexicano, se le asigna el idioma
            // correspondiente, en este caso, español de México.
            switch (cliente.getPaisOrigen()) {
                case "México":
                    tienda.setIdioma(new EspanolMexicoStrategy());
                    break;
                case "Estados Unidos":
                    tienda.setIdioma(new InglesStrategy());
                    break;
                case "Brasil":
                    tienda.setIdioma(new PortuguesBrasilStrategy());
                    break;
                default:
                    tienda.setIdioma(new EspanolMexicoStrategy());
                    break;
            }
            tienda.mostrarInterfaz();
            tienda.confirmarCompra();
            tienda.salir();
        } catch (Exception e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}