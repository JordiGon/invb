/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.dao.impl;

import com.invbv.demo.dao.inter.EstadoDao;
import com.invbv.demo.dao.inter.RolDao;
import com.invbv.demo.model.Estado;
import com.invbv.demo.model.Roles;
import com.invbv.demo.repository.CargoRepository;
import com.invbv.demo.repository.EstadoRepository;
import com.invbv.demo.repository.RolRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Solorzano
 */
@Service
public class RolDaoImpl implements RolDao {
    
    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Roles> findAllStatus() {
        return rolRepository.findAll();
    }

    

   
}
