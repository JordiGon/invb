package com.invbv.demo.svc.inter;

import com.invbv.demo.model.responseApi;

public interface InventarioSvc {
    public responseApi updateEstado(Integer id_inventario, Integer cantidad, Integer id_estado);
}
