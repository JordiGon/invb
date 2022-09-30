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
import lombok.ToString;

/**
 *
 * @author Andres Solorzano
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString
@Table(name = "tipo_mov")
public class TipoMovimiento {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_mov")
    private Integer idTipoMovimiento;
    @Column(name = "descripcion_tipo_mov")
    private String descripcionTipoMovimiento;
    
}
