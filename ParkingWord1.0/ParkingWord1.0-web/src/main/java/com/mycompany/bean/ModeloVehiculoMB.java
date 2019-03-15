/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;


import com.mycompany.dao.ModeloVehiculoFacadeLocal;
import com.mycompany.entity.ModeloVehiculo;
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
public class ModeloVehiculoMB implements Serializable {
    
    @EJB
    private ModeloVehiculoFacadeLocal modeloVehiculoFacade;
    private ModeloVehiculo modeloVehiculo;
    private List<ModeloVehiculo> listaModeloVehiculo;
    /**
     * Creates a new instance of ModeloVehiculo
     */
    public ModeloVehiculoMB() {
        modeloVehiculo = new ModeloVehiculo();
    }

    public List<ModeloVehiculo> getListaModeloVehiculo() {
        listaModeloVehiculo = modeloVehiculoFacade.findAll();
        return listaModeloVehiculo;
    }
    
    public ModeloVehiculo getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(ModeloVehiculo modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }
    
    
    
}
