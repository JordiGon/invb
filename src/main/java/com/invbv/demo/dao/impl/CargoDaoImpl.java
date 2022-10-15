package com.invbv.demo.dao.impl;

import java.util.List;

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
    public Cargo save(Cargo cargo) {
        return cargoRepo.save(cargo);
    }

}
