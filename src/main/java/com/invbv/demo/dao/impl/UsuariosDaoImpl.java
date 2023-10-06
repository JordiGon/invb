package com.invbv.demo.dao.impl;


import java.util.List;
import java.util.Optional;

import com.invbv.demo.dao.inter.EstadoDao;
import com.invbv.demo.dao.inter.RecetaDao;
import com.invbv.demo.dao.inter.SucursalDao;
import com.invbv.demo.dao.inter.UsuariosDao;
import com.invbv.demo.model.Estado;
import com.invbv.demo.model.Receta;
import com.invbv.demo.model.Sucursal;
import com.invbv.demo.model.Usuario;
import com.invbv.demo.repository.EstadoRepository;
import com.invbv.demo.repository.RecetaRepository;
import com.invbv.demo.repository.SucursalRepository;
import com.invbv.demo.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosDaoImpl implements UsuariosDao {

    @Autowired
    UsuariosRepository usuariosRepository;
    @Override
    public List<Usuario> findAll() {
        return usuariosRepository.findAll();
    }
}
