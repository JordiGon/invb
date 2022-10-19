package com.invbv.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.invbv.demo.model.Inventario;

@Repository
public interface InventoryRepository extends JpaRepository<Inventario, Integer> {
    @Query(value = "SELECT * FROM inventory.inventario WHERE idestados_fk = :estado AND idsuministro_fk = :sum", nativeQuery = true)
    Inventario getBySumEst(@Param("estado") Integer estado, @Param("sum") Integer suministro);
}
