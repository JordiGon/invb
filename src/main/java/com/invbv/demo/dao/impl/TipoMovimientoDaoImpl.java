/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.dao.impl;

import com.invbv.demo.dao.inter.EstadoDao;
import com.invbv.demo.dao.inter.TipoMovimientoDao;
import com.invbv.demo.model.Estado;
import com.invbv.demo.model.TipoMovimiento;
import com.invbv.demo.repository.CargoRepository;
import com.invbv.demo.repository.EstadoRepository;
import com.invbv.demo.repository.TipoMovimientoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Solorzano
 */
@Service
public class TipoMovimientoDaoImpl implements TipoMovimientoDao {
    
    @Autowired
    private TipoMovimientoRepository tipoMovimientoRepository;

    @Override
    public List<TipoMovimiento> findAllStatus() {
        return tipoMovimientoRepository.findAll();
       
    }

    @Override
    public TipoMovimiento save(TipoMovimiento tipoMovimiento) {
        return tipoMovimientoRepository.save(tipoMovimiento);
    }


}
