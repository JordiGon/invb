package com.invbv.demo.svc.impl;

import java.util.List;
import java.util.Optional;

import com.invbv.demo.dao.inter.ProductoDao;
import com.invbv.demo.dao.inter.RecetaIngredientesDao;
import com.invbv.demo.model.Producto;
import com.invbv.demo.model.Receta;
import com.invbv.demo.model.RecetaIngredientes;
import com.invbv.demo.svc.inter.ProductoSvc;
import com.invbv.demo.svc.inter.RecetaIngredientesSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.swing.text.html.Option;
import com.invbv.demo.model.responseApi;

@Service
public class RecetaIngredientesSvcImpl implements RecetaIngredientesSvc {

    @Autowired
    RecetaIngredientesDao recetaIngredientesDao;


    @Override
    public responseApi findAll() {
        try {
            List<RecetaIngredientes> recetaIngredientes = recetaIngredientesDao.findAll();
            return new responseApi(200, "Success Query", recetaIngredientes);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi guardarRecetaIngrediente(RecetaIngredientes recetaIngredientes) {
        try {
            RecetaIngredientes recetaIngredientes1 = recetaIngredientesDao.save(recetaIngredientes);
            return new responseApi(200, "receta insertado corectamente: ", recetaIngredientes1);
        } catch (Exception e) {
            return new responseApi(500, "No se pudo insertar producto", e);
        }
    }

    @Override
    public responseApi changeReceta(RecetaIngredientes receta, int id) {
        return null;
    }
}
