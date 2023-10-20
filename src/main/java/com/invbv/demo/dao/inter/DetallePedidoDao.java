package com.invbv.demo.dao.inter;

import com.invbv.demo.model.DetallePedido;
import com.invbv.demo.model.Pedidos;
import com.invbv.demo.model.Producto;
import com.invbv.demo.model.Rol;

import java.util.List;
import java.util.Optional;
public interface DetallePedidoDao {

    List<DetallePedido> findAll();

    DetallePedido save(DetallePedido detallePedido);

    Optional<DetallePedido> findByDbid(int id);

    List<DetallePedido> findDetalle(int id);
}
