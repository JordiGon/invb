package com.invbv.demo.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "RECETAS")
public class Receta {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Receta")
    private Integer idReceta;
    @JoinColumn(name = "ID_Producto ", referencedColumnName = "ID_Producto")
    @ManyToOne(optional = false)
    private Producto producto;
    @Column(name = "Descripcion_Producto ")
    private String descripcionProducto;
    @Column(name = "Tipo_Producto ")
    private String tipoProducto;
    @Column(name = "Fecha_Creacion ")
    private Date fechaCreacion;
    @Column(name = "Tiempo_Preparacion ")
    private String TiempoPreparacion;
    @Column(name = "Instrucciones_Preparacion")
    private String instrucciones;
}
