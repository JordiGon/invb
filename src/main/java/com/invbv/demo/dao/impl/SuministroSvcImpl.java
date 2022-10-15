/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.dao.impl;

import com.invbv.demo.dao.inter.SuministroDao;
import com.invbv.demo.model.Suministros;
import com.invbv.demo.repository.SuministrosRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Solorzano
 */
@Service
public class SuministroSvcImpl implements SuministroDao{
    @Autowired
    private SuministrosRepository suministrosRepository;
    

    @Override
    public List<Suministros> findAll() {
        return suministrosRepository.findAll();
    }

    @Override
    public Suministros save(Suministros suministros) {
        return suministrosRepository.save(suministros);
    }

    @Override
    public List<Suministros> findSuministro(String name) {

        List<Suministros> p = suministrosRepository.findbynombre(name);
        return p;

    }

    @Override
    public List<Suministros> findEstado(String estado) {
        List<Suministros> status = suministrosRepository.findEstado(estado);
        return status;
    }

    @Override
    public List<Suministros> findUbicacion(String ubicacion) {
        List<Suministros> ubicacion1 = suministrosRepository.findUbicacion(ubicacion);
        return ubicacion1;
    }

    @Override
    public Optional<Suministros> findByDbid(int id) {
        return suministrosRepository.findById(id);

    }




}
