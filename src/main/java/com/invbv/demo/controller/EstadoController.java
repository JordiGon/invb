package com.invbv.demo.controller;

import com.invbv.demo.model.Ingredientes;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.EstadoSvc;
import com.invbv.demo.svc.inter.IngredientesSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estado")
public class EstadoController {

    @Autowired
    EstadoSvc estadoSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {

        return estadoSvc.findAll();
    }
}
