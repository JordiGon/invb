package com.invbv.demo.svc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.impl.UsuariosDaoImpl;
import com.invbv.demo.model.Usuarios;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.UsuariosSvc;

@Service
public class UsuariosSvcImpl implements UsuariosSvc {

    @Autowired
    UsuariosDaoImpl usuariosDao;

    @Override
    public responseApi findAllUsuarios() {
        try {
            List<Usuarios> users = usuariosDao.findAllUsers();
            return new responseApi(200, "Query was successfull", users);
        } catch (Exception e) {
            return new responseApi(500, "Query was not succesfull", e);
        }
    }

}
