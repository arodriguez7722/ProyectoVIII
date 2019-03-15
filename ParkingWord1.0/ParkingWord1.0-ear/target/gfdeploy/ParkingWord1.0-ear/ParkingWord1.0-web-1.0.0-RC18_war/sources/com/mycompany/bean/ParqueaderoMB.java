/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;


import com.mycompany.dao.ParqueaderoFacadeLocal;
import com.mycompany.entity.Convenio;
import com.mycompany.entity.Parqueadero;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Andres
 */
@ManagedBean
@SessionScoped
public class ParqueaderoMB implements Serializable {

    @EJB
    private ParqueaderoFacadeLocal parqueaderoFacade;
    
    private Parqueadero parqueadero;
    private List<Parqueadero> listaParqueadero;
    private Integer numeroCupos;
    
    
    
    private List<Parqueadero> listaPrueba;
    /**
     * Creates a new instance of ParqueaderoMB
     */
    public ParqueaderoMB() {        
        parqueadero = new Parqueadero();
        numeroCupos = 0;
    }

    public List<Parqueadero> getListaParqueadero() {
        listaParqueadero = parqueaderoFacade.findAll();
        return listaParqueadero;
    }
    
    public String prepararCreate() {
        parqueadero = new Parqueadero();
        return "Parqueadero";
    }

    public String createParqueadero() {
        parqueadero.setNumeroCupos(numeroCupos);
        parqueaderoFacade.create(parqueadero);
        return prepararCreate();
    }

    public String prepararUpdate() {
        parqueadero = new Parqueadero();
        return "Parqueadero";
    }

    public String updateParqueadero() {        
        parqueaderoFacade.edit(parqueadero);
        return prepararUpdate();
    }

    public void deleteParqueadero() {
        parqueaderoFacade.remove(parqueadero);

        parqueadero = new Parqueadero();
    }

    public void saveOrUpdate() {
        try {
            System.out.println("hola");
            if (parqueadero.getIdParqueadero()== null) {
                parqueadero.setIdParqueadero(0);
            }
            if (parqueaderoFacade.find(parqueadero.getIdParqueadero()) != null) {
                updateParqueadero();
            } else {
                createParqueadero();
            }

        } catch (Exception e) {
            System.out.println("Error al guardar " + e.getMessage());
        }

    }

    public void cancel() {
        parqueadero = new Parqueadero();
    }
    
    public void aumentaNumeroCupos(Parqueadero parq){
        parqueadero = parq;
        /*Integer aumento = new Integer(1);
        numeroCupos = parqueadero.getNumeroCupos() + aumento;  
        
        parqueadero.setNumeroCupos(numeroCupos);*/
        updateParqueadero();
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    public int getNumeroCupos() {        
        return numeroCupos;
    }

    public void setNumeroCupos(int numeroCupos) {
        this.numeroCupos = numeroCupos;
    }
    
    
    
    
}
