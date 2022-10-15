package com.invbv.demo.controller;

import com.invbv.demo.model.Cargo;
import com.invbv.demo.model.CategoriaSuministro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi guardarUsuario(@RequestBody Cargo cargo) {

        return cargoSvc.addCargo(cargo);
    }
}
