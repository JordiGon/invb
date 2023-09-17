package com.invbv.demo.svc.impl;

import com.invbv.demo.dao.inter.EstadoDao;
import com.invbv.demo.dao.inter.RecetaDao;
import com.invbv.demo.model.Estado;
import com.invbv.demo.model.Receta;
import com.invbv.demo.svc.inter.EstadoSvc;
import com.invbv.demo.svc.inter.RecetaSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.swing.text.html.Option;
import com.invbv.demo.model.responseApi;

import java.util.List;

@Service
public class RecetaSvcImpl implements RecetaSvc {

    @Autowired
    RecetaDao recetaDao;
    @Override
    public responseApi findAll() {
        try {
            List<Receta> recetas = recetaDao.findAll();
            return new responseApi(200, "Success Query", recetas);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }
}
