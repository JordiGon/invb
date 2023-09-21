package com.invbv.demo.repository;

import com.invbv.demo.model.Estado;
import com.invbv.demo.model.Ingredientes;
import com.invbv.demo.model.Receta;
import com.invbv.demo.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {
}
