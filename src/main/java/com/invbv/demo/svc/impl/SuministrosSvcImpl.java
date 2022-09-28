package com.invbv.demo.svc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.inter.SuministroDao;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.model.Suministros;
import com.invbv.demo.svc.inter.SuministroSvc;

@Service
public class SuministrosSvcImpl implements SuministroSvc {

    @Autowired
    SuministroDao suministroDao;

    @Override
    public responseApi findAll() {
        try {
            List<Suministros> suministros = suministroDao.findAll();
            return new responseApi(200, "Success Query", suministros);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

}
