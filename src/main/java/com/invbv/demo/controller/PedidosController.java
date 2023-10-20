package com.invbv.demo.controller;

import com.invbv.demo.model.DetallePedido;
import com.invbv.demo.model.Pedidos;
import com.invbv.demo.model.Producto;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.PedidosSvc;
import com.invbv.demo.svc.inter.ProductoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
@CrossOrigin("*")
public class PedidosController {

    @Autowired
    PedidosSvc pedidosSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {

        return pedidosSvc.findAll();
    }


    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi guardarPedido(@RequestBody Pedidos pedidos) {

        return pedidosSvc.guardarPedido(pedidos);
    }

    @PutMapping(value = "/changePedido/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi changePedido (@RequestBody Pedidos pedidos , @PathVariable("id") int id){
        return pedidosSvc.changePedido(pedidos ,id);
    }


}
