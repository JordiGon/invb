package com.invbv.demo.controller;

import com.invbv.demo.model.Cargo;
import com.invbv.demo.model.CategoriaSuministro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.ICargoSvc;
import com.invbv.demo.util.CargoPDF;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

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
    
    @GetMapping(value = "/all/export", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi exportToPdf(HttpServletResponse response) throws IOException {
        
        return cargoSvc.cargoPdf(response);
        
    }
}
