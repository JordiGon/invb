/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.svc.impl;

import com.invbv.demo.dao.inter.UbicacionDao;
import com.invbv.demo.model.TipoSuministro;
import com.invbv.demo.model.Ubicacion;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.UbicacionSvc;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Solorzano
 */
@Service
public class UbicacionSvcImpl implements UbicacionSvc{
    
    @Autowired
    public UbicacionDao ubicacionDao;

    @Override
    public responseApi findAll() {
        try {
            
            List<Ubicacion> ubicacion = ubicacionDao.findAll();
     
            return new responseApi(200, "Success Query", ubicacion);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }
}
