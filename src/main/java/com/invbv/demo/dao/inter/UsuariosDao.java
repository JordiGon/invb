package com.invbv.demo.dao.inter;

import java.util.List;
import java.util.Optional;

import com.invbv.demo.model.Usuarios;

public interface UsuariosDao {
    public List<Usuarios> findAllUsers();

    public Optional<Usuarios> getUsuarios(Integer id);

    public Optional<Usuarios> deleteUsuarios(Integer id);

    public Usuarios createUsuarios(Usuarios usuario);

    public Usuarios updateUsuarios(Usuarios usuario);

}
