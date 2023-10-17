package com.invbv.demo.dao.impl;



import com.invbv.demo.dao.inter.IngredientesDao;
import com.invbv.demo.dao.inter.PedidosDao;
import com.invbv.demo.dao.inter.RolDao;
import com.invbv.demo.model.Ingredientes;

import java.util.List;
import java.util.Optional;

import com.invbv.demo.model.Pedidos;
import com.invbv.demo.model.Rol;
import com.invbv.demo.repository.IngredientesRepository;
import com.invbv.demo.repository.PedidosRepository;
import com.invbv.demo.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolDaoImpl implements RolDao {


    @Autowired
    RolRepository rolRepository;


    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    @Override
    public Rol save(Rol rol) {
        return rolRepository.save(rol);
    }
}
