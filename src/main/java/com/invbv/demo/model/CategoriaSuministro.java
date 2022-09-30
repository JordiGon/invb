/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Andres Solorzano
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "categorias_sum")
public class CategoriaSuministro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categorias_sum")
    private Integer idCatSum;
    @Column(name = "descripcion_cat_sum")
    private String descripcionCatSum;
    
}
