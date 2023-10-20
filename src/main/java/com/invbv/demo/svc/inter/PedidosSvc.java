package com.invbv.demo.svc.inter;

import com.invbv.demo.model.DetallePedido;
import com.invbv.demo.model.Pedidos;
import com.invbv.demo.model.responseApi;
public interface PedidosSvc {


    public responseApi findAll();

    responseApi guardarPedido(Pedidos pedidos);

    public  responseApi changePedido(Pedidos pedidos , int id);
}
