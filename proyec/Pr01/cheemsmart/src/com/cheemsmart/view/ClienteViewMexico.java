package com.cheemsmart.view;

/**
 * Implementación concreta de ClienteView para México.
 */
public class ClienteViewMexico implements ClienteView {

    /**
     * Muestra un saludo en español.
     */
    @Override
    public void mostrarSaludo() {
        System.out.println("¡Bienvenido a CheemsMart, estimado cliente!");
    }
}
