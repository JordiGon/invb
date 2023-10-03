package com.invbv.demo.svc.impl;

import com.invbv.demo.dao.inter.DetallePedidoDao;
import com.invbv.demo.dao.inter.EstadoDao;
import com.invbv.demo.model.DetallePedido;
import com.invbv.demo.model.Estado;
import com.invbv.demo.model.Pedidos;
import com.invbv.demo.svc.inter.DetallePedidoSvc;
import com.invbv.demo.svc.inter.EstadoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.swing.text.html.Option;
import com.invbv.demo.model.responseApi;

import java.util.List;

@Service
public class DetallePedidoSvcImpl implements DetallePedidoSvc {


    @Autowired
    DetallePedidoDao detallePedidoDao;


    @Override
    public responseApi findAll() {
        try {
            List<DetallePedido> detallePedidos = detallePedidoDao.findAll();
            return new responseApi(200, "Success Query", detallePedidos);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }
}
