/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;


import com.mycompany.dao.TipoCupoFacadeLocal;
import com.mycompany.entity.TipoCupo;
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
public class TipoCupoMB implements Serializable {

    @EJB
    private TipoCupoFacadeLocal tipoCupoFacade;
    private TipoCupo TipoCupo;
    private List<TipoCupo> listaTipoCupo;
    
    /**
     * Creates a new instance of TipoCupoMB
     */
    public TipoCupoMB() {
        TipoCupo = new TipoCupo();
    }

    public List<TipoCupo> getListaTipoCupo() {
        listaTipoCupo = tipoCupoFacade.findAll();
        return listaTipoCupo;
    }

    public TipoCupo getTipoCupo() {
        return TipoCupo;
    }

    public void setTipoCupo(TipoCupo TipoCupo) {
        this.TipoCupo = TipoCupo;
    }
    
    
    
}
