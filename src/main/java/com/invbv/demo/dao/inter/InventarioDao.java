package com.invbv.demo.dao.inter;

import java.util.Optional;

import com.invbv.demo.model.Inventario;

public interface InventarioDao {
    public Inventario createInventory(Inventario inventario);

    public Inventario updateInventory(Inventario inventario);

    public Optional<Inventario> deleteInventory(Integer id);

    public Optional<Inventario> getInventort(Integer id);

    public Inventario getInventoryByEstado(Integer estado, Integer suministro);
}
