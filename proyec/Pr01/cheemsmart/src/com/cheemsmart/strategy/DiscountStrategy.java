package com.cheemsmart.strategy;

import com.cheemsmart.model.Producto;

/**
 * Interfaz que define el comportamiento de descuento de un producto.
 */
public interface DiscountStrategy {
    double applyDiscount(Producto producto);
}
