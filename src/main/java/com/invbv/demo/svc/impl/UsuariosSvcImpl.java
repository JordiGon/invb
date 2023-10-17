package com.invbv.demo.svc.impl;

import com.invbv.demo.dao.inter.UsuariosDao;
import com.invbv.demo.model.*;
import com.invbv.demo.svc.inter.UsuariosSvc;

import com.invbv.demo.dao.inter.SucursalDao;
import com.invbv.demo.svc.inter.SucursalSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.swing.text.html.Option;
import com.invbv.demo.model.responseApi;

import java.util.List;

@Service
public class UsuariosSvcImpl implements UsuariosSvc {

    @Autowired
    UsuariosDao usuariosDao;


    @Override
    public responseApi findAll() {
        try {
            List<Usuario> usuarios = usuariosDao.findAll();
            return new responseApi(200, "Success Query", usuarios);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi findUser(String name, String password) {
        try {
            Usuario user = usuariosDao.findUser(name , password);
            return new responseApi(200, "Success Query", user);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }
}
