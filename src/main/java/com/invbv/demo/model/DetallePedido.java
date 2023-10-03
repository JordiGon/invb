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
@Table(name = "Detalles_Pedido")
public class DetallePedido {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Detalle ")
    private Integer idDetalle;
    @JoinColumn(name = "ID_Pedido", referencedColumnName = "ID_Pedido")
    @ManyToOne(optional = false)
    private Pedidos pedido;
    @JoinColumn(name = "ID_Producto", referencedColumnName = "ID_Producto")
    @ManyToOne(optional = false)
    private Producto producto;
    @Column(name = "Cantidad")
    private int cantidad;
    @Column(name = "Direccion_Envio")
    private String direccionEnvio;

}
