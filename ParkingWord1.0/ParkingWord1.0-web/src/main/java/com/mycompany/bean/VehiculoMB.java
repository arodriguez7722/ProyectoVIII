/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;

import com.mycompany.dao.PersonaFacadeLocal;
import com.mycompany.dao.VehiculoFacadeLocal;
import com.mycompany.entity.Persona;
import com.mycompany.entity.Vehiculo;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.PrimeFaces;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Andres
 */
@ManagedBean
@SessionScoped
public class VehiculoMB implements Serializable {

    @EJB
    private VehiculoFacadeLocal vehiculoFacade;
    @EJB
    private PersonaFacadeLocal personaFacade;

    private Vehiculo vehiculo;
    private Persona persona;
    private String identificacion = null;
    private List<Vehiculo> listaVehiculo;
    private List<Persona> listaPersona;
    
    

    public VehiculoMB() {
        vehiculo = new Vehiculo();
    }

    public List<Vehiculo> getListaVehiculo() {
        listaVehiculo = vehiculoFacade.findAll();
        return listaVehiculo;
    }

    public String prepararCreate() {
        vehiculo = new Vehiculo();
        identificacion = null;
        return "Vehiculo";
    }

    public String createVehiculo() {
        vehiculoFacade.create(vehiculo);
        return prepararCreate();
    }

    public String prepararUpdate() {
        vehiculo = new Vehiculo();
        identificacion = null;
        return "Vehiculo";
    }

    public String updateVehiculo() {
        vehiculoFacade.edit(vehiculo);
        return prepararUpdate();
    }

    public void deleteVehiculo() {
        vehiculoFacade.remove(vehiculo);
        vehiculo = new Vehiculo();
    }

    public void saveOrUpdate() {

        try {
            if (vehiculo.getIdVehiculo() == null) {
                vehiculo.setIdVehiculo(0);
            }
            if (vehiculoFacade.find(vehiculo.getIdVehiculo()) != null) {
                updateVehiculo();
            } else {
                if (identificacion != null) {
                    if (personaFacade.objectPersona(identificacion).size() > 0) {
                        listaPersona = personaFacade.objectPersona(identificacion);
                        vehiculo.setIdPersona(listaPersona.get(0));
                        createVehiculo();
                    }else{
                        RequestContext current = RequestContext.getCurrentInstance();                        
                        current.execute("PF('dlgValidaCliente').show();");                        
                    }
                } else {
                    createVehiculo();
                }

            }

        } catch (Exception e) {
            System.out.println("Error al guardar " + e.getMessage());
        }

    }
    
    public void crearClienteDiario(){
        RequestContext request = RequestContext.getCurrentInstance();
        request.execute("PF('dlgRegistrarCliente').show();");
    }

    public void cancel() {
        vehiculo = new Vehiculo();
        identificacion = null;
    }

    public String recuperaValorIdEditando(Vehiculo vh) {
        identificacion = vh.getIdPersona().getIdentificacion();
        return "Vehiculo";
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

}
