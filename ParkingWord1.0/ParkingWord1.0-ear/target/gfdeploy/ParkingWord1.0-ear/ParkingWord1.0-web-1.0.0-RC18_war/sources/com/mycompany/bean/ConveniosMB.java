package com.mycompany.bean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.dao.ConvenioFacadeLocal;
import com.mycompany.entity.Convenio;
import com.mycompany.entity.Empleado;
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
public class ConveniosMB implements Serializable {

    @EJB
    private ConvenioFacadeLocal convenioFacade;
    private Convenio convenio;

    private List<Convenio> listaConvenio;

    /**
     * Creates a new instance of ConveniosMB
     */
    public ConveniosMB() {
        convenio = new Convenio();
    }

    public List<Convenio> getListaConvenio() {
        listaConvenio = convenioFacade.findAll();
        return listaConvenio;
    }

    public String prepararCreate() {
        convenio = new Convenio();
        return "Convenio";
    }

    public String createConvenio() {
        convenioFacade.create(convenio);
        return prepararCreate();
    }

    public String prepararUpdate() {
        convenio = new Convenio();
        return "Convenio";
    }

    public String updateConvenio() {
        convenioFacade.edit(convenio);
        return prepararUpdate();
    }

    public void deleteConvenio() {
        convenioFacade.remove(convenio);

        convenio = new Convenio();
    }

    public void saveOrUpdate() {
        try {

            if (convenio.getIdConvenio() == null) {
                convenio.setIdConvenio(0);
            }
            if (convenioFacade.find(convenio.getIdConvenio()) != null) {
                updateConvenio();
            } else {
                createConvenio();
            }

        } catch (Exception e) {
            System.out.println("Error al guardar " + e.getMessage());
        }

    }

    public void cancel() {
        convenio = new Convenio();
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

}
