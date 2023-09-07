package com.invbv.demo.dao.inter;

import com.invbv.demo.model.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoDao {


    List<Producto> findAll();
    public Producto save (Producto producto);

    List<Producto> findProducto(String name);
    List<Producto> findEstado(String estado);

    List<Producto> findUbicacion(String ubicacion);

    Optional<Producto> findByDbid (int id);
}
