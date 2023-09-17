package com.invbv.demo.dao.inter;

import com.invbv.demo.model.Estado;
import com.invbv.demo.model.Ingredientes;

import java.util.List;
import java.util.Optional;
public interface EstadoDao {

    List<Estado> findAll();
}
