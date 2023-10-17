package com.invbv.demo.controller;



import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.SucursalSvc;
import com.invbv.demo.svc.inter.UsuariosSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuariosController {

    @Autowired
    UsuariosSvc usuariosSvc;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findAll() {

        return usuariosSvc.findAll();
    }

    @GetMapping(value = "/login/username/{name}/password/{password}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public responseApi findProduct (@PathVariable("name") String name , @PathVariable("password") String password){
        return usuariosSvc.findUser(name , password);
    }


}
