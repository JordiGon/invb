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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Andres Solorzano
 */
@RestController
@RequestMapping("/CategoriaSuministro")
public class CategoriaSuministroController {
    
    @Autowired
    CategoriaSuministroSvc catSumSvc;
    
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {
        return catSumSvc.findAll();
    }
    
    @PostMapping(value = "/save" , produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi guardarUsuario(@RequestBody CategoriaSuministro catSum){
    
        return catSumSvc.addsala(catSum);
    }
    
}
