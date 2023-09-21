package com.invbv.demo.dao.inter;


import com.invbv.demo.model.Receta;

import java.util.List;
import java.util.Optional;
public interface RecetaDao {

    List<Receta> findAll();
}
