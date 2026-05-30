package com.tienda.carrito.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.carrito.Model.Producto;
import com.tienda.carrito.Repository.ProductoRepository;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public List<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }

    public Producto obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }
}