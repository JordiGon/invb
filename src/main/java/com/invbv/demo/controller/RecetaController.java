package com.invbv.demo.controller;


import com.invbv.demo.model.DetallePedido;
import com.invbv.demo.model.Receta;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.RecetaSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/receta")
@CrossOrigin("*")
public class RecetaController {

    @Autowired
    RecetaSvc recetaSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {

        return recetaSvc.findAll();
    }


    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi guardarReceta(@RequestBody Receta receta) {

        return recetaSvc.guardarReceta(receta);
    }

    @PutMapping(value = "/changeReceta/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi changeReceta (@RequestBody Receta receta , @PathVariable("id") int id){
        return recetaSvc.changeReceta(receta ,id);
    }
}
