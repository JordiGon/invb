package com.invbv.demo.dao.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.inter.InventarioDao;
import com.invbv.demo.model.Inventario;
import com.invbv.demo.repository.InventoryRepository;

@Service
public class InventarioDaoImp implements InventarioDao {

    @Autowired
    InventoryRepository inventoryRepository;

    @Override
    public Inventario createInventory(Inventario inventario) {

        return inventoryRepository.save(inventario);
    }

    @Override
    public Inventario updateInventory(Inventario inventario) {

        return inventoryRepository.saveAndFlush(inventario);
    }

    @Override
    public Optional<Inventario> deleteInventory(Integer id) {
        Optional<Inventario> inventario = inventoryRepository.findById(id);

        if (inventario != null) {
            inventoryRepository.delete(inventario.get());
            return inventario;
        } else {
            return null;
        }
    }

    @Override
    public Optional<Inventario> getInventort(Integer id) {
        return inventoryRepository.findById(id);
    }

    @Override
    public Inventario getInventoryByEstado(Integer estado, Integer suministro) {
        return inventoryRepository.getBySumEst(estado, suministro);
    }

}
