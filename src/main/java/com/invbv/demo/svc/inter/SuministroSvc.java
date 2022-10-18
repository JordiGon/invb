/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.svc.inter;

import com.invbv.demo.model.Suministros;
import com.invbv.demo.model.responseApi;

/**
 *
 * @author Andres Solorzano
 */
public interface SuministroSvc {
     public responseApi findAll();
     public responseApi addSuministros(Suministros suministros);
     public responseApi findTipoSumunistro(String name);
     public responseApi findEstado(String estado);
     public responseApi findUbicacion(String ubicacion);
     public responseApi changeStatus(Suministros suministros , int id);
}
