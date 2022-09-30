package com.invbv.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.inter.UbicacionesIndexDao;
import com.invbv.demo.model.UbicacionesIndex;
import com.invbv.demo.repository.UbicacionesIndexRepository;

@Service
public class UbicacionesIndexDaoImpl implements UbicacionesIndexDao {

    @Autowired
    UbicacionesIndexRepository ubicacionesIRepo;

    @Override
    public List<UbicacionesIndex> findAllUbicacionesI() {
        // TODO Auto-generated method stub
        return ubicacionesIRepo.findAll();
    }

}
