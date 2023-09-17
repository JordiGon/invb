package com.invbv.demo.dao.inter;


import com.invbv.demo.model.Estado;
import com.invbv.demo.model.Ingredientes;
import com.invbv.demo.model.Receta;

import java.util.List;
import java.util.Optional;
public interface RecetaDao {

    List<Receta> findAll();
}
