package com.invbv.demo.svc.inter;

import com.invbv.demo.model.DetallePedido;
import com.invbv.demo.model.Rol;
import com.invbv.demo.model.responseApi;

public interface DetallePedidoSvc {


    public responseApi findAll();

    responseApi adddetallePedido(DetallePedido detallePedido);
}
