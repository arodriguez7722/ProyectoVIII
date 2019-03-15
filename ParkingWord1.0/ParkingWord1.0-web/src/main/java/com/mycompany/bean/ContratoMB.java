/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;


import com.mycompany.dao.ContratoFacadeLocal;
import com.mycompany.entity.Contrato;
import com.mycompany.entity.Vehiculo;
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
public class ContratoMB implements Serializable {

    @EJB
    private ContratoFacadeLocal contratoFacade;
    
    private Contrato contrato;    
    private List<Contrato> listaContratos;    
    private List<Vehiculo> listaContratoPorCliente;
    /**
     * Creates a new instance of ContratoMB
     */
    public ContratoMB() {
        contrato = new Contrato();
    }

    public List<Contrato> getListaContratos() {
        listaContratos = contratoFacade.findAll();
        return listaContratos;
    }
    
     public String prepararCreate() {
        contrato = new Contrato();
        return "Contrato";
    }
    
    public String createContrato() {               
        contratoFacade.create(contrato);
        return prepararCreate();
    }    
    
    public String prepararUpdate(){        
        contrato = new Contrato();        
        return "Contrato";
    }    
    
    public String updateContrato(){        
        contratoFacade.edit(contrato);
        return prepararUpdate();
    }    
    
    public void deleteContrato(){        
        contratoFacade.remove(contrato);        
        contrato = new Contrato();        
    }    
    
    public void saveOrUpdate() {
        System.out.println("hola");
        try {            
            if (contrato.getIdContrato()== null) {
                contrato.setIdContrato(0);
            }
            if (contratoFacade.find(contrato.getIdContrato()) != null) {
                updateContrato();         
            } else {
                createContrato();                
            }
            
        } catch (Exception e) {
            System.out.println("Error al guardar "+e.getMessage());
        }
        
    }
    
    public void cancel() {
        contrato = new Contrato();
    }   
    
    /*public List<Vehiculo> getListaContratoPorCliente() {
        listaContratoPorCliente =  vehiculoFacade.findVehiculosPorCliente(idClient); 
        return listaContratoPorCliente;
    }*/ 

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    
    

    
    
    
    
}
