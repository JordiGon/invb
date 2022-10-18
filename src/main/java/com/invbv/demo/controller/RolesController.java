/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.controller;

import com.invbv.demo.model.Estado;
import com.invbv.demo.model.Roles;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.RolSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Andres Solorzano
 */
@RestController
@RequestMapping("/roles")
public class RolesController {

    @Autowired
    RolSvc rolSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {

        return rolSvc.findAllStatus();
    }

    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi guardarUsuario(@RequestBody Roles roles) {

        return rolSvc.addRoles(roles);
    }

}
