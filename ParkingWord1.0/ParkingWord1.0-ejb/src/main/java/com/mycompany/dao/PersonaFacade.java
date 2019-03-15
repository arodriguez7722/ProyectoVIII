/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entity.Persona;
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
public class PersonaFacade extends AbstractFacade<Persona> implements PersonaFacadeLocal {

    @PersistenceContext(unitName = "ParkingWord1.0-ejb_ejb_1.0.0-RC18PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaFacade() {
        super(Persona.class);
    }
    
    @Override
    public List<Persona> objectPersona(String identificacion) {
        List<Persona> listaPersona;        
        Query query = em.createNativeQuery("select * from Persona  where identificacion = "+identificacion+"", Persona.class);
        listaPersona = query.getResultList();
        
        return listaPersona;
    }

    @Override
    public List<String> findLikeIndenty(String identy) {
        List<String> listaIndenty;
        
        Query query = em.createNativeQuery("select identificacion from persona where identificacion like '"+identy+"%'");
        
        listaIndenty = query.getResultList();
        
        return listaIndenty;
    }
    
}
