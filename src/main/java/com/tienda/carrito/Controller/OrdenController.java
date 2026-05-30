package com.tienda.carrito.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tienda.carrito.DTO.OrdenDTO;
import com.tienda.carrito.Model.Orden;
import com.tienda.carrito.Service.OrdenService;

@RestController
@RequestMapping("/orden")
public class OrdenController {

    @Autowired
    private OrdenService ordenService;

    @PostMapping("/crear")
    public Orden crearOrden(@RequestBody OrdenDTO dto) {

        return ordenService.crearOrden(100.0);
    }
}