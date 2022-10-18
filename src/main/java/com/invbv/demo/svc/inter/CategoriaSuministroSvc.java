/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.svc.inter;

import com.invbv.demo.model.CategoriaSuministro;
import com.invbv.demo.model.responseApi;

/**
 *
 * @author Andres Solorzano
 */
public interface CategoriaSuministroSvc {

    public responseApi findAll();

    public responseApi addsala(CategoriaSuministro catSum);

    public responseApi getCategoriaSuministro(Integer id);

    public responseApi deleteCategoriaSuministro(Integer id);

    public responseApi updateCategoriaSuministro(CategoriaSuministro categoriaSuministro);
}
