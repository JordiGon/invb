package com.invbv.demo.controller;

import com.invbv.demo.model.Producto;
import com.invbv.demo.model.Roles;
import com.invbv.demo.model.Suministros;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.ProductoSvc;
import com.invbv.demo.svc.inter.SuministroSvc;
import com.invbv.demo.svc.inter.TipoSuministroSvc;
import com.invbv.demo.svc.inter.UbicacionSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cargo")

public class ProductoController {

    @Autowired
    ProductoSvc productoSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {

        return productoSvc.findAll();
    }

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi guardarUsuario(@RequestBody Producto producto) {

        return productoSvc.addSuministros(producto);
    }

    @GetMapping(value = "/findProducto/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findProducto (@PathVariable("id") String name){
        return productoSvc.findProducto(name);
    }

    @GetMapping(value = "/findEstado/{estado}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findEstado (@PathVariable("estado") String estado){
        return productoSvc.findEstado(estado);
    }

    @GetMapping(value = "/findUbicacion/{ubicacion}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findUbicacion (@PathVariable("ubicacion") String ubicacion){
        return productoSvc.findUbicacion(ubicacion);
    }

    @PutMapping(value = "/changeStatus/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi changeLocation (@RequestBody Producto producto ,  @PathVariable("id") int id){
        return productoSvc.changeStatus(producto ,id);
    }


}
