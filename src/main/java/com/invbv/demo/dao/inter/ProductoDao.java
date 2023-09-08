package com.invbv.demo.dao.inter;

import com.invbv.demo.model.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoDao {


    List<Producto> findAll();
    public Producto save(Producto producto);

    Optional<Producto> findByDbid(int id);
    List<Producto> findProduct(String name);
}
