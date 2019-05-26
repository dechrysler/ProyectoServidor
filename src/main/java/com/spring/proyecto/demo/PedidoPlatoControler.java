package com.spring.proyecto.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoPlatoControler {
    @Autowired
    private Pedido_PlatoRepository repositorio;
}
