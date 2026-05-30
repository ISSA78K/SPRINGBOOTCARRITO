package com.tienda.carrito.Repository;

import com.tienda.carrito.Model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagoRepository
        extends JpaRepository<Pago, Long> {
}