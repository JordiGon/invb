package com.invbv.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.MediaType;

import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.ICargoSvc;

@RestController
@RequestMapping("/cargo")
public class CargoController {
    @Autowired
    private ICargoSvc cargoSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {
        return cargoSvc.findAll();
    }
}
