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
import java.util.Optional;

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
    public List<Roles> findAll() {
        return rolRepository.findAll();
    }

    @Override
    public Roles createRol(Roles roles) {
        return rolRepository.save(roles);
    }

    @Override
    public Optional<Roles> getRoles(Integer id) {

        return rolRepository.findById(id);
    }

    @Override
    public Optional<Roles> deleteRoles(Integer id) {
        Optional<Roles> Roles = rolRepository.findById(id);
        if (Roles != null) {
            rolRepository.delete(Roles.get());
            return Roles;
        } else {
            return null;
        }
    }

    @Override
    public Roles updateRoles(Roles roles) {
        return rolRepository.saveAndFlush(roles);
    }

}
