package com.tienda.carrito.Service;

import com.tienda.carrito.Model.*;
import com.tienda.carrito.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoService {

    @Autowired
    private ProductoRepository productoRepo;

    @Autowired
    private ItemCarritoRepository itemRepo;

    @Autowired
    private CarritoRepository carritoRepo;

    // Crear carrito
    public Carrito crearCarrito() {
        return carritoRepo.save(new Carrito());
    }

    // Agregar producto al carrito
    public ItemCarrito agregarProducto(Long carritoId, Long productoId, int cantidad) {

        Producto producto = productoRepo.findById(productoId)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        Carrito carrito = carritoRepo.findById(carritoId)
                .orElseThrow(() -> new RuntimeException("Carrito no encontrado"));

        ItemCarrito item = new ItemCarrito();
        item.setProducto(producto);
        item.setCantidad(cantidad);
        item.setCarrito(carrito);

        return itemRepo.save(item);
    }

    // Ver items del carrito
    public List<ItemCarrito> obtenerItems() {
        return itemRepo.findAll();
    }

    // Calcular total
    public double calcularTotal(Long carritoId) {
        List<ItemCarrito> items = itemRepo.findAll();

        return items.stream()
                .mapToDouble(i -> i.getProducto().getPrecio() * i.getCantidad())
                .sum();
    }

    // Eliminar item
    public void eliminarItem(Long itemId) {
        itemRepo.deleteById(itemId);
    }
}