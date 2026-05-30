package com.tienda.carrito.Service.PagoStrategy;

import org.springframework.stereotype.Component;

@Component
public class PagoTarjeta implements PagoStrategy {

    @Override
    public String procesarPago(Double monto) {

        return "Pago con Tarjeta realizado por Q." + monto;
    }
}