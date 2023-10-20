package com.invbv.demo.dao.impl;

import com.invbv.demo.dao.inter.DetallePedidoDao;
import com.invbv.demo.model.DetallePedido;
import com.invbv.demo.repository.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetallePedidoDaoImpl implements DetallePedidoDao {

    @Autowired
    DetallePedidoRepository detallePedidoRepository;
    @Override
    public List<DetallePedido> findAll() {
        return detallePedidoRepository.findAll();
    }

    @Override
    public DetallePedido save(DetallePedido detallePedido) {
        return detallePedidoRepository.save(detallePedido);
    }

    @Override
    public Optional<DetallePedido> findByDbid(int id) {
        return detallePedidoRepository.findById(id);
    }
}
