package com.invbv.demo.svc.impl;
import com.invbv.demo.dao.inter.SucursalDao;
import com.invbv.demo.model.Sucursal;
import com.invbv.demo.svc.inter.SucursalSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.swing.text.html.Option;
import com.invbv.demo.model.responseApi;

import java.util.List;

@Service
public class SucursalSvcImpl implements SucursalSvc {


    @Autowired
    SucursalDao sucursalDao;
    @Override
    public responseApi findAll() {
        try {
            List<Sucursal> sucursals = sucursalDao.findAll();
            return new responseApi(200, "Success Query", sucursals);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }
}
