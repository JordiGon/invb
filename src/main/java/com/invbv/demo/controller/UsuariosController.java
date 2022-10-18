package com.invbv.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invbv.demo.model.Usuarios;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.impl.UsuariosSvcImpl;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuariosController {
    @Autowired
    UsuariosSvcImpl usuariosSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {
        return usuariosSvc.findAllUsuarios();
    }

    @GetMapping(value = "get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi getUsuarios(@PathVariable("id") Integer id) {
        return usuariosSvc.getUsuarios(id);
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi deleteUsuarios(@PathVariable("id") Integer id) {
        return usuariosSvc.deleteUsuarios(id);
    }

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public responseApi createUsuarios(@RequestBody Usuarios Usuarios) {
        return usuariosSvc.createUsuarios(Usuarios);
    }

    @PutMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public responseApi updateUsuarios(@RequestBody Usuarios Usuarios) {
        return usuariosSvc.updateUsuarios(Usuarios);
    }
}
