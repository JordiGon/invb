package com.invbv.demo.repository;

import com.invbv.demo.model.DetallePedido;
import com.invbv.demo.model.Pedidos;
import com.invbv.demo.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetallePedidoRepository extends JpaRepository<DetallePedido , Integer>{

    @Query(
            value = "SELECT * FROM Detalles_Pedido WHERE Id_Pedido = :name",
            nativeQuery = true

    )
    List<DetallePedido> findbynombre(@Param("name") int name);
}
