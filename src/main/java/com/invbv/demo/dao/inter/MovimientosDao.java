package com.invbv.demo.dao.inter;

import java.util.List;

import com.invbv.demo.model.Movimientos;

public interface MovimientosDao {
    public List<Movimientos> findAllMovimientos();
}
