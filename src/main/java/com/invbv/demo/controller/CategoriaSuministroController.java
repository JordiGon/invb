/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.controller;

import com.invbv.demo.model.CategoriaSuministro;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.CategoriaSuministroSvc;
import com.invbv.demo.svc.inter.TipoSuministroSvc;
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
@RequestMapping("/categoriasuministro")
public class CategoriaSuministroController {

    @Autowired
    CategoriaSuministroSvc catSumSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {
        return catSumSvc.findAll();
    }

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi guardarUsuario(@RequestBody CategoriaSuministro catSum) {

        return catSumSvc.addsala(catSum);
    }

    @GetMapping(value = "get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi getCateCategoriaSuministro(@PathVariable("id") Integer id) {
        return catSumSvc.getCategoriaSuministro(id);
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi deleteCateCategoriaSuministro(@PathVariable("id") Integer id) {
        return catSumSvc.deleteCategoriaSuministro(id);
    }

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public responseApi createCateCategoriaSuministro(@RequestBody CategoriaSuministro categoriaSuministro) {
        return catSumSvc.addsala(categoriaSuministro);
    }

    @PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public responseApi updateCateCategoriaSuministro(@RequestBody CategoriaSuministro categoriaSuministro) {
        return catSumSvc.updateCategoriaSuministro(categoriaSuministro);
    }
}
