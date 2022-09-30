package com.invbv.demo.svc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.impl.MovimientosDaoImpl;
import com.invbv.demo.model.Movimientos;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.MovimientosSvc;

@Service
public class MovimientosSvcImpl implements MovimientosSvc {
    @Autowired
    MovimientosDaoImpl movimientosDao;

    @Override
    public responseApi findAllMovimientos() {
        try {

            List<Movimientos> mov = movimientosDao.findAllMovimientos();
            return new responseApi(200, "Successfull Query", mov);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

}
