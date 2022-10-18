/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.svc.impl;

import com.invbv.demo.dao.inter.TipoSumDao;
import com.invbv.demo.model.Estado;
import com.invbv.demo.model.TipoMovimiento;
import com.invbv.demo.model.TipoSuministro;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.TipoSuministroSvc;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Solorzano
 */
@Service
public class TipoSuministroSvcImpl implements TipoSuministroSvc {
    @Autowired
    TipoSumDao tiposumdao;

    @Override
    public responseApi findAll() {
        try {

            List<TipoSuministro> tiposum = tiposumdao.findAll();

            return new responseApi(200, "Success Query", tiposum);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi addTipoSum(TipoSuministro tipoSuministro) {
        try {
            TipoSuministro tipoSuministro1 = tiposumdao.createTipoSum(tipoSuministro);
            return new responseApi(200, "Success Query", tipoSuministro1);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi getTipoSuministro(Integer id) {
        try {

            Optional<TipoSuministro> tipoSuministroOptional = tiposumdao.getTipoSuministro(id);

            return new responseApi(200, "Success Query", tipoSuministroOptional);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi deleteTipoSuministro(Integer id) {
        try {
            Optional<TipoSuministro> tipoSuministroOptional = tiposumdao.deleteTipoSuministro(id);

            return new responseApi(200, "Success Query", tipoSuministroOptional);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi updateTipoSuministro(TipoSuministro tipoSuministro) {
        try {

            TipoSuministro aux = tiposumdao.updateTipoSuministro(tipoSuministro);
            return new responseApi(200, "Success Query", aux);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

}
