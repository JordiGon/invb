package com.invbv.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.inter.MovimientosDao;
import com.invbv.demo.model.Movimientos;
import com.invbv.demo.repository.MovimientosRepository;

@Service
public class MovimientosDaoImpl implements MovimientosDao {
    @Autowired
    MovimientosRepository movimientosRepository;

    @Override
    public List<Movimientos> findAllMovimientos() {
        // TODO Auto-generated method stub
        return movimientosRepository.findAll();
    }

}
