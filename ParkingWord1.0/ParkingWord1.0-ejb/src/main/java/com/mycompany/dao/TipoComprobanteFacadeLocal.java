/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entity.TipoComprobante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Andres
 */
@Local
public interface TipoComprobanteFacadeLocal {

    void create(TipoComprobante tipoComprobante);

    void edit(TipoComprobante tipoComprobante);

    void remove(TipoComprobante tipoComprobante);

    TipoComprobante find(Object id);

    List<TipoComprobante> findAll();

    List<TipoComprobante> findRange(int[] range);

    int count();
    
}
