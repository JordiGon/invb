/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.invbv.demo.svc.inter;

import com.invbv.demo.model.Roles;
import com.invbv.demo.model.responseApi;

/**
 *
 * @author Andres Solorzano
 */
public interface RolSvc {
    
    public responseApi findAllStatus();
    public responseApi addRoles(Roles roles);
    
}
