package com.invbv.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invbv.demo.model.Movimientos;

@Repository
public interface MovimientosRepository extends JpaRepository<Movimientos, Integer> {

}
