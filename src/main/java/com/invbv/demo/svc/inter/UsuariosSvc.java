package com.invbv.demo.svc.inter;

import com.invbv.demo.model.Usuarios;
import com.invbv.demo.model.responseApi;

public interface UsuariosSvc {
    public responseApi findAllUsuarios();

    public responseApi getUsuarios(Integer id);

    public responseApi deleteUsuarios(Integer id);

    public responseApi createUsuarios(Usuarios usuarios);

    public responseApi updateUsuarios(Usuarios usuarios);
}
