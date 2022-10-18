package com.invbv.demo.svc.impl;

import java.util.List;
import java.util.Optional;

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

    @Override
    public responseApi getUsuarios(Integer id) {
        try {

            Optional<Usuarios> Usuarios = usuariosDao.getUsuarios(id);

            return new responseApi(200, "Success Query", Usuarios);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi deleteUsuarios(Integer id) {
        try {
            Optional<Usuarios> Usuarios = usuariosDao.deleteUsuarios(id);

            return new responseApi(200, "Success Query", Usuarios);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi createUsuarios(Usuarios Usuarios) {
        try {

            Usuarios aux = usuariosDao.createUsuarios(Usuarios);

            return new responseApi(200, "Success Query", aux);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi updateUsuarios(Usuarios Usuarios) {

        try {

            Usuarios aux = usuariosDao.updateUsuarios(Usuarios);
            return new responseApi(200, "Success Query", aux);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

}
