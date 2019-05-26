package com.spring.proyecto.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlatoControler {
    @Autowired
    private PlatoRepository repository;

    @RequestMapping("/platos_hamburguesa")
    public List<Plato> getPlatos() {

        List<Plato> listaHamburguesa = repository.findByTipo("hamburguesa");
        return listaHamburguesa;
    }
    @RequestMapping("/platos_pasta")
    public List<Plato> getPasta(String tipo) {

        List<Plato> listaPasta = repository.findByTipo("pasta");
        return listaPasta;
    }
    @RequestMapping("/platos_ensalada")
    public List<Plato> getEnsalada(String tipo) {

        List<Plato> listEnsalada = repository.findByTipo("ensalada");
        return listEnsalada;
    }
    @RequestMapping("/platos_entrante")
    public List<Plato> getEntrantes(String tipo) {

        List<Plato> listEntrante = repository.findByTipo("entrante");
        return listEntrante;
    }
    @RequestMapping("/platos_bebida")
    public List<Plato> getBebidas(String tipo) {

        List<Plato> listBebidas = repository.findByTipo("bebida");
        return listBebidas;
    }
    @RequestMapping("/platos_alaplancha")
    public List<Plato> getAlaPlancha(String tipo) {

        List<Plato> listAlaPlancha = repository.findByTipo("alaplancha");
        return listAlaPlancha;
    }
    @RequestMapping("/platos_postre")
    public List<Plato> getPostre(String tipo) {

        List<Plato> listPostres = repository.findByTipo("postre");
        return listPostres;
    }
}

