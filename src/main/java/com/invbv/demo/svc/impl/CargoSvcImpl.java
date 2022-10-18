package com.invbv.demo.svc.impl;

import java.util.List;
import java.util.Optional;

import com.invbv.demo.model.CategoriaSuministro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.inter.ICargoDao;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.ICargoSvc;
import com.invbv.demo.model.Cargo;

@Service
public class CargoSvcImpl implements ICargoSvc {

    @Autowired
    ICargoDao CargoDao;

    @Override
    public responseApi findAll() {
        try {
            List<Cargo> cargo = CargoDao.findAll();
            return new responseApi(200, "Cargos :", cargo);
        } catch (Exception e) {
            return new responseApi(500, "No se pudo encontrar cargos", e);
        }
    }

    @Override
    public responseApi addCargo(Cargo cargo) {
        try {
            Cargo cargos = CargoDao.createCargo(cargo);
            return new responseApi(200, "Cargo insertado corectamente: ", cargos);
        } catch (Exception e) {
            return new responseApi(500, "No se pudo insertar cargo", e);
        }
    }

    @Override
    public responseApi getCargo(Integer id) {
        try {

            Optional<Cargo> Cargo = CargoDao.getCargo(id);

            return new responseApi(200, "Success Query", Cargo);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi deleteCargo(Integer id) {
        try {
            Optional<Cargo> Cargo = CargoDao.deleteCargo(id);

            return new responseApi(200, "Success Query", Cargo);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

    @Override
    public responseApi updateCargo(Cargo cargo) {
        try {
            Cargo aux = CargoDao.updateCargo(cargo);
            return new responseApi(200, "Success Query", aux);
        } catch (Exception e) {
            return new responseApi(500, "Unsuccessfull Query", e);
        }
    }

}
