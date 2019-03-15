/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entity.Contrato;
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
public class ContratoFacade extends AbstractFacade<Contrato> implements ContratoFacadeLocal {

    @PersistenceContext(unitName = "ParkingWord1.0-ejb_ejb_1.0.0-RC18PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContratoFacade() {
        super(Contrato.class);
    }
    
    @Override
    public List<Contrato> findContratoPorCliente(int id) {
        List<Contrato> listaContrato;
        
        Query query = em.createNativeQuery("select * from contrato where id_persona = "+id+"", Contrato.class);
        
        listaContrato = query.getResultList();
        
        return listaContrato;
    }
    
}
