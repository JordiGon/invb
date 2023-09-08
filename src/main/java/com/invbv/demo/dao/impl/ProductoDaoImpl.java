package com.invbv.demo.dao.impl;

import com.invbv.demo.dao.inter.ProductoDao;
import com.invbv.demo.model.Producto;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Optional<Producto> findByDbid(int id) {
        return productoRepository.findById(id);
    }

    @Override
    public List<Producto> findProduct(String name) {
        List<Producto> productos = productoRepository.findbynombre(name);
        return productos;
    }

}
