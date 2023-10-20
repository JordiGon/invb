package com.invbv.demo.svc.inter;
import com.invbv.demo.model.DetallePedido;
import com.invbv.demo.model.Receta;
import com.invbv.demo.model.responseApi;
public interface RecetaSvc {


    public responseApi findAll();

    responseApi guardarReceta(Receta receta);
    public  responseApi changeReceta(Receta receta , int id);



}
