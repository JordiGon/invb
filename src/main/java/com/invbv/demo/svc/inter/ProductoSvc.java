package com.invbv.demo.svc.inter;

import com.invbv.demo.model.Producto;
import com.invbv.demo.model.responseApi;

public interface ProductoSvc {

    public responseApi findAll();
    public responseApi addSuministros(Producto producto);
    public responseApi findProducto(String name);
    public responseApi findEstado(String estado);
    public responseApi findUbicacion(String producto);
    public responseApi changeStatus(Producto producto , int id);
}
