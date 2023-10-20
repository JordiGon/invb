package com.invbv.demo.controller;

import com.invbv.demo.model.Receta;
import com.invbv.demo.model.RecetaIngredientes;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.RecetaIngredientesSvc;
import com.invbv.demo.svc.inter.SucursalSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/receta-ingredientes")
@CrossOrigin("*")
public class RecetaIngredientesController {

    @Autowired
    RecetaIngredientesSvc recetaIngredientesSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {

        return recetaIngredientesSvc.findAll();
    }

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi guardarRecetaIngrediente(@RequestBody RecetaIngredientes recetaIngredientes) {

        return recetaIngredientesSvc.guardarRecetaIngrediente(recetaIngredientes);
    }
}
