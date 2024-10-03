package com.cheemsmart.strategy;

import com.cheemsmart.model.Producto;

public interface DiscountStrategy {
    double applyDiscount(Producto producto);
}
