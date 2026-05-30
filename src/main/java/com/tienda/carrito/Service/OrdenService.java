package com.tienda.carrito.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.carrito.Model.Orden;
import com.tienda.carrito.Repository.OrdenRepository;

@Service
public class OrdenService {

    @Autowired
    private OrdenRepository ordenRepository;

    public Orden crearOrden(Double total) {

        Orden orden = new Orden();

        orden.setTotal(total);
        orden.setEstado("PENDIENTE");

        return ordenRepository.save(orden);
    }
}