package com.invbv.demo.svc.impl;

import java.util.List;

import com.invbv.demo.model.CategoriaSuministro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.inter.ICargoDao;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.ICargoSvc;
import com.invbv.demo.model.Cargo;
import com.invbv.demo.util.CargoPDF;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;

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
            Cargo cargos = CargoDao.save(cargo);
            return new responseApi(200, "Cargo insertado corectamente: ", cargos);
        } catch (Exception e) {
            return new responseApi(500, "No se pudo insertar cargo", e);
        }
    }

    @Override
    public responseApi cargoPdf(HttpServletResponse response) {
       
        try {
             response.setContentType("application/pdf");
             DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=user.pdf";
        
        response.setHeader(headerKey, headerValue);
        List<Cargo> cargo = CargoDao.findAll();
        CargoPDF cargoPDF = new CargoPDF();
            cargoPDF.export(response);
            return new responseApi(200, "Cargo insertado corectamente: " , 2 );
        } catch (IOException ex) {
           return new responseApi(500, "No se pudo insertar cargo", ex);
        }
       
        
    }
        
       
    
    }


