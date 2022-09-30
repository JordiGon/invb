package com.invbv.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.impl.UbicacionesIndexImplSvc;

@RestController
@RequestMapping(path = "/ubicacionesindex")
public class UbicacionesIndexController {

    @Autowired
    UbicacionesIndexImplSvc ubicacionesiSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {

        return ubicacionesiSvc.findAllUbicacionesI();
    }
}
