package com.invbv.demo.svc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.impl.InventoryResponseDaoImpl;
import com.invbv.demo.dao.inter.InventoryResponseDao;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.response.SuministroResponse;
import com.invbv.demo.svc.inter.InventoryResponseSvc;

@Service
public class InventoryResponseSvcImpl implements InventoryResponseSvc {

    @Autowired
    InventoryResponseDao dao;

    @Override
    public responseApi findInventory() {
        try {

            List<SuministroResponse> estado = dao.findInventory();
            return new responseApi(200, "Estados: ", estado);
        } catch (Exception e) {
            return new responseApi(500, "No se encontro registros", e);
        }
    }

}
