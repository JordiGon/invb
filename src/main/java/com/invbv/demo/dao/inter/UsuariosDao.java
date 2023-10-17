package com.invbv.demo.dao.inter;

import com.invbv.demo.model.Producto;
import com.invbv.demo.model.Sucursal;
import com.invbv.demo.model.Usuario;

import java.util.List;

public interface UsuariosDao {

    List<Usuario> findAll();

    Usuario findUser(String name , String password);
}
