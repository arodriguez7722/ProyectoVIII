/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entity.PerfilEmpleado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Andres
 */
@Local
public interface PerfilEmpleadoFacadeLocal {

    void create(PerfilEmpleado perfilEmpleado);

    void edit(PerfilEmpleado perfilEmpleado);

    void remove(PerfilEmpleado perfilEmpleado);

    PerfilEmpleado find(Object id);

    List<PerfilEmpleado> findAll();

    List<PerfilEmpleado> findRange(int[] range);

    int count();
    
}
