package com.invbv.demo.dao.impl;


import com.invbv.demo.dao.inter.IngredientesDao;
import com.invbv.demo.dao.inter.PedidosDao;
import com.invbv.demo.model.Ingredientes;

import java.util.List;
import java.util.Optional;

import com.invbv.demo.model.Pedidos;
import com.invbv.demo.repository.IngredientesRepository;
import com.invbv.demo.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidosDaoImpl implements PedidosDao {


    @Autowired
    PedidosRepository pedidosRepository;

    @Override
    public List<Pedidos> findAll() {
        return pedidosRepository.findAll();
    }

    @Override
    public Pedidos save(Pedidos pedidos) {
        return pedidosRepository.save(pedidos);
    }

    @Override
    public Optional<Pedidos> findByDbid(int id) {
        return pedidosRepository.findById(id);
    }
}
