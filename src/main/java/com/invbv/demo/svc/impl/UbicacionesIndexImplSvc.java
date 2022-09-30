package com.invbv.demo.svc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.impl.UbicacionesIndexDaoImpl;
import com.invbv.demo.model.UbicacionesIndex;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.UbicacionesIndexSvc;

@Service
public class UbicacionesIndexImplSvc implements UbicacionesIndexSvc {

    @Autowired
    UbicacionesIndexDaoImpl ubicacionesIndexDao;

    @Override
    public responseApi findAllUbicacionesI() {
        try {
            List<UbicacionesIndex> ubicacionesIndex = ubicacionesIndexDao.findAllUbicacionesI();
            return new responseApi(200, "Successfull Query", ubicacionesIndex);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

}
