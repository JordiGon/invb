package com.invbv.demo.repository;


import com.invbv.demo.model.Pedidos;
import com.invbv.demo.model.Producto;
import com.invbv.demo.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol , Integer> {
}
