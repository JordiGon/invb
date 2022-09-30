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
@Table(name = "ubicaciones_index")
public class UbicacionesIndex {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ubicacionesindex")
    private Integer idUbicacionesIndex;
    @JoinColumn(name = "idsuministros_fk", referencedColumnName = "id_suministros")
    @ManyToOne(optional = false)
    private Suministros suministro;
    @JoinColumn(name = "idubicaciones_fk", referencedColumnName = "id_ubicaciones")
    @ManyToOne(optional = false)
    private Ubicacion ubicacion;
}
