package com.cheemsmart.controller;

import com.cheemsmart.model.Cliente;
import com.cheemsmart.proxy.CatalogoProxy;
import com.cheemsmart.strategy.DiscountStrategy;
import com.cheemsmart.strategy.MexicoDiscountStrategy;
import com.cheemsmart.view.ClienteView;
import com.cheemsmart.model.Producto;

import java.util.Scanner;

public class CheemsMartController {
    private Cliente clienteActual;
    private CatalogoProxy catalogoProxy;

    public CheemsMartController() {
        this.catalogoProxy = new CatalogoProxy();
    }

    public void iniciarSesion(Cliente cliente) {
        this.clienteActual = cliente;
        // Selección de estrategia según el país del cliente
        DiscountStrategy discountStrategy = new MexicoDiscountStrategy(); // Ejemplo para México

        ClienteView view = new com.cheemsmart.view.ClienteViewMexico();
        view.mostrarSaludo();
        mostrarMenu(discountStrategy);
    }

    private void mostrarMenu(DiscountStrategy discountStrategy) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Ver catálogo");
            System.out.println("2. Realizar compra");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    catalogoProxy.obtenerCatalogo().forEach(System.out::println);
                    break;
                case 2:
                    realizarCompra(discountStrategy);
                    break;
                case 3:
                    System.out.println("Gracias por visitar CheemsMart. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }

    private void realizarCompra(DiscountStrategy discountStrategy) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número del producto que desea comprar:");
        int index = scanner.nextInt() - 1;

        if (index >= 0 && index < catalogoProxy.obtenerCatalogo().size()) {
            Producto producto = catalogoProxy.obtenerCatalogo().get(index);
            double precioConDescuento = discountStrategy.applyDiscount(producto);

            if (clienteActual.getSaldo() >= precioConDescuento) {
                clienteActual.setSaldo(clienteActual.getSaldo() - precioConDescuento);
                System.out.println("Compra exitosa. Se ha descontado " + precioConDescuento + " de su saldo.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
