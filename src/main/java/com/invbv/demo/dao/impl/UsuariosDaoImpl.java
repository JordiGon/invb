package com.invbv.demo.dao.impl;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Usuarios> getUsuarios(Integer id) {

        return usuariosRepo.findById(id);
    }

    @Override
    public Optional<Usuarios> deleteUsuarios(Integer id) {
        Optional<Usuarios> Usuarios = usuariosRepo.findById(id);
        if (Usuarios != null) {
            usuariosRepo.delete(Usuarios.get());
            return Usuarios;
        } else {
            return null;
        }
    }

    @Override
    public Usuarios createUsuarios(Usuarios usuario) {

        return usuariosRepo.save(usuario);
    }

    @Override
    public Usuarios updateUsuarios(Usuarios usuario) {

        return usuariosRepo.saveAndFlush(usuario);
    }

}
