/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.svc.impl;

import com.invbv.demo.dao.inter.CatSumDao;
import com.invbv.demo.dao.inter.TipoMovimientoDao;
import com.invbv.demo.dao.inter.TipoSumDao;
import com.invbv.demo.model.Cargo;
import com.invbv.demo.model.CategoriaSuministro;
import com.invbv.demo.model.Estado;
import com.invbv.demo.model.TipoMovimiento;

import com.invbv.demo.model.TipoSuministro;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.CategoriaSuministroSvc;
import com.invbv.demo.svc.inter.TipoMovimientoSvc;
import com.invbv.demo.svc.inter.TipoSuministroSvc;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Solorzano
 */
@Service
public class TipoMovimientoSvcImpl implements TipoMovimientoSvc{
    @Autowired
    TipoMovimientoDao tipoMovimientoDao;

   
    @Override
    public responseApi findAllStatus() {
         try {
            List<TipoMovimiento> tipoMovimiento = tipoMovimientoDao.findAllStatus();
            return new responseApi(200, "Success Query", tipoMovimiento);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }
    
}
