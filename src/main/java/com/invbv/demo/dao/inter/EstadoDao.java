/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.dao.inter;

import com.invbv.demo.model.Estado;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Andres Solorzano
 */
public interface EstadoDao {

    public List<Estado> findAllStatus();

    public Estado createEstado(Estado estado);

    public Optional<Estado> getEstado(Integer id);

    public Optional<Estado> deleteEstado(Integer id);

    public Estado updateEstado(Estado estado);

}
