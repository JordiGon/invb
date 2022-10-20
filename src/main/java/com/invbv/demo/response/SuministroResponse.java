package com.invbv.demo.response;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class SuministroResponse {
    @Id
    @Column(name = "id_inventario")
    private Integer id_inventario;
    @Column(name = "nombre_producto")
    private String nombre_producto;
    @Column(name = "descripcion_producto")
    private String descripcion_producto;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "activo_baja")
    private String activo_baja;
    @Column(name = "total")
    private Double total;
    @Column(name = "donacion")
    private String donacion;
    @Column(name = "valor_unitario")
    private Double valor_unitario;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "ubicacion")
    private String ubicacion;
    @Column(name = "idsuministro_fk")
    private Integer idsuministro;
}
