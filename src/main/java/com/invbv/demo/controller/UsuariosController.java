package com.invbv.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
