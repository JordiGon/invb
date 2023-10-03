package com.invbv.demo.dao.inter;

import com.invbv.demo.model.DetallePedido;
import com.invbv.demo.model.Pedidos;
import com.invbv.demo.model.Producto;
import java.util.List;
import java.util.Optional;
public interface DetallePedidoDao {

    List<DetallePedido> findAll();
}
