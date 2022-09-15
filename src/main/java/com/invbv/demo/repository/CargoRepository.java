package com.invbv.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invbv.demo.model.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Integer> {

}
