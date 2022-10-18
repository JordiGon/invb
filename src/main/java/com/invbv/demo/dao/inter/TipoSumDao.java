/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.dao.inter;

import com.invbv.demo.model.Cargo;
import com.invbv.demo.model.TipoSuministro;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Andres Solorzano
 */
public interface TipoSumDao {

    public List<TipoSuministro> findAll();

    public TipoSuministro createTipoSum(TipoSuministro tipoSuministro);

    public Optional<TipoSuministro> getTipoSuministro(Integer id);

    public Optional<TipoSuministro> deleteTipoSuministro(Integer id);

    public TipoSuministro updateTipoSuministro(TipoSuministro tipoSuministro);

}
