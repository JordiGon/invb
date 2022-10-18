package com.invbv.demo.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.inter.ICargoDao;
import com.invbv.demo.model.Cargo;
import com.invbv.demo.repository.CargoRepository;

@Service
public class CargoDaoImpl implements ICargoDao {

    // similar al Entity Manager
    @Autowired
    private CargoRepository cargoRepo;

    @Override
    public List<Cargo> findAll() {
        return cargoRepo.findAll();
    }

    @Override
    public Cargo createCargo(Cargo cargo) {
        return cargoRepo.save(cargo);
    }

    @Override
    public Optional<Cargo> getCargo(Integer id) {
        return cargoRepo.findById(id);
    }

    @Override
    public Optional<Cargo> deleteCargo(Integer id) {
        Optional<Cargo> Cargo = cargoRepo.findById(id);
        if (Cargo != null) {
            cargoRepo.delete(Cargo.get());
            return Cargo;
        } else {
            return null;
        }
    }

    @Override
    public Cargo updateCargo(Cargo cargo) {
        return cargoRepo.saveAndFlush(cargo);
    }

}
