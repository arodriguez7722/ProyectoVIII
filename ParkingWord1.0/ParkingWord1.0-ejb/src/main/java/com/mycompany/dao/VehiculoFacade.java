/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entity.Persona;
import com.mycompany.entity.Vehiculo;
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
public class VehiculoFacade extends AbstractFacade<Vehiculo> implements VehiculoFacadeLocal {

    @PersistenceContext(unitName = "ParkingWord1.0-ejb_ejb_1.0.0-RC18PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VehiculoFacade() {
        super(Vehiculo.class);
    }
    
    @Override
    public List<Vehiculo> findVehiculosPorCliente(int idPersona) {
        List<Vehiculo> listaVehPorCliente;        
        Query query = em.createNativeQuery("select * from vehiculo where id_persona  = "+idPersona+"", Vehiculo.class);
        listaVehPorCliente = query.getResultList();
        
        return listaVehPorCliente;
    }

    @Override
    public List<String> findLikePlaca(String placa) {
        List<String> listaPlaca;
        
        Query query = em.createNativeQuery("select placa from vehiculo where placa like '"+placa+"%'");
        
        listaPlaca = query.getResultList();
        
        return listaPlaca;
    }

    @Override
    public List<Vehiculo> objectVehiculo(String placa) {
        List<Vehiculo> listaVehiculo;        
        Query query = em.createNativeQuery("select * from Vehiculo  where placa = '"+placa+"'", Persona.class);
        listaVehiculo = query.getResultList();
        
        return listaVehiculo;
    }

    @Override
    public Vehiculo vehiculoSegunCliente(String placa) {
        Vehiculo vehiculoSegunCliente = null;
        String consulta;
        try {
            consulta = "SELECT v FROM Vehiculo v where e.placa = ?1 ";
            Query query = em.createQuery(consulta);
            query.setParameter(1, placa);
            
            
            List<Vehiculo> vehiculo = query.getResultList();
            
            if (!vehiculo.isEmpty()) {
                vehiculoSegunCliente = vehiculo.get(0);
            }
        } catch (Exception e) {
        }
        
        return vehiculoSegunCliente;
    }
    
    
}
