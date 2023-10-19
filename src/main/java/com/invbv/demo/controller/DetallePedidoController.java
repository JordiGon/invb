package com.invbv.demo.controller;

import com.invbv.demo.model.DetallePedido;
import com.invbv.demo.model.Rol;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.DetallePedidoSvc;
import com.invbv.demo.svc.inter.EstadoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/detalle-pedido")
@CrossOrigin("*")
public class DetallePedidoController {

    @Autowired
    DetallePedidoSvc detallePedidoSvc;


    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {

        return detallePedidoSvc.findAll();
    }


    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi guardarDetallePedido(@RequestBody DetallePedido detallePedido) {

        return detallePedidoSvc.adddetallePedido(detallePedido);
    }
}
