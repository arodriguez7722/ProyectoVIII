/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;


import com.mycompany.dao.MarcaVehiculoFacadeLocal;
import com.mycompany.entity.MarcaVehiculo;
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
public class MarcaVehiculoMB implements Serializable {
    
    @EJB
    private MarcaVehiculoFacadeLocal marcaVehiculoFacade;
    private MarcaVehiculo marcaVehiculo;
    private List<MarcaVehiculo> listaMarcaVehiculo;
    /**
     * Creates a new instance of MarcaVehiculo
     */
    public MarcaVehiculoMB() {
        marcaVehiculo = new MarcaVehiculo();
    }

    public List<MarcaVehiculo> getListaMarcaVehiculo() {
        listaMarcaVehiculo = marcaVehiculoFacade.findAll();
        return listaMarcaVehiculo;
    }

    public MarcaVehiculo getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(MarcaVehiculo marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }
    
    
    
}
