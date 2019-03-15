/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;


import com.mycompany.dao.PisoCupoFacadeLocal;
import com.mycompany.entity.PisoCupo;
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
public class PisoCupoMB implements Serializable {
    
    @EJB
    private PisoCupoFacadeLocal pisoCupoFacade;
    private PisoCupo pisoCupo;
    private List<PisoCupo> listaPisoCupo;
    /**
     * Creates a new instance of PisoCupoMB
     */
    public PisoCupoMB() {
        pisoCupo = new PisoCupo();
    }
    

    public List<PisoCupo> getListaPisoCupo() {
        listaPisoCupo = pisoCupoFacade.findAll();
        return listaPisoCupo;
    }

    public PisoCupo getPisoCupo() {
        return pisoCupo;
    }

    public void setPisoCupo(PisoCupo pisoCupo) {
        this.pisoCupo = pisoCupo;
    }
    
    
    
}
