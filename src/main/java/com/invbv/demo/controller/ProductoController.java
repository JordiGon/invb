package com.invbv.demo.controller;

import com.invbv.demo.model.Producto;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.ProductoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producto")

public class ProductoController {

    @Autowired
    ProductoSvc productoSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {

        return productoSvc.findAll();
    }

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi guardarProducto(@RequestBody Producto producto) {

        return productoSvc.addProducto(producto);
    }

    @PutMapping(value = "/changeProduct/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi changeProduct (@RequestBody Producto producto ,  @PathVariable("id") int id){
        return productoSvc.changeProduct(producto ,id);
    }


    @GetMapping(value = "/findProduct/{name}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findProduct (@PathVariable("name") String name){
        return productoSvc.findProduct(name);
    }



}
