package com.invbv.demo.dao.inter;

import com.invbv.demo.model.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoDao {


    List<Producto> findAll();
}
