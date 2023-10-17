package com.invbv.demo.controller;


import com.invbv.demo.model.Producto;
import com.invbv.demo.model.Rol;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.RolSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rol")
@CrossOrigin("*")
public class RolController {

    @Autowired
    RolSvc rolSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {

        return rolSvc.findAll();
    }

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi guardarRol(@RequestBody Rol rol) {

        return rolSvc.addRol(rol);
    }
}
