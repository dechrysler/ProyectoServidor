package com.spring.proyecto.demo;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name="pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "precio_total")
    private double precio_total;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "preparado")
    private boolean preparado;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isPreparado() {
        return preparado;
    }

    public void setPreparado(boolean preparado) {
        this.preparado = preparado;
    }
}