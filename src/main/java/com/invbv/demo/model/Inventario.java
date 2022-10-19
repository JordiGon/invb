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

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@ToString
@Table(name = "inventario")
public class Inventario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventario")
    private Integer idInventario;
    @Column(name = "cantidad_sum")
    private Integer cantidadSuministro;
    @JoinColumn(name = "idestados_fk", referencedColumnName = "id_estados")
    @ManyToOne(optional = false)
    private Estado estado;
    @JoinColumn(name = "idsuministro_fk", referencedColumnName = "id_suministros")
    @ManyToOne(optional = false)
    private Suministros suministros;
}
