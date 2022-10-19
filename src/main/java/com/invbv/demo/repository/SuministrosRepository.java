/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.repository;

import com.invbv.demo.model.Estado;
import com.invbv.demo.model.Suministros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author Andres Solorzano
 */
@Repository
public interface SuministrosRepository extends JpaRepository<Suministros, Integer> {

        @Query(value = "select s.* from inventory.suministros s  inner join inventory.tipo_sum ts on ts.id_tipo_sum = s.idtiposum_fk WHERE ts.descripcion_tipo_sum = :name", nativeQuery = true

        )
        List<Suministros> findbynombre(@Param("name") String name);

        @Query(value = "select * from inventory.suministros s inner join inventory.estados e on e.id_estados = s.idestados_fk where e.descripcion_estado = :estado", nativeQuery = true

        )
        List<Suministros> findEstado(@Param("estado") String estado);

        @Query(value = "select * from inventory.suministros s inner join inventory.ubicaciones u on u.id_ubicaciones = s.ubicaciones_fk where u.ubicacion = :ubicacion", nativeQuery = true

        )
        List<Suministros> findUbicacion(@Param("ubicacion") String ubicacion);

}
