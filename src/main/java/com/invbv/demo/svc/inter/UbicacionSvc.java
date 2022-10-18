/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.svc.inter;

import com.invbv.demo.model.Ubicacion;
import com.invbv.demo.model.responseApi;

/**
 *
 * @author Andres Solorzano
 */
public interface UbicacionSvc {
    public responseApi findAll();

    public responseApi getUbicacion(Integer id);

    public responseApi deleteUbicacion(Integer id);

    public responseApi createUbicacion(Ubicacion ubicacion);

    public responseApi updateUbicacion(Ubicacion ubicacion);
}
