package com.invbv.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invbv.demo.model.UbicacionesIndex;

@Repository
public interface UbicacionesIndexRepository extends JpaRepository<UbicacionesIndex, Integer> {

}
