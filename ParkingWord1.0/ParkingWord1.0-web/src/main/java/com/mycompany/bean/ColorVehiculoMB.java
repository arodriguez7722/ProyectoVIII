/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;


import com.mycompany.dao.ColorVehiculoFacadeLocal;
import com.mycompany.entity.ColorVehiculo;
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
public class ColorVehiculoMB implements Serializable {

    @EJB
    private ColorVehiculoFacadeLocal colorVehiculoFacade;
    private ColorVehiculo colorVehiculo;
    private List<ColorVehiculo> ListaColorVehiculo;
    /**
     * Creates a new instance of ColorVehiculo
     */
    public ColorVehiculoMB() {
        colorVehiculo = new ColorVehiculo();
    }

    public List<ColorVehiculo> getListaColorVehiculo() {
        ListaColorVehiculo = colorVehiculoFacade.findAll();
        return ListaColorVehiculo;
    }

    public ColorVehiculo getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(ColorVehiculo colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }
    
    
    
    

    
    
    
}
