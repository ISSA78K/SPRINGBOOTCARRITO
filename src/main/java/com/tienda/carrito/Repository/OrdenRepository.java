package com.tienda.carrito.Repository;

import com.tienda.carrito.Model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository
        extends JpaRepository<Orden, Long> {
}