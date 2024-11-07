package com.cheemsmart.controller;

import com.cheemsmart.strategy.IdiomaStrategy;
public class TiendaVirtual {

    private IdiomaStrategy idioma;

    public void setIdioma(IdiomaStrategy idioma) {

        this.idioma = idioma;

    }

    public void mostrarInterfaz() {

        System.out.println(idioma.saludar());

        System.out.println(idioma.mostrarMenu());

    }

    public void confirmarCompra() {

        System.out.println(idioma.confirmarCompra());

        System.out.println(idioma.obtenerFechaEntrega());

    }

    public void salir() {

        System.out.println(idioma.despedir());

    }

}