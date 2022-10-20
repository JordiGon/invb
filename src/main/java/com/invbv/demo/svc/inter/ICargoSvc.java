package com.invbv.demo.svc.inter;

import com.invbv.demo.model.Cargo;
import com.invbv.demo.model.responseApi;
import javax.servlet.http.HttpServletResponse;

public interface ICargoSvc {
    public responseApi findAll();

    public responseApi addCargo(Cargo cargo);

    public responseApi cargoPdf(HttpServletResponse response);
}
