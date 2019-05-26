package com.spring.proyecto.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PedidoRepository extends CrudRepository<Pedido,String> {
    List<Pedido> findAll();

}
