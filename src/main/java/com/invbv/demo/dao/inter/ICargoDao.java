package com.invbv.demo.dao.inter;

import java.util.List;

import com.invbv.demo.model.Cargo;

public interface ICargoDao {
    public List<Cargo> findAll();
    public Cargo save(Cargo cargo);
}
