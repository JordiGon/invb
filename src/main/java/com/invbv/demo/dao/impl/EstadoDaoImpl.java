/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.dao.impl;

import com.invbv.demo.dao.inter.EstadoDao;
import com.invbv.demo.model.Estado;
import com.invbv.demo.repository.EstadoRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Solorzano
 */
@Service
public class EstadoDaoImpl implements EstadoDao {
    
    @Autowired
    private EstadoRepository estadoRepository;

    

    @Override
    public List<Estado> findAllStatus() {
       return estadoRepository.findAll();
    }

    @Override
    public Estado save(Estado estado) {
        return estadoRepository.save(estado);
    }

  
}
