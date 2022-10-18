/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.controller;

import com.invbv.demo.model.CategoriaSuministro;
import com.invbv.demo.model.Estado;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.EstadoSvc;
import com.invbv.demo.svc.inter.ICargoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Andres Solorzano
 */
@RestController
@RequestMapping("/estado")
public class EstadoController {
    @Autowired
    private EstadoSvc estadoSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {
        return estadoSvc.findAllStatus();
    }

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi guardarUsuario(@RequestBody Estado estado) {

        return estadoSvc.addEstado(estado);
    }

    @GetMapping(value = "get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi getEstado(@PathVariable("id") Integer id) {
        return estadoSvc.getEstado(id);
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi deleteEstado(@PathVariable("id") Integer id) {
        return estadoSvc.deleteEstado(id);
    }

    @PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public responseApi updateEstado(@RequestBody Estado Estado) {
        return estadoSvc.updateEstado(Estado);
    }

}
