package com.invbv.demo.svc.impl;

import com.invbv.demo.dao.inter.DetallePedidoDao;
import com.invbv.demo.dao.inter.EstadoDao;
import com.invbv.demo.model.*;
import com.invbv.demo.svc.inter.DetallePedidoSvc;
import com.invbv.demo.svc.inter.EstadoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.swing.text.html.Option;

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

    @Override
    public responseApi adddetallePedido(DetallePedido detallePedido) {
        try {
            DetallePedido detallePedido1 = detallePedidoDao.save(detallePedido);
            return new responseApi(200, "Rol insertado corectamente: ", detallePedido1);
        } catch (Exception e) {
            return new responseApi(500, "No se pudo insertar producto", e);
        }
    }
}
