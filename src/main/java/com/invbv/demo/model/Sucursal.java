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
@Table(name = "SUCURSALES")
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Sucursal ")
    private Integer idSucursal;
    @Column(name = "Nombre_Sucursal ")
    private String nombreSucursal;
    @Column(name = "Direccion ")
    private String direccion;
}
