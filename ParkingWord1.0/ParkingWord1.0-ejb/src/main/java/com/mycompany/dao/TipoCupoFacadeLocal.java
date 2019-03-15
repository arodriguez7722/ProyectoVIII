/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entity.TipoCupo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Andres
 */
@Local
public interface TipoCupoFacadeLocal {

    void create(TipoCupo tipoCupo);

    void edit(TipoCupo tipoCupo);

    void remove(TipoCupo tipoCupo);

    TipoCupo find(Object id);

    List<TipoCupo> findAll();

    List<TipoCupo> findRange(int[] range);

    int count();
    
}
