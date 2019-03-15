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
import com.mycompany.dao.AreaEmpleadoFacadeLocal;
import com.mycompany.entity.AreaEmpleado;

/**
 *
 * @author Andres
 */
@ManagedBean
@SessionScoped
public class AreaMB implements Serializable {

    
    @EJB
    private AreaEmpleadoFacadeLocal areaEmpleadoFacade;
     
    private AreaEmpleado area;
    private List<AreaEmpleado> listaArea;
    /**
     * Creates a new instance of AreaMB
     */
    public AreaMB() {
    }

    public List<AreaEmpleado> getListaArea() {
        listaArea = areaEmpleadoFacade.findAll();
        return listaArea;
    }
    
    

    public AreaEmpleado getArea() {
        return area;
    }

    public void setArea(AreaEmpleado area) {
        this.area = area;
    }
    
    
}
