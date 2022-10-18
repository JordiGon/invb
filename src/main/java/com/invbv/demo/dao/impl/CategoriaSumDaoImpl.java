/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.dao.impl;

import com.invbv.demo.dao.inter.CatSumDao;
import com.invbv.demo.model.CategoriaSuministro;
import com.invbv.demo.repository.CategoriaSumRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres Solorzano
 */
@Service
public class CategoriaSumDaoImpl implements CatSumDao {
    @Autowired
    private CategoriaSumRepository catsumRepo;

    @Override
    public List<CategoriaSuministro> findAll() {
        return catsumRepo.findAll();
    }

    @Override
    public CategoriaSuministro createCategoria(CategoriaSuministro catSum) {

        return catsumRepo.save(catSum);
    }

    @Override
    public Optional<CategoriaSuministro> getCategoriaSuministro(Integer id) {

        return catsumRepo.findById(id);
    }

    @Override
    public Optional<CategoriaSuministro> deleteCategoriaSuministro(Integer id) {
        Optional<CategoriaSuministro> catsum = catsumRepo.findById(id);
        if (catsum != null) {
            catsumRepo.delete(catsum.get());
            return catsum;
        } else {
            return null;
        }
    }

    @Override
    public CategoriaSuministro updateCategoriaSuministro(CategoriaSuministro categoriaSuministro) {
        return catsumRepo.saveAndFlush(categoriaSuministro);
    }

}
