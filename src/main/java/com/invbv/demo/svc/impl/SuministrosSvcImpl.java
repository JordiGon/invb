package com.invbv.demo.svc.impl;

import java.util.List;
import java.util.Optional;

import com.invbv.demo.dao.inter.EstadoDao;
import com.invbv.demo.model.Estado;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.inter.SuministroDao;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.model.Suministros;
import com.invbv.demo.svc.inter.SuministroSvc;

import javax.swing.text.html.Option;

@Service
public class SuministrosSvcImpl implements SuministroSvc {

    @Autowired
    SuministroDao suministroDao;

    @Autowired
    EstadoDao estadoDao;

    @Override
    public responseApi findAll() {
        try {
            List<Suministros> suministros = suministroDao.findAll();
            return new responseApi(200, "Success Query", suministros);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi addSuministros(Suministros suministros) {
        try {
            Suministros suministro = suministroDao.save(suministros);
            return new responseApi(200, "Success Query", suministro);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi getSuministros(Integer id) {
        try {

            Optional<Suministros> suministros = suministroDao.findByDbid(id);

            return new responseApi(200, "Success Query", suministros);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi deleteSuministros(Integer id) {
        try {
            Optional<Suministros> sum = suministroDao.deleteSuministros(id);
            return new responseApi(200, "Success Query", sum);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi updateSuministros(Suministros suministros) {
        try {
            Suministros aux = suministroDao.updateSuministros(suministros);
            return new responseApi(200, "Success Query", aux);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    // @Override
    // public responseApi findTipoSumunistro(String name) {
    // try {
    // List<Suministros> tipoSuministro = suministroDao.findSuministro(name);
    // return new responseApi(200, "Success Query", tipoSuministro);
    // } catch (Exception e) {
    // return new responseApi(500, "Unsuccessfull Query", e);
    // }
    // }

    // @Override
    // public responseApi findEstado(String estado) {
    // try {
    // List<Suministros> tipoEstado = suministroDao.findEstado(estado);
    // return new responseApi(200, "Success Query", tipoEstado);
    // } catch (Exception e) {
    // return new responseApi(500, "Unsuccessfull Query", e);
    // }
    // }

    // @Override
    // public responseApi findUbicacion(Integer ubicacion) {
    // try {
    // List<Suministros> Ubicaciones = suministroDao.findUbicacion(ubicacion);
    // return new responseApi(200, "Success Query", Ubicaciones);
    // } catch (Exception e) {
    // return new responseApi(500, "Unsuccessfull Query", e);
    // }
    // }

    // @Override
    // public responseApi findEstado(String estado) {
    // // TODO Auto-generated method stub
    // return null;
    // }

    // @Override
    // public responseApi changeStatus(Suministros suministros , int id) {
    // try {
    // Optional <Suministros> suministros1 = this.suministroDao.findByDbid(id);
    // Suministros suministros2 = suministros1.get();
    // suministros2.setNombreSuministro(suministros.getNombreSuministro());
    // suministros2.setCantidadSuministro(suministros.getCantidadSuministro());
    // suministros2.setDescripcionSuministro(suministros.getDescripcionSuministro());
    // suministros2.setValorUnitarioSuminstro(suministros.getValorUnitarioSuminstro());
    // suministros2.setDonacionSuministro(suministros.getDonacionSuministro());
    // suministros2.setTipoSuministro(suministros.getTipoSuministro());
    // suministros2.setEstado(suministros.getEstado());
    // suministros2.setCatSuministro(suministros.getCatSuministro());
    // Suministros suministros3 = suministroDao.save(suministros2);

    // return new responseApi(200, "Success Query", suministros3);
    // } catch (Exception e) {
    // return new responseApi(500, "Unsuccessfull Query", e);
    // }
    // }
}
