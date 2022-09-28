/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.svc.impl;

import com.invbv.demo.dao.inter.EstadoDao;
import com.invbv.demo.dao.inter.ICargoDao;
import com.invbv.demo.model.Cargo;
import com.invbv.demo.model.CategoriaSuministro;
import com.invbv.demo.model.Estado;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.EstadoSvc;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Solorzano
 */
@Service
public class EstadoSvcImpl implements EstadoSvc{
     @Autowired
    EstadoDao estadoDao;

    @Override
    public responseApi findAllStatus() {
        try {
            
            List<Estado> cargo = estadoDao.findAllStatus();
            System.out.println("Estado" + cargo);
            return new responseApi(200, "Success Query", cargo);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi addEstado(Estado estado) {
         try {
            Estado status = estadoDao.save(estado);
            return new responseApi(200, "Success Query", status);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }
    
        
    
}
