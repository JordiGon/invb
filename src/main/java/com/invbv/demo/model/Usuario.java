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
@Table(name = "USUARIOS")
public class Usuario {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Usuario")
    private Integer idUsuario;
    @Column(name = "Nombre_Usuario")
    private String nombreUsuario;
    @Column(name = "Contraseña")
    private String contra;
    @JoinColumn(name = "ID_Sucursal", referencedColumnName = "ID_Sucursal")
    @ManyToOne(optional = false)
    private Sucursal sucursal;
    @JoinColumn(name = "ID_Rol", referencedColumnName = "ID_Rol")
    @ManyToOne(optional = false)
    private Rol rol;


}
