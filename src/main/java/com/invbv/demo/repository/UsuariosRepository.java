package com.invbv.demo.repository;

import com.invbv.demo.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuariosRepository extends  JpaRepository<Usuario , Integer>{


    @Query(
            value = "SELECT * FROM Usuarios WHERE Nombre_Usuario = :name AND CONTRASEÑA = :password",
            nativeQuery = true

    )
    Usuario findUser(@Param("name") String name , @Param("password") String password);
}
