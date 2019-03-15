/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;


import com.mycompany.dao.TarifaFacadeLocal;
import com.mycompany.entity.Tarifa;
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
public class TarifasMB implements Serializable {

    @EJB
    private TarifaFacadeLocal tarifaFacade;
    private Tarifa tarifa;
    private List<Tarifa> listaTarifa;
    /**
     * Creates a new instance of TarifasMB
     */
    public TarifasMB() {
        tarifa = new Tarifa();
    }

    public List<Tarifa> getListaTarifa() {
        listaTarifa =  tarifaFacade.findAll();
        return listaTarifa;
    }
    
    public String prepararCreate() {
        tarifa = new Tarifa();
        return "Tarifa";
    }

    public String createTarifa() {  
        tarifaFacade.create(tarifa);
        return prepararCreate();
    }
    
    
    
    public String prepararUpdate(){        
        tarifa = new Tarifa();        
        return "Tarifa";
    }
    
    public String updateTarifa(){        
        tarifaFacade.edit(tarifa);
        return prepararUpdate();
    }
    
    public void deleteTarifa(){
        tarifaFacade.remove(tarifa);
        tarifa = new Tarifa();        
    }
    
    
    public void saveOrUpdate() {
        try {
            
            if (tarifa.getIdTarifa()== null) {
                tarifa.setIdTarifa(0);
            }
            if (tarifaFacade.find(tarifa.getIdTarifa()) != null) {
                updateTarifa();         
            } else {
                createTarifa();
            }
            
        } catch (Exception e) {
            System.out.println("Error al guardar "+e.getMessage());
        }
        
    }
    
    

    public void cancel() {
        tarifa = new Tarifa();        
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }
    
    
    
    
    
}
