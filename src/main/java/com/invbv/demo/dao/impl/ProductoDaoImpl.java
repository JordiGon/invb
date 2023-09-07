package com.invbv.demo.dao.impl;

import com.invbv.demo.dao.inter.ProductoDao;
import com.invbv.demo.model.Producto;

import java.util.List;

import com.invbv.demo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoDaoImpl implements ProductoDao {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

}
