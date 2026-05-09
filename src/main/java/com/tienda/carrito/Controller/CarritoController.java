package com.tienda.carrito.Controller;

import com.tienda.carrito.Model.*;
import com.tienda.carrito.Service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrito")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    // Crear carrito
    @PostMapping("/crear")
    public Carrito crearCarrito() {
        return carritoService.crearCarrito();
    }

    // Agregar producto
    @PostMapping("/agregar")
    public ItemCarrito agregar(
            @RequestParam Long carritoId,
            @RequestParam Long productoId,
            @RequestParam int cantidad) {

        return carritoService.agregarProducto(carritoId, productoId, cantidad);
    }

    // Ver carrito
    @GetMapping("/items")
    public List<ItemCarrito> verItems() {
        return carritoService.obtenerItems();
    }

    // Total
    @GetMapping("/total/{carritoId}")
    public double total(@PathVariable Long carritoId) {
        return carritoService.calcularTotal(carritoId);
    }

    // Eliminar
    @DeleteMapping("/eliminar/{itemId}")
    public void eliminar(@PathVariable Long itemId) {
        carritoService.eliminarItem(itemId);
    }
}