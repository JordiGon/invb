package com.invbv.demo.dao.inter;

import com.invbv.demo.model.RecetaIngredientes;

import java.util.List;
import java.util.Optional;
public interface RecetaIngredientesDao {

    List<RecetaIngredientes> findAll();
}
