/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;

import com.mycompany.dao.ClienteFacadeLocal;
import com.mycompany.dao.ContratoFacadeLocal;
import java.io.Serializable;



import java.util.List;
import javax.ejb.EJB;
import com.mycompany.dao.PersonaFacadeLocal;
import com.mycompany.dao.VehiculoFacadeLocal;
import com.mycompany.entity.Cliente;
import com.mycompany.entity.Contrato;
import com.mycompany.entity.Persona;
import com.mycompany.entity.Vehiculo;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Andres
 */
@ManagedBean
@SessionScoped
public class ClientesMB implements Serializable {

    @EJB
    private ClienteFacadeLocal clienteFacade;
    @EJB
    private PersonaFacadeLocal personaFacade;
    @EJB
    private VehiculoFacadeLocal vehiculoFacade; 
    @EJB
    private ContratoFacadeLocal contratoFacade;

    private Cliente cliente;
    private int idClient;
    private List<Cliente> listaCliente;    
    private List<Persona> listaCli;
    private List<Vehiculo> listaVehPorCliente;
    private List<Contrato> listaContratoPorCliente;
    
    
    public ClientesMB() {        
        cliente = new Cliente();
    }    

    public List<Cliente> getListaCliente() {
        listaCliente = clienteFacade.findAll();
        return listaCliente;
    }
    
    public String prepararCreate() {
        cliente = new Cliente();
        return "Clientes";
    }
    
    public String createCliente() {         
        personaFacade.create(cliente.getPersona());
        cliente.setIdPersona(cliente.getPersona().getIdPersona());        
        clienteFacade.create(cliente);

        return prepararCreate();
    }    
    
    public String prepararUpdate(){        
        cliente = new Cliente();        
        return "Clientes";
    }    
    
    public String updateCliente(){        
        personaFacade.edit(cliente.getPersona());
        return prepararUpdate();
    }    
    
    public void deleteCliente(){
        personaFacade.remove(cliente.getPersona());
        clienteFacade.remove(cliente);        
        cliente = new Cliente();        
    }    
    
    public void saveOrUpdate() {
        System.out.println("hola");
        try {            
            if (cliente.getIdPersona()== null) {
                cliente.setIdPersona(0);
            }
            if (clienteFacade.find(cliente.getIdPersona()) != null) {
                updateCliente();         
            } else {
                createCliente();                
            }
            
        } catch (Exception e) {
            System.out.println("Error al guardar "+e.getMessage());
        }
        
    }
    
    public String contratoCliente(){               
        listaCli = personaFacade.objectPersona(cliente.getPersona().getIdentificacion());
        idClient = cliente.getPersona().getIdPersona();        
        return "ContratosClientes?faces-redirect=true";
    }
    
    public String detalleCliente(){               
        listaCli = personaFacade.objectPersona(cliente.getPersona().getIdentificacion());
        idClient = cliente.getPersona().getIdPersona();        
        return "DetalleClientes?faces-redirect=true";
    }
    
    public String volverCliente(){
        cliente = new Cliente();
        return "Clientes?faces-redirect=true";
    }
    
    public void cancel() {
        cliente = new Cliente();        
    }

    public Cliente getCliente() {
        return cliente;
    }    

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Persona> getListaCli() {
        return listaCli;
    }
    
    public List<Vehiculo> getListaVehPorCliente() {
        listaVehPorCliente =  vehiculoFacade.findVehiculosPorCliente(idClient); 
        return listaVehPorCliente;
    } 

    public List<Contrato> getListaContratoPorCliente() {
        listaContratoPorCliente = contratoFacade.findContratoPorCliente(idClient);
        return listaContratoPorCliente;
    }
    
    

    

   
    
    

    
    
    

    

}
