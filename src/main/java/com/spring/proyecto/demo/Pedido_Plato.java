package com.spring.proyecto.demo;

import javax.persistence.*;

@Entity
@Table(name="pedido_plato")
public class Pedido_Plato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "id_pedido")
    private long id_pedido;

    @Column(name = "id_plato")
    private long id_plato;

    public long getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(long id_pedido) {
        this.id_pedido = id_pedido;
    }

    public long getId_plato() {
        return id_plato;
    }

    public void setId_plato(long id_plato) {
        this.id_plato = id_plato;
    }
}