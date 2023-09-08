package com.invbv.demo.repository;


import com.invbv.demo.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto , Integer> {


    @Query(
            value = "SELECT * FROM Productos WHERE Nombre_Producto LIKE %:name%",
            nativeQuery = true

    )
    List<Producto> findbynombre(@Param("name") String name);
}
