package com.invbv.demo.dao.inter;

import com.invbv.demo.model.Pedidos;
import com.invbv.demo.model.Producto;
import com.invbv.demo.model.Rol;

import java.util.List;
import java.util.Optional;
public interface RolDao {

    List<Rol> findAll();

    Rol save(Rol rol);
}
