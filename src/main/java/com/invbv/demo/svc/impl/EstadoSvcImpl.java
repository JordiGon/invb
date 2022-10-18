/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.svc.impl;

import com.invbv.demo.dao.inter.EstadoDao;
import com.invbv.demo.dao.inter.ICargoDao;
import com.invbv.demo.model.Cargo;
import com.invbv.demo.model.CategoriaSuministro;
import com.invbv.demo.model.Estado;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.EstadoSvc;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Solorzano
 */
@Service
public class EstadoSvcImpl implements EstadoSvc {
    @Autowired
    EstadoDao estadoDao;

    @Override
    public responseApi findAllStatus() {
        try {

            List<Estado> estado = estadoDao.findAllStatus();
            return new responseApi(200, "Estados: ", estado);
        } catch (Exception e) {
            return new responseApi(500, "No se encontro registros", e);
        }
    }

    @Override
    public responseApi addEstado(Estado estado) {
        try {
            Estado status = estadoDao.createEstado(estado);
            return new responseApi(200, "Registro insertado correctamente", status);
        } catch (Exception e) {
            return new responseApi(500, "No se puedo insertar el estado:", e);
        }
    }

    @Override
    public responseApi getEstado(Integer id) {
        try {

            Optional<Estado> Estado = estadoDao.getEstado(id);

            return new responseApi(200, "Success Query", Estado);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi deleteEstado(Integer id) {
        try {
            Optional<Estado> Estado = estadoDao.deleteEstado(id);

            return new responseApi(200, "Success Query", Estado);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi updateEstado(Estado estado) {
        try {

            Estado aux = estadoDao.updateEstado(estado);
            return new responseApi(200, "Success Query", aux);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

}
