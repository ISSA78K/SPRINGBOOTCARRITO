package com.tienda.carrito.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.carrito.Service.PagoStrategy.PagoPaypal;
import com.tienda.carrito.Service.PagoStrategy.PagoStrategy;
import com.tienda.carrito.Service.PagoStrategy.PagoTarjeta;
import com.tienda.carrito.Service.PagoStrategy.PagoTransferencia;

@Service
public class PagoService {

    @Autowired
    private PagoTarjeta tarjeta;

    @Autowired
    private PagoPaypal paypal;

    @Autowired
    private PagoTransferencia transferencia;

    public String pagar(String metodo, Double monto) {

        PagoStrategy strategy;

        switch (metodo.toLowerCase()) {

            case "tarjeta":
                strategy = tarjeta;
                break;

            case "paypal":
                strategy = paypal;
                break;

            default:
                strategy = transferencia;
                break;
        }

        return strategy.procesarPago(monto);
    }
}