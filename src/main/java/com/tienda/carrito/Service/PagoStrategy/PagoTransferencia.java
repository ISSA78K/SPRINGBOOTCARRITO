package com.tienda.carrito.Service.PagoStrategy;

import org.springframework.stereotype.Component;

@Component
public class PagoTransferencia implements PagoStrategy {

    @Override
    public String procesarPago(Double monto) {

        return "Pago con Transferencia realizado por Q." + monto;
    }
}