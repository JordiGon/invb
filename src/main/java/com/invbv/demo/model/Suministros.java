/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "suministros")
public class Suministros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_suministros")
    private Integer idSuministro;
    @Column(name = "nombre_sum")
    private String nombreSuministro;
    @Column(name = "cantidad_sum")
    private String cantidadSuministro;
    @Column(name = "descripcion_sum")
    private String descripcionSuministro;
    @Column(name = "valor_unitario_sum")
    private Double valorUnitarioSuminstro;
    @Column(name = "donacion_sum")
    private String donacionSuministro;
    @JoinColumn(name = "idtiposum_fk", referencedColumnName = "id_tipo_sum")
    @ManyToOne(optional = false)
    private TipoSuministro tipoSuministro;
    @JoinColumn(name = "idestados_fk", referencedColumnName = "id_estados")
    @ManyToOne(optional = false)
    private Estado estado;
    @JoinColumn(name = "idcategoriassum_fk", referencedColumnName = "id_categorias_sum")
    @ManyToOne(optional = false)
    private CategoriaSuministro catSuministro;

}
