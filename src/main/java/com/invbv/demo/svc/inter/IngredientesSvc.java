package com.invbv.demo.svc.inter;


import com.invbv.demo.model.Ingredientes;
import com.invbv.demo.model.responseApi;
public interface IngredientesSvc {

    public responseApi findAll();

    public responseApi saveIngredient(Ingredientes ingredientes);

    public responseApi findIngredient(String name);

}
