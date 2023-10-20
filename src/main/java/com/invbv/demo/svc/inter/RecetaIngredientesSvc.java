package com.invbv.demo.svc.inter;

import com.invbv.demo.model.Receta;
import com.invbv.demo.model.RecetaIngredientes;
import com.invbv.demo.model.responseApi;
public interface RecetaIngredientesSvc {

    public responseApi findAll();

    responseApi guardarRecetaIngrediente(RecetaIngredientes recetaIngredientes);
    public  responseApi changeReceta(RecetaIngredientes recetaIngredientes , int id);
}
