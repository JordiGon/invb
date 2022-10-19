package com.invbv.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.InventarioSvc;

@RestController
@RequestMapping("/inventario")
public class InventarioController {
    @Autowired
    InventarioSvc inventarioSvc;

    @PostMapping(value = "/update/{inventario}/{cantidad}/{estado}", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi updateInventario(
            @PathVariable(name = "inventario") Integer id_inventario,
            @PathVariable(name = "cantidad") Integer cantidad,
            @PathVariable(name = "estado") Integer estado) {
        return inventarioSvc.updateEstado(id_inventario, cantidad, estado);
    }

}
