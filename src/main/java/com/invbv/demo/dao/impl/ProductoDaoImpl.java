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
        return null;
    }

    @Override
    public List<Producto> findProducto(String name) {
        return null;
    }

    @Override
    public List<Producto> findEstado(String estado) {
        return null;
    }

    @Override
    public List<Producto> findUbicacion(String ubicacion) {
        return null;
    }

    @Override
    public Optional<Producto> findByDbid(int id) {
        return Optional.empty();
    }
}
