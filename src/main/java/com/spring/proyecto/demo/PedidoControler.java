package com.spring.proyecto.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class PedidoControler {
    @Autowired
    private PedidoRepository repository;
    @Autowired
    private Pedido_PlatoRepository repositorio;
    @RequestMapping("/pedidos")
    public List<Pedido> getPedidos() {

        List<Pedido> todosPedidos = repository.findAll();
        return todosPedidos;
    }

    @RequestMapping("/add_pedido")
    public void addPedido(@RequestParam(value = "precioTotal") String precio,
                           @RequestParam(value = "fecha" ) String fecha,
                           @RequestParam(value = "preparado") String preparado,
                          @RequestParam(value = "lista")String list,
                                      @RequestParam(value = "numero")String numero) {

        Pedido opinion = new Pedido();
        opinion.setPrecio_total(Double.valueOf(precio));
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        opinion.setFecha(sqlDate);
        opinion.setPreparado(false);
        String[]lista= list.split(",");
    for (String id : lista){
        Pedido_Plato ar= new Pedido_Plato();
        ar.setId_pedido(Integer.parseInt(numero));
        ar.setId_plato(Integer.parseInt(id));
        repositorio.save(ar);
    }
        repository.save(opinion);
    }
}
