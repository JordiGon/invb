package com.invbv.demo.dao.inter;

import java.util.List;

import com.invbv.demo.model.Usuarios;

public interface UsuariosDao {
    public List<Usuarios> findAllUsers();
}
