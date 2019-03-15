/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entity.ModeloVehiculo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andres
 */
@Stateless
public class ModeloVehiculoFacade extends AbstractFacade<ModeloVehiculo> implements ModeloVehiculoFacadeLocal {

    @PersistenceContext(unitName = "ParkingWord1.0-ejb_ejb_1.0.0-RC18PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ModeloVehiculoFacade() {
        super(ModeloVehiculo.class);
    }
    
}
