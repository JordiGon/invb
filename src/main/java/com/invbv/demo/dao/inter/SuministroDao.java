/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.dao.inter;

import com.invbv.demo.model.Suministros;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Andres Solorzano
 */
public interface SuministroDao {
    List<Suministros> findAll();

    public Suministros save(Suministros suministros);

    // List<Suministros> findSuministro(String name);

    // List<Suministros> findEstado(String estado);

    // List<Suministros> findUbicacion(Integer ubicacion);

    public Optional<Suministros> findByDbid(Integer id);

    public Optional<Suministros> deleteSuministros(Integer id);

    public Suministros updateSuministros(Suministros suministros);

}
