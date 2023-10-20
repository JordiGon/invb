package com.invbv.demo.svc.impl;

import com.invbv.demo.dao.inter.RecetaDao;
import com.invbv.demo.model.DetallePedido;
import com.invbv.demo.model.Receta;
import com.invbv.demo.svc.inter.RecetaSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.swing.text.html.Option;
import com.invbv.demo.model.responseApi;

import java.util.List;
import java.util.Optional;

@Service
public class RecetaSvcImpl implements RecetaSvc {

    @Autowired
    RecetaDao recetaDao;
    @Override
    public responseApi findAll() {
        try {
            List<Receta> recetas = recetaDao.findAll();
            return new responseApi(200, "Success Query", recetas);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi guardarReceta(Receta receta) {
        try {
            Receta receta1 = recetaDao.save(receta);
            return new responseApi(200, "receta insertado corectamente: ", receta1);
        } catch (Exception e) {
            return new responseApi(500, "No se pudo insertar producto", e);
        }
    }

    @Override
    public responseApi changeReceta(Receta receta, int id) {
        try {
            Optional<Receta> receta1 = this.recetaDao.findByDbid(id);
            Receta receta2 = receta1.get();
            receta2.setProducto(receta.getProducto());
            receta2.setDescripcionProducto(receta.getDescripcionProducto());
            receta2.setTipoProducto(receta.getTipoProducto());
            receta2.setFechaCreacion(receta.getFechaCreacion());
            receta2.setInstrucciones(receta.getInstrucciones());
            receta2.setTiempoPreparacion(receta.getTiempoPreparacion());
            Receta receta3 = recetaDao.save(receta2);





            return new responseApi(200, "Success Query", receta3);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }
}
