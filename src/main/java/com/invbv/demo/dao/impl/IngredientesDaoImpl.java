package com.invbv.demo.dao.impl;


import com.invbv.demo.dao.inter.IngredientesDao;
import com.invbv.demo.model.Ingredientes;

import java.util.List;
import java.util.Optional;
import com.invbv.demo.repository.IngredientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientesDaoImpl implements IngredientesDao {

    @Autowired
    IngredientesRepository ingredientesRepository;

    @Override
    public List<Ingredientes> findAll() {
        return ingredientesRepository.findAll();
    }

    @Override
    public Ingredientes save(Ingredientes ingredientes) {
        return ingredientesRepository.save(ingredientes);
    }

    @Override
    public List<Ingredientes> findIngredient(String name) {
        return ingredientesRepository.findIngredientbyName(name);
    }

    @Override
    public Optional<Ingredientes> findByDbid(int id) {
        return ingredientesRepository.findById(id);
    }
}
