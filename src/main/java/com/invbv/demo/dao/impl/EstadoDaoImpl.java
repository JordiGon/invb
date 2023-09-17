package com.invbv.demo.dao.impl;


import java.util.List;
import java.util.Optional;

import com.invbv.demo.dao.inter.EstadoDao;
import com.invbv.demo.model.Estado;
import com.invbv.demo.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoDaoImpl implements EstadoDao {

    @Autowired
    EstadoRepository estadoRepository;
    @Override
    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }
}
