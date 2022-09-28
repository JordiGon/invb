/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.svc.impl;

import com.invbv.demo.dao.inter.EstadoDao;
import com.invbv.demo.dao.inter.ICargoDao;
import com.invbv.demo.dao.inter.RolDao;
import com.invbv.demo.model.Cargo;
import com.invbv.demo.model.Estado;
import com.invbv.demo.model.Roles;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.EstadoSvc;
import com.invbv.demo.svc.inter.RolSvc;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Solorzano
 */
@Service
public class RolSvcImpl implements RolSvc{
     @Autowired
    RolDao rolDao;

    @Override
    public responseApi findAllStatus() {
        try {
            
            List<Roles> rol = rolDao.findAllStatus();
            System.out.println("Estado" + rol);
            return new responseApi(200, "Success Query", rol);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }
    
        
    
}
