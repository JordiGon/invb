package com.invbv.demo.svc.impl;

import com.invbv.demo.dao.inter.DetallePedidoDao;
import com.invbv.demo.dao.inter.PedidosDao;
import com.invbv.demo.model.*;
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
public class PedidosSvcImpl implements PedidosSvc {

    @Autowired
    PedidosDao pedidosDao;

    @Autowired
    DetallePedidoDao detallePedidoDao;

    @Autowired
    ProductoDao productoDao;


    @Override
    public responseApi findAll() {
        try {
            List<Pedidos> pedidos = pedidosDao.findAll();
            return new responseApi(200, "Success Query", pedidos);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi guardarPedido(Pedidos pedidos) {
        try {
            Pedidos pedidos1 = pedidosDao.save(pedidos);
            return new responseApi(200, "pedido insertado corectamente: ", pedidos1);
        } catch (Exception e) {
            return new responseApi(500, "No se pudo insertar producto", e);
        }
    }




    @Override
    public responseApi changePedido(Pedidos pedidos, int id) {
        try {
            if (pedidos.getEstado().getIdEstado() == 2) {

                List<DetallePedido> detallePedidos = detallePedidoDao.findDetalle(id);
                for (DetallePedido det : detallePedidos) {


                    if (det.getProducto().getStock() <= 0) {
                        // Lanza la excepción StockInsufficientException
                        throw new StockInsufficientException("Stock insuficiente para el producto: " + det.getProducto());
                    }

                    Optional<Producto> producto1 = this.productoDao.findByDbid(det.getProducto().getIdProducto());
                    int stock = producto1.get().getStock();
                    int cantidad = det.getCantidad();
                    int result = stock - cantidad;

                    if (result < 0) {
                        // Lanza la excepción StockInsufficientException
                        throw new StockInsufficientException("Stock insuficiente para el producto: " + det.getProducto());
                    }
                    Producto producto2 = producto1.get();
                    producto2.setStock(result);
                    Producto producto3 = productoDao.save(producto2);


                }
                Optional<Pedidos> pedidos1 = this.pedidosDao.findByDbid(id);
                Pedidos pedidos2 = pedidos1.get();
                pedidos2.setSucursal(pedidos.getSucursal());
                pedidos2.setFechaPedido(pedidos.getFechaPedido());
                pedidos2.setEstado(pedidos.getEstado());
                Pedidos pedidos3 = pedidosDao.save(pedidos2);




                return new responseApi(200, "Success Query", pedidos3);
            }

            Optional<Pedidos> pedidos1 = this.pedidosDao.findByDbid(id);
            Pedidos pedidos2 = pedidos1.get();
            pedidos2.setSucursal(pedidos.getSucursal());
            pedidos2.setFechaPedido(pedidos.getFechaPedido());
            pedidos2.setEstado(pedidos.getEstado());
            Pedidos pedidos3 = pedidosDao.save(pedidos2);
            return new responseApi(200, "Success Query", pedidos3);

        } catch (StockInsufficientException e) {
            return new responseApi(400, "Stock Insufficient", e.getMessage());
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessful Query", e);
        }
    }

    @Override
    public responseApi findDetalle(int name) {
        try {
            List<DetallePedido> detallePedidos = detallePedidoDao.findDetalle(name);
            return new responseApi(200, "Success Query", detallePedidos);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }


}


