/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.controller;

import com.invbv.demo.model.Roles;
import com.invbv.demo.model.Suministros;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.SuministroSvc;
import com.invbv.demo.svc.inter.TipoSuministroSvc;
import com.invbv.demo.svc.inter.UbicacionSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 *
 * @author Andres Solorzano
 */
@RestController
@RequestMapping("/suministros")
public class SuministroController {

    @Autowired
    SuministroSvc suministroSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {

        return suministroSvc.findAll();
    }

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi guardarUsuario(@RequestBody Suministros suministros) {

        return suministroSvc.addSuministros(suministros);
    }

    @GetMapping(value = "/findTipoSumunistro/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findTipoSumunistro(@PathVariable("id") String name) {
        return suministroSvc.findTipoSumunistro(name);
    }

    @GetMapping(value = "/findEstado/{estado}", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findEstado(@PathVariable("estado") String estado) {
        return suministroSvc.findEstado(estado);
    }

    @GetMapping(value = "/findUbicacion/{ubicacion}", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findUbicacion(@PathVariable("ubicacion") String ubicacion) {
        return suministroSvc.findUbicacion(ubicacion);
    }

    // @PutMapping(value = "/changeStatus/{id}" , produces =
    // MediaType.APPLICATION_JSON_VALUE)
    // public responseApi changeLocation (@RequestBody Suministros suministros ,
    // @PathVariable("id") int id){
    // return suministroSvc.changeStatus(suministros ,id);
    // }
}
