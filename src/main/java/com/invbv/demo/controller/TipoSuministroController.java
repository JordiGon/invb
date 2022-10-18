/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.controller;

import com.invbv.demo.model.TipoMovimiento;
import com.invbv.demo.model.TipoSuministro;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.TipoSuministroSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Andres Solorzano
 */
@RestController
@RequestMapping("/tiposuministro")
public class TipoSuministroController {

    @Autowired
    TipoSuministroSvc tipoSumsvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {

        return tipoSumsvc.findAll();
    }

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi guardarUsuario(@RequestBody TipoSuministro tipoSuministro) {

        return tipoSumsvc.addTipoSum(tipoSuministro);
    }

    @GetMapping(value = "get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi getTipoSumTipoSuministro(@PathVariable("id") Integer id) {
        return tipoSumsvc.getTipoSuministro(id);
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi deleteTipoSumTipoSuministro(@PathVariable("id") Integer id) {
        return tipoSumsvc.deleteTipoSuministro(id);
    }

    @PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public responseApi updateTipoSumTipoSuministro(@RequestBody TipoSuministro suministro) {
        return tipoSumsvc.updateTipoSuministro(suministro);
    }

}
