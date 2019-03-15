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
import javax.faces.model.SelectItem;

import com.mycompany.dao.TipoDocPersonaFacadeLocal;
import com.mycompany.entity.TipoDocPersona;

/**
 *
 * @author Andres
 */
@ManagedBean
@SessionScoped
public class TipoDocumentoMB implements Serializable {

    @EJB
    private TipoDocPersonaFacadeLocal tipoDocPersonaFacade;
    
    private TipoDocPersona tipoDoc;
    private List<TipoDocPersona> listaTipoDoc;
    /**
     * Creates a new instance of TipoDocumentoMB
     */
    public TipoDocumentoMB() {
        tipoDoc = new TipoDocPersona();
    }

    public List<TipoDocPersona> getListaTipoDoc() {
        listaTipoDoc = tipoDocPersonaFacade.findAll();
        return listaTipoDoc;
    }
    
    

    public TipoDocPersona getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(TipoDocPersona tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    
    
    
}
