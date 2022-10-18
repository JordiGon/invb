/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.svc.inter;

import com.invbv.demo.model.TipoSuministro;
import com.invbv.demo.model.responseApi;

/**
 *
 * @author Andres Solorzano
 */
public interface TipoSuministroSvc {

    public responseApi findAll();

    public responseApi addTipoSum(TipoSuministro tipoSuministro);

    public responseApi getTipoSuministro(Integer id);

    public responseApi deleteTipoSuministro(Integer id);

    public responseApi updateTipoSuministro(TipoSuministro tipoSuministro);

}
