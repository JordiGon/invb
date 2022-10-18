/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.dao.inter;

import com.invbv.demo.model.Estado;
import com.invbv.demo.model.Roles;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Andres Solorzano
 */
public interface RolDao {

    public List<Roles> findAll();

    public Roles createRol(Roles roles);

    public Optional<Roles> getRoles(Integer id);

    public Optional<Roles> deleteRoles(Integer id);

    public Roles updateRoles(Roles roles);

}
