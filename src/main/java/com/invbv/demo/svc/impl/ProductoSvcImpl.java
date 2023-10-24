package com.invbv.demo.svc.impl;


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
    public responseApi addProducto(Producto producto) {
        try {
            Producto producto1 = productoDao.save(producto);
            return new responseApi(200, "Producto insertado corectamente: ", producto1);
        } catch (Exception e) {
            return new responseApi(500, "No se pudo insertar producto", e);
        }
    }

    @Override
    public responseApi changeProduct(Producto producto, int id) {
        try {
            Optional <Producto> producto1 = this.productoDao.findByDbid(id);
            Producto producto2 = producto1.get();
            producto2.setNombreProducto (producto.getNombreProducto());
            producto2.setTipo(producto.getTipo());
            producto2.setStock(producto.getStock());
            Producto producto3 = productoDao.save(producto2);





            return new responseApi(200, "Success Query", producto3);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi findProduct(String name) {
        try {
            List<Producto> productos = productoDao.findProduct(name);
            return new responseApi(200, "Success Query", productos);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

}
