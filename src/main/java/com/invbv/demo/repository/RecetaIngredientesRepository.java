package com.invbv.demo.repository;


import com.invbv.demo.model.Producto;
import com.invbv.demo.model.RecetaIngredientes;
import com.invbv.demo.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecetaIngredientesRepository extends JpaRepository<RecetaIngredientes, Integer> {
}
