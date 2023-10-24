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

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "PRODUCTOS")

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Producto")
    private Integer idProducto;
    @Column(name = "Nombre_Producto")
    private String nombreProducto;
    @Column(name = "Tipo")
    private String tipo;
    @Column(name = "Stock")
    private Integer stock;
}
