/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;


import com.mycompany.dao.ContratoFacadeLocal;
import com.mycompany.dao.TipoContratoFacadeLocal;
import com.mycompany.entity.Contrato;
import com.mycompany.entity.TipoContrato;
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
public class TipoContratoMB implements Serializable {

    @EJB
    private TipoContratoFacadeLocal tipoContratoFacade;
    
    private TipoContrato tipoContrato;
    private List<TipoContrato> listaTiposContratos;
    
    /**
     * Creates a new instance of TipoContratoMB
     */
    public TipoContratoMB() {
        tipoContrato = new TipoContrato();
    }

    public List<TipoContrato> getListaTiposContratos() {
        listaTiposContratos = tipoContratoFacade.findAll();
        return listaTiposContratos;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    
}
