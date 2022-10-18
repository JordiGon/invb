package com.invbv.demo.dao.inter;

import java.util.List;
import java.util.Optional;

import com.invbv.demo.model.Cargo;

public interface ICargoDao {
    public List<Cargo> findAll();

    public Cargo createCargo(Cargo cargo);

    public Optional<Cargo> getCargo(Integer id);

    public Optional<Cargo> deleteCargo(Integer id);

    public Cargo updateCargo(Cargo cargo);
}
