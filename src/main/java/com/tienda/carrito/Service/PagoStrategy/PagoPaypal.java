package com.tienda.carrito.Service.PagoStrategy;

import org.springframework.stereotype.Component;

@Component
public class PagoPaypal implements PagoStrategy {

    @Override
    public String procesarPago(Double monto) {

        return "Pago con Paypal realizado por Q." + monto;
    }
}