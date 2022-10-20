package com.invbv.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.invbv.demo.response.SuministroResponse;

@Repository
public interface SuministroResponseRepository extends JpaRepository<SuministroResponse, Integer> {
    @Query(value = "SELECT " +
            "id_inventario, " +
            "nombre_sum as nombre_producto, " +
            "descripcion_sum as descripcion_producto, " +
            "cantidad_sum as cantidad, " +
            "descripcion_estado as activo_baja, " +
            "SUM(cantidad_sum)*valor_unitario_sum as total, " +
            "donacion_sum as donacion, " +
            "valor_unitario_sum as valor_unitario, " +
            "descripcion_cat_sum as categoria, " +
            "ubicacion , " +
            "idsuministro_fk " +
            "FROM inventory.inventario a " +
            "INNER JOIN inventory.suministros b ON a.idsuministro_fk = b.id_suministros " +
            "INNER JOIN inventory.estados c ON  a.idestados_fk = c.id_estados " +
            "INNER JOIN inventory.categorias_sum d ON d.id_categorias_sum = b.idcategoriassum_fk " +
            "INNER JOIN inventory.ubicaciones e ON e.id_ubicaciones = b.idubicaciones_fk " +
            "WHERE cantidad_sum > 0 " +
            "group by id_inventario", nativeQuery = true)
    List<SuministroResponse> findInventory();
}
