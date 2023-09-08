package com.invbv.demo.svc.inter;

import com.invbv.demo.model.Producto;
import com.invbv.demo.model.responseApi;

public interface ProductoSvc {

    public responseApi findAll();
    public  responseApi addProducto(Producto producto);

    public  responseApi changeProduct(Producto producto , int id);
    public  responseApi findProduct(String name);
}
