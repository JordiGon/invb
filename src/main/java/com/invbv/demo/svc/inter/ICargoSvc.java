package com.invbv.demo.svc.inter;

import com.invbv.demo.model.Cargo;
import com.invbv.demo.model.responseApi;

public interface ICargoSvc {
    public responseApi findAll();

    public responseApi addCargo(Cargo cargo);

    public responseApi getCargo(Integer id);

    public responseApi deleteCargo(Integer id);

    public responseApi updateCargo(Cargo cargo);
}
