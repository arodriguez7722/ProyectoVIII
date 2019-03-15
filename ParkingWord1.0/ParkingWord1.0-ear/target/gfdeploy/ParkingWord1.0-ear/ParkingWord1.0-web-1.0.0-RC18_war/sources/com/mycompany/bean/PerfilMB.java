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
import com.mycompany.dao.PerfilEmpleadoFacadeLocal;
import com.mycompany.entity.PerfilEmpleado;

/**
 *
 * @author Andres
 */
@ManagedBean
@SessionScoped
public class PerfilMB implements Serializable {

    @EJB
    private PerfilEmpleadoFacadeLocal perfilEmpleadoFacade;
    
    private PerfilEmpleado perfil;
    private List<PerfilEmpleado> listaPerfil;
    /**
     * Creates a new instance of PerfilMB
     */
    public PerfilMB() {
        perfil = new PerfilEmpleado();
    }

    public List<PerfilEmpleado> getListaPerfil() {
        listaPerfil = perfilEmpleadoFacade.findAll();
        return listaPerfil;
    }
    
    

    public PerfilEmpleado getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilEmpleado perfil) {
        this.perfil = perfil;
    }
    
    
    
}
