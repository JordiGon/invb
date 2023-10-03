package com.invbv.demo.svc.impl;

import com.invbv.demo.dao.inter.PedidosDao;
import com.invbv.demo.model.Pedidos;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.PedidosSvc;

import java.util.List;
import java.util.Optional;

import com.invbv.demo.dao.inter.ProductoDao;
import com.invbv.demo.model.Producto;
import com.invbv.demo.svc.inter.ProductoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.swing.text.html.Option;
import com.invbv.demo.model.responseApi;

@Service
public class PedidosSvcImpl implements PedidosSvc {

    @Autowired
    PedidosDao pedidosDao;

    @Override
    public responseApi findAll() {
        try {
            List<Pedidos> pedidos = pedidosDao.findAll();
            return new responseApi(200, "Success Query", pedidos);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }
}
