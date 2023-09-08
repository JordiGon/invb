package com.invbv.demo.svc.impl;

import java.util.List;
import java.util.Optional;

import com.invbv.demo.dao.inter.IngredientesDao;
import com.invbv.demo.dao.inter.ProductoDao;
import com.invbv.demo.model.Ingredientes;
import com.invbv.demo.model.Producto;
import com.invbv.demo.svc.inter.IngredientesSvc;
import com.invbv.demo.svc.inter.ProductoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.swing.text.html.Option;
import com.invbv.demo.model.responseApi;

@Service
public class IngredientesSvcImpl implements IngredientesSvc {

    @Autowired
    IngredientesDao ingredientesDao;

    @Override
    public responseApi findAll() {
        try {
            List<Ingredientes> ingredientes = ingredientesDao.findAll();
            return new responseApi(200, "Success Query", ingredientes);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi saveIngredient(Ingredientes ingredientes) {
        try {
            Ingredientes ingredientes1 = ingredientesDao.save(ingredientes);
            return new responseApi(200, "Ingrediente insertado corectamente: ", ingredientes1);
        } catch (Exception e) {
            return new responseApi(500, "No se pudo insertar ingrediente", e);
        }
    }

    @Override
    public responseApi findIngredient(String name) {
        try {
            List<Ingredientes> ingredientes = ingredientesDao.findIngredient(name);
            return new responseApi(200, "Success Query", ingredientes);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }
}
