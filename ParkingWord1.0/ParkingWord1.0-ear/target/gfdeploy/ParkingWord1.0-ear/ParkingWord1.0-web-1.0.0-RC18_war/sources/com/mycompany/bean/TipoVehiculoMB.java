/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;


import com.mycompany.dao.TipoVehiculoFacadeLocal;
import com.mycompany.entity.Cupo;
import com.mycompany.entity.TipoVehiculo;
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
public class TipoVehiculoMB implements Serializable {

    @EJB
    private TipoVehiculoFacadeLocal tipoVehiculoFacade;
    private TipoVehiculo tipoVehiculo;
    private List<TipoVehiculo> listaTipoVehiculo;
    /**
     * Creates a new instance of TipoVehiculoMB
     */
    public TipoVehiculoMB() {
        tipoVehiculo = new TipoVehiculo();
    }

    public List<TipoVehiculo> getListaTipoVehiculo() {
        listaTipoVehiculo = tipoVehiculoFacade.findAll();
        return listaTipoVehiculo;
    }

    public String prepararCreate() {
        tipoVehiculo = new TipoVehiculo();
        return "Usuarios";
    }

    public String createTipoVehiculo() {        
        tipoVehiculoFacade.create(tipoVehiculo);
        return prepararCreate();
    }
    
    
    
    public String prepararUpdate(){        
        tipoVehiculo = new TipoVehiculo();        
        return "Cupo";
    }
    
    public String updateTipoVehiculo(){        
        tipoVehiculoFacade.edit(tipoVehiculo);
        return prepararUpdate();
    }
    
    public void deleteTipoVehiculo(){
        tipoVehiculoFacade.remove(tipoVehiculo);
        tipoVehiculo = new TipoVehiculo();        
    }
    
    
    public void saveOrUpdate() {
        try {
            
            if (tipoVehiculo.getIdtipoVehiculo()== null) {
                tipoVehiculo.setIdtipoVehiculo(0);
            }
            if (tipoVehiculoFacade.find(tipoVehiculo.getIdtipoVehiculo()) != null) {
                updateTipoVehiculo();         
            } else {
                createTipoVehiculo();
            }
            
        } catch (Exception e) {
            System.out.println("Error al guardar "+e.getMessage());
        }
        
    }
    
    public void cancel() {
        tipoVehiculo = new TipoVehiculo();        
    }
    
    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
    
    
    
    
}
