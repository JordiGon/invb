package com.invbv.demo.model;

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
@Table(name = "movimientos")
public class Movimientos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimientos")
    private Integer idMovimientos;
    @JoinColumn(name = "idusuarios_fk", referencedColumnName = "id_usuarios")
    @ManyToOne(optional = false)
    private Usuarios usuario;
    @JoinColumn(name = "idsuministros_fk", referencedColumnName = "id_suministros")
    @ManyToOne(optional = false)
    private Suministros suministro;
    @JoinColumn(name = "idtipomov_fk", referencedColumnName = "id_tipo_mov")
    @ManyToOne(optional = false)
    private TipoMovimiento tipoMovimiento;
}
