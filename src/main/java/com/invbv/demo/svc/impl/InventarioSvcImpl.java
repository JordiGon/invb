package com.invbv.demo.svc.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invbv.demo.dao.inter.EstadoDao;
import com.invbv.demo.dao.inter.InventarioDao;
import com.invbv.demo.model.Estado;
import com.invbv.demo.model.Inventario;
import com.invbv.demo.model.responseApi;
import com.invbv.demo.svc.inter.InventarioSvc;

@Service
public class InventarioSvcImpl implements InventarioSvc {

    @Autowired
    InventarioDao inventarioDao;
    @Autowired
    EstadoDao estadoDao;

    @Override
    public responseApi updateEstado(Integer id_inventario, Integer cantidad, Integer id_estado) {
        try {
            // obtengo del que sacare datos...
            Optional<Inventario> current = inventarioDao.getInventort(id_inventario);
            // busco si existe uno con el mismo estado y suministro...
            Inventario exist = inventarioDao.getInventoryByEstado(id_estado,
                    current.get().getSuministros().getIdSuministro());
            // System.out.println("EXISTEEEEEEEEEEEEEEEEEEE??");
            // System.out.println(exist);
            if (exist != null) {
                // si existe, actualizo cantidades
                Integer actual = exist.getCantidadSuministro();
                exist.setCantidadSuministro(cantidad + actual);
                Inventario update = inventarioDao.updateInventory(exist);
            } else {
                // sino existe, creo uno nuevo
                Inventario created = new Inventario();
                Optional<Estado> state = estadoDao.getEstado(id_estado);
                created.setEstado(state.get());
                created.setSuministros(current.get().getSuministros());
                created.setCantidadSuministro(cantidad);
                Inventario aux = inventarioDao.createInventory(created);
            }

            Integer aux_cantidad = current.get().getCantidadSuministro() - cantidad;
            current.get().setCantidadSuministro(aux_cantidad);

            Inventario updated = inventarioDao.updateInventory(current.get());
            // System.out.println(updated);

            return new responseApi(200, "Inventario actualizado: ", updated);
        } catch (Exception e) {
            return new responseApi(500, "No se encontro registros", e);
        }
    }

}
