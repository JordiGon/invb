package com.invbv.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.inter.UsuariosDao;
import com.invbv.demo.model.Usuarios;
import com.invbv.demo.repository.UsuariosReporsitory;

@Service
public class UsuariosDaoImpl implements UsuariosDao {

    @Autowired
    UsuariosReporsitory usuariosRepo;

    @Override
    public List<Usuarios> findAllUsers() {
        return usuariosRepo.findAll();
    }

}
