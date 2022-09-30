/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.dao.inter;

import com.invbv.demo.model.Cargo;
import com.invbv.demo.model.CategoriaSuministro;
import com.invbv.demo.model.TipoSuministro;
import java.util.List;

/**
 *
 * @author Andres Solorzano
 */
public interface CatSumDao {
    
    public List<CategoriaSuministro> findAll();
    public CategoriaSuministro save(CategoriaSuministro catSum);
    
}
