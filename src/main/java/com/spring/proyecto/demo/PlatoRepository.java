package com.spring.proyecto.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlatoRepository extends CrudRepository<Plato,String> {
        List<Plato> findAll();
        List<Plato>findByTipo(String tipo);
}
