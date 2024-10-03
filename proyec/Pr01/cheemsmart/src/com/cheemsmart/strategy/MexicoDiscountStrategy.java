package com.cheemsmart.strategy;

import com.cheemsmart.model.Producto;

/**
 * Estrategia de descuento para México.
 */
public class MexicoDiscountStrategy implements DiscountStrategy {

    /**
     * Aplica un descuento del 25% a los productos del departamento de electrodomésticos.
     * @param producto Producto al que se le aplicará el descuento.
     * @return Precio con descuento.
     */
    @Override
    public double applyDiscount(Producto producto) {
        if (producto.getDepartamento().equalsIgnoreCase("electrodomésticos")) {
            return producto.getPrecio() * 0.75; // 25% de descuento
        }
        return producto.getPrecio();
    }
}
