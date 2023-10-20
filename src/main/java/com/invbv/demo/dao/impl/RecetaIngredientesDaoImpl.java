package com.invbv.demo.dao.impl;

import java.util.List;
import java.util.Optional;
import com.invbv.demo.dao.inter.RecetaDao;
import com.invbv.demo.dao.inter.RecetaIngredientesDao;
import com.invbv.demo.model.Receta;
import com.invbv.demo.model.RecetaIngredientes;
import com.invbv.demo.repository.RecetaIngredientesRepository;
import com.invbv.demo.repository.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecetaIngredientesDaoImpl implements RecetaIngredientesDao {

    @Autowired
    RecetaIngredientesRepository recetaIngredientesRepository;
    @Override
    public List<RecetaIngredientes> findAll() {
        return recetaIngredientesRepository.findAll();
    }

    @Override
    public RecetaIngredientes save(RecetaIngredientes recetaIngredientes) {
        return recetaIngredientesRepository.save(recetaIngredientes);
    }

    @Override
    public Optional<RecetaIngredientes> findByDbid(int id) {
        return recetaIngredientesRepository.findById(id);
    }
}
