package com.tienda.carrito.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tienda.carrito.DTO.PagoDTO;
import com.tienda.carrito.Service.PagoService;

@RestController
@RequestMapping("/pago")
public class PagoController {

    @Autowired
    private PagoService pagoService;

    @PostMapping("/realizar")
    public String realizarPago(@RequestBody PagoDTO dto) {

        return pagoService.pagar(
                dto.getMetodoPago(),
                100.0
        );
    }
}