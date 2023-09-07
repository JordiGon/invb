package com.invbv.demo.svc.impl;


import java.util.List;

import com.invbv.demo.dao.inter.ProductoDao;
import com.invbv.demo.model.Producto;
import com.invbv.demo.svc.inter.ProductoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.model.responseApi;

@Service
public class ProductoSvcImpl implements ProductoSvc {


    @Autowired
    ProductoDao productoDao;



    @Override
    public responseApi findAll() {
        try {
            List<Producto> productos = productoDao.findAll();
            return new responseApi(200, "Success Query", productos);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

}
