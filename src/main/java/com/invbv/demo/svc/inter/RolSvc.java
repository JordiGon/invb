package com.invbv.demo.svc.inter;

import com.invbv.demo.model.Producto;
import com.invbv.demo.model.Rol;
import com.invbv.demo.model.responseApi;
public interface RolSvc {

    public responseApi findAll();

    responseApi addRol(Rol rol);
}
