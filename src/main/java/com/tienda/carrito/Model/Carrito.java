package com.tienda.carrito.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "carrito")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Carrito() {}

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }
}