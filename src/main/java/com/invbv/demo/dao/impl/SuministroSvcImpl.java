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
    
}
