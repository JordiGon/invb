package com.invbv.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invbv.demo.model.Usuarios;

@Repository
public interface UsuariosReporsitory extends JpaRepository<Usuarios, Integer> {

}
