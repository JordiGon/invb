/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.dao.impl;

import com.invbv.demo.dao.inter.UbicacionDao;
import com.invbv.demo.model.Ubicacion;
import com.invbv.demo.repository.UbicacionRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Solorzano
 */
@Service
public class UbicacionDaoImpl implements UbicacionDao {

    @Autowired
    private UbicacionRepository ubicacionRepository;

    @Override
    public List<Ubicacion> findAll() {
        return ubicacionRepository.findAll();
    }

    @Override
    public Optional<Ubicacion> getUbicacion(Integer id) {
        return ubicacionRepository.findById(id);
    }

    @Override
    public Optional<Ubicacion> deleteUbicacion(Integer id) {
        Optional<Ubicacion> ubicacion = ubicacionRepository.findById(id);
        if (ubicacion != null) {
            ubicacionRepository.delete(ubicacion.get());
            return ubicacion;
        } else {
            return null;
        }
    }

    @Override
    public Ubicacion createUbicacion(Ubicacion ubicacion) {

        return ubicacionRepository.saveAndFlush(ubicacion);
    }

    @Override
    public Ubicacion updateUbicacion(Ubicacion ubicacion) {

        return ubicacionRepository.saveAndFlush(ubicacion);
    }

}
