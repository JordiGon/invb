/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.controller;

import com.invbv.demo.model.Suministros;
import com.invbv.demo.model.TipoMovimiento;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.SuministroSvc;
import com.invbv.demo.svc.inter.TipoMovimientoSvc;
import com.invbv.demo.svc.inter.TipoSuministroSvc;
import com.invbv.demo.svc.inter.UbicacionSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Andres Solorzano
 */
@RestController
@RequestMapping("/tipomovimiento")
public class TipoMovimientoController {

    @Autowired
    TipoMovimientoSvc tipoMovimientoSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {

        return tipoMovimientoSvc.findAllStatus();
    }

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi guardarUsuario(@RequestBody TipoMovimiento tipoMovimiento) {

        return tipoMovimientoSvc.addTipoMov(tipoMovimiento);
    }

}
