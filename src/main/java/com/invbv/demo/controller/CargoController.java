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

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi guardarUsuario(@RequestBody Cargo cargo) {

        return cargoSvc.addCargo(cargo);
    }

    @GetMapping(value = "get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi getCargo(@PathVariable("id") Integer id) {
        return cargoSvc.getCargo(id);
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi deleteCargo(@PathVariable("id") Integer id) {
        return cargoSvc.deleteCargo(id);
    }

    @PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public responseApi updateCargo(@RequestBody Cargo Cargo) {
        return cargoSvc.updateCargo(Cargo);
    }

}
