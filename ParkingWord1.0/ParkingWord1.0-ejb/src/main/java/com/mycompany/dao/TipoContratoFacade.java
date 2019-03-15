/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entity.TipoContrato;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andres
 */
@Stateless
public class TipoContratoFacade extends AbstractFacade<TipoContrato> implements TipoContratoFacadeLocal {

    @PersistenceContext(unitName = "ParkingWord1.0-ejb_ejb_1.0.0-RC18PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoContratoFacade() {
        super(TipoContrato.class);
    }
    
}
