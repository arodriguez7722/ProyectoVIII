/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entity.Parqueadero;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Andres
 */
@Stateless
public class ParqueaderoFacade extends AbstractFacade<Parqueadero> implements ParqueaderoFacadeLocal {

    @PersistenceContext(unitName = "ParkingWord1.0-ejb_ejb_1.0.0-RC18PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParqueaderoFacade() {
        super(Parqueadero.class);
    }
    
    @Override
    public List<Parqueadero> findParqueadero(Integer idParqueadero) {
        List<Parqueadero> listaParqueadero;
        
        Query query = em.createNativeQuery("select * from parqueadero where id_parqueadero = "+idParqueadero+"", Parqueadero.class);
        
        listaParqueadero = query.getResultList();
        
        return listaParqueadero;
    }
    
}
