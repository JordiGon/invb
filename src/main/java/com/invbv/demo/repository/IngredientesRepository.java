package com.invbv.demo.repository;

import com.invbv.demo.model.Ingredientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IngredientesRepository  extends JpaRepository<Ingredientes , Integer>{

    @Query(
            value = "SELECT * FROM ingredientes WHERE nombre_ingrediente LIKE %:name%",
            nativeQuery = true

    )
    List<Ingredientes> findIngredientbyName(@Param("name") String name);
}
