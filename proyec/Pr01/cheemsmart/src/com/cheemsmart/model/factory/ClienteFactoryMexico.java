package com.cheemsmart.model.factory;

import com.cheemsmart.view.ClienteView;
import com.cheemsmart.view.ClienteViewMexico;

public class ClienteFactoryMexico extends AbstractClienteFactory {
    @Override
    public ClienteView crearClienteView() {
        return new ClienteViewMexico();
    }
}
