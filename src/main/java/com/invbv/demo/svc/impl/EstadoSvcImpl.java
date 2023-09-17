package com.invbv.demo.svc.impl;

import com.invbv.demo.dao.inter.EstadoDao;
import com.invbv.demo.model.Estado;
import com.invbv.demo.svc.inter.EstadoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.swing.text.html.Option;
import com.invbv.demo.model.responseApi;

import java.util.List;

@Service
public class EstadoSvcImpl implements EstadoSvc {

    @Autowired
    EstadoDao estadoDao;


    @Override
    public responseApi findAll() {
        try {
            List<Estado> estado = estadoDao.findAll();
            return new responseApi(200, "Success Query", estado);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }
}
