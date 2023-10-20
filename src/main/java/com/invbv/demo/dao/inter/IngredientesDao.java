package com.invbv.demo.dao.inter;


import com.invbv.demo.model.DetallePedido;
import com.invbv.demo.model.Ingredientes;
import java.util.List;
import java.util.Optional;
public interface IngredientesDao {

    List<Ingredientes> findAll();

    public Ingredientes save(Ingredientes ingredientes);

    List<Ingredientes> findIngredient(String name);

    Optional<Ingredientes> findByDbid(int id);
}
