/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.svc.impl;

import com.invbv.demo.dao.inter.CatSumDao;
import com.invbv.demo.dao.inter.TipoSumDao;
import com.invbv.demo.model.Cargo;
import com.invbv.demo.model.CategoriaSuministro;
import com.invbv.demo.model.Estado;

import com.invbv.demo.model.TipoSuministro;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.CategoriaSuministroSvc;
import com.invbv.demo.svc.inter.TipoSuministroSvc;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Solorzano
 */
@Service
public class CategoriaSuministroSvcImpl implements CategoriaSuministroSvc{
    @Autowired
    CatSumDao catSumDao;

    @Override
    public responseApi findAll() {
          try {
            List<CategoriaSuministro> categoriasum = catSumDao.findAll();
            return new responseApi(200, "Success Query", categoriasum);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi addsala(CategoriaSuministro catSum) {
        try {
            CategoriaSuministro categoriasum = catSumDao.save(catSum);
            return new responseApi(200, "Success Query", categoriasum);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }
    
}
