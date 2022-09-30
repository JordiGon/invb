/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.repository;

import com.invbv.demo.model.Cargo;
import com.invbv.demo.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andres Solorzano
 */
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
    
}
