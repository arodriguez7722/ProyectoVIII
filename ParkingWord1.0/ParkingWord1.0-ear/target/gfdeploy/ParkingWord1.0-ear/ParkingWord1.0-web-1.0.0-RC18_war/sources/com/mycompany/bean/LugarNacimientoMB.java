/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;


import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.mycompany.dao.LugarNacPersonaFacadeLocal;
import com.mycompany.entity.LugarNacPersona;

/**
 *
 * @author Andres
 */
@ManagedBean
@SessionScoped
public class LugarNacimientoMB implements Serializable {

    @EJB
    private LugarNacPersonaFacadeLocal lugarNacPersonaFacade;
    
    private LugarNacPersona lugarNac;
    private List<LugarNacPersona> listaLugarNac;
    
    /**
     * Creates a new instance of LugarNacimientoMB
     */
    public LugarNacimientoMB() {
        lugarNac = new LugarNacPersona();
    }

    public List<LugarNacPersona> getListaLugarNac() {
        listaLugarNac = lugarNacPersonaFacade.findAll();
        return listaLugarNac;
    }
    
    

    public LugarNacPersona getLugarNac() {
        return lugarNac;
    }

    public void setLugarNac(LugarNacPersona lugarNac) {
        this.lugarNac = lugarNac;
    }
    
    
}
