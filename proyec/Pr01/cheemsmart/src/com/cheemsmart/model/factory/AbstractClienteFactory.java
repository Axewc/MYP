package com.cheemsmart.model.factory;

import com.cheemsmart.view.ClienteView;

/**
 * Fábrica abstracta para crear instancias de ClienteView.
 */
public abstract class AbstractClienteFactory {
    public abstract ClienteView crearClienteView();
}
