/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.dao.impl;

import com.invbv.demo.dao.inter.TipoSumDao;
import com.invbv.demo.model.TipoSuministro;
import com.invbv.demo.repository.EstadoRepository;
import com.invbv.demo.repository.TipoSumRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Solorzano
 */
@Service
public class TipoSumDaoImpl implements TipoSumDao {

    @Autowired
    private TipoSumRepository tipoSumRepository;

    @Override
    public List<TipoSuministro> findAll() {
        return tipoSumRepository.findAll();
    }

    @Override
    public TipoSuministro createTipoSum(TipoSuministro tipoSuministro) {
        return tipoSumRepository.save(tipoSuministro);
    }

    @Override
    public Optional<TipoSuministro> getTipoSuministro(Integer id) {

        return tipoSumRepository.findById(id);
    }

    @Override
    public Optional<TipoSuministro> deleteTipoSuministro(Integer id) {
        Optional<TipoSuministro> TipoSuministro = tipoSumRepository.findById(id);
        if (TipoSuministro != null) {
            tipoSumRepository.delete(TipoSuministro.get());
            return TipoSuministro;
        } else {
            return null;
        }
    }

    @Override
    public TipoSuministro updateTipoSuministro(TipoSuministro tipoSuministro) {

        return tipoSumRepository.saveAndFlush(tipoSuministro);
    }

}
