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
@Table(name = "usuarios")
public class Usuarios {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuarios")
    private Integer idUsuarios;
    @Column(name = "nombres_usr")
    private String nombresUsr;
    @Column(name = "apellidos_usr")
    private String apellidosUsr;
    @Column(name = "correo_usr")
    private String correoUsr;
    @Column(name = "passwd_usr")
    private String passwdUsr;
    @Column(name = "cel_usr")
    private String celUsr;
    @JoinColumn(name = "idcargo_fk", referencedColumnName = "id_cargo")
    @ManyToOne(optional = false)
    private Cargo cargo;
    @JoinColumn(name = "idroles_fk", referencedColumnName = "id_roles")
    @ManyToOne(optional = false)
    private Roles rol;
}
