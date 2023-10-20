package com.invbv.demo.dao.impl;
import java.util.List;
import java.util.Optional;
import com.invbv.demo.dao.inter.RecetaDao;
import com.invbv.demo.model.Receta;
import com.invbv.demo.repository.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecetaDaoImpl implements RecetaDao {

    @Autowired
    RecetaRepository recetaRepository;

    @Override
    public List<Receta> findAll() {
        return recetaRepository.findAll();
    }

    @Override
    public Receta save(Receta receta) {
        return recetaRepository.save(receta);
    }

    @Override
    public Optional<Receta> findByDbid(int id) {
        return recetaRepository.findById(id);
    }
}
