package com.invbv.demo.svc.impl;


import java.util.List;
import java.util.Optional;

import com.invbv.demo.dao.inter.EstadoDao;
import com.invbv.demo.dao.inter.ProductoDao;
import com.invbv.demo.model.Estado;
import com.invbv.demo.model.Producto;
import com.invbv.demo.svc.inter.ProductoSvc;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.inter.SuministroDao;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.model.Suministros;
import com.invbv.demo.svc.inter.SuministroSvc;

import javax.swing.text.html.Option;

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

    @Override
    public responseApi addSuministros(Producto producto) {
        return null;
    }

    @Override
    public responseApi findProducto(String name) {
        return null;
    }

    @Override
    public responseApi findEstado(String estado) {
        return null;
    }

    @Override
    public responseApi findUbicacion(String producto) {
        return null;
    }

    @Override
    public responseApi changeStatus(Producto producto, int id) {
        return null;
    }
}
