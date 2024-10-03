package com.cheemsmart.strategy;

import com.cheemsmart.model.Producto;

public class MexicoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(Producto producto) {
        if (producto.getDepartamento().equalsIgnoreCase("electrodomésticos")) {
            return producto.getPrecio() * 0.75; // 25% de descuento
        }
        return producto.getPrecio();
    }
}
