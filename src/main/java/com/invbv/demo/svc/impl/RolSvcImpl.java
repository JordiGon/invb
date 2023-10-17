package com.invbv.demo.svc.impl;

import com.invbv.demo.dao.inter.RolDao;
import com.invbv.demo.model.*;
import com.invbv.demo.svc.inter.RolSvc;

import com.invbv.demo.dao.inter.PedidosDao;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.PedidosSvc;

import java.util.List;
import java.util.Optional;

import com.invbv.demo.dao.inter.ProductoDao;
import com.invbv.demo.svc.inter.ProductoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.swing.text.html.Option;
import com.invbv.demo.model.responseApi;
@Service
public class RolSvcImpl implements RolSvc {


    @Autowired
    RolDao rolDao;
    @Override
    public responseApi findAll() {
        try {
            List<Rol> rols = rolDao.findAll();
            return new responseApi(200, "Success Query", rols);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi addRol(Rol rol) {
        try {
            Rol rol1 = rolDao.save(rol);
            return new responseApi(200, "Rol insertado corectamente: ", rol1);
        } catch (Exception e) {
            return new responseApi(500, "No se pudo insertar producto", e);
        }
    }
}
