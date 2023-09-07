package com.invbv.demo.repository;


import com.invbv.demo.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto , Integer> {
}
