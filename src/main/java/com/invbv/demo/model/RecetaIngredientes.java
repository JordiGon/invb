package com.invbv.demo.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "RECETA_INGREDIENTES")
public class RecetaIngredientes  {

    @JoinColumn(name = "ID_Receta ", referencedColumnName = "ID_Receta")
    @ManyToOne(optional = false)
    private Receta receta;
    @JoinColumn(name = "ID_Ingrediente ", referencedColumnName = "ID_Ingrediente")
    @ManyToOne(optional = false)
    private Ingredientes ingredientes;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Receta_Ingrediente")
    private Integer idRecetaIngrediente;

}
