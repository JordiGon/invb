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
@Table(name = "PEDIDOS")
public class Pedidos {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Pedido")
    private Integer idPedido;
    @JoinColumn(name = "ID_Sucursal", referencedColumnName = "ID_Sucursal")
    @ManyToOne(optional = false)
    private Sucursal sucursal;
    @Column(name = "Fecha_Pedido")
    private Date fechaPedido;
    @JoinColumn(name = "ID_Estado", referencedColumnName = "ID_Estado")
    @ManyToOne(optional = false)
    private Estado estado;
}
