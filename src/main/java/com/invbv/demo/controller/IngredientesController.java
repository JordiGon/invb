package com.invbv.demo.controller;

import com.invbv.demo.model.Ingredientes;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.IngredientesSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ingredientes")
public class IngredientesController {

    @Autowired
    IngredientesSvc ingredientesSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {

        return ingredientesSvc.findAll();
    }

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi saveIngredient(@RequestBody Ingredientes ingredientes) {

        return ingredientesSvc.saveIngredient(ingredientes);
    }

    @GetMapping(value = "/findIngredient/{name}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findIngredient (@PathVariable("name") String name){
        return ingredientesSvc.findIngredient(name);
    }
}
