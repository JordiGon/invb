package com.invbv.demo.controller;

import com.invbv.demo.model.Producto;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.PedidosSvc;
import com.invbv.demo.svc.inter.ProductoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

    @Autowired
    PedidosSvc pedidosSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {

        return pedidosSvc.findAll();
    }


}
