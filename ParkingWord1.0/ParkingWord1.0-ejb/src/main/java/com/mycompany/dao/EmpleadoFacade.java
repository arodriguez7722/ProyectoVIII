/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entity.Empleado;
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
public class EmpleadoFacade extends AbstractFacade<Empleado> implements EmpleadoFacadeLocal {

    @PersistenceContext(unitName = "ParkingWord1.0-ejb_ejb_1.0.0-RC18PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpleadoFacade() {
        super(Empleado.class);
    }

    @Override
    public Empleado iniciarSesion(Empleado emp) {
        Empleado empLogin = null;
        String consulta;
        try {
            consulta = "SELECT e FROM Empleado e where e.usuario = ?1 AND e.pass = ?2";
            Query query = em.createQuery(consulta);
            query.setParameter(1, emp.getUsuario());
            query.setParameter(2, emp.getPass());
            
            List<Empleado> empleado = query.getResultList();
            
            if (!empleado.isEmpty()) {
                empLogin = empleado.get(0);
            }
        } catch (Exception e) {
        }
        
        return empLogin;
    }

    @Override
    public List<Empleado> findEmpleadoInicio(Empleado emp) {
        List<Empleado> listaEmpleadoInicio = null;        
        String consulta;
        try {
            consulta = "SELECT e FROM Empleado e where e.usuario = ?1";
            Query query = em.createQuery(consulta);
            query.setParameter(1, emp.getUsuario());
            
            
            listaEmpleadoInicio = query.getResultList();           
        } catch (Exception e) {
        }
        
        return listaEmpleadoInicio;
    }
    
    
}
