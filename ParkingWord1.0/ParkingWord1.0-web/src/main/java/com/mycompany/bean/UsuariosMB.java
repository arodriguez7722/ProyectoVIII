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
import com.mycompany.dao.EmpleadoFacadeLocal;
import com.mycompany.dao.PersonaFacadeLocal;
import com.mycompany.dao.VehiculoFacadeLocal;
import com.mycompany.entity.Empleado;
import com.mycompany.entity.Persona;
import com.mycompany.entity.Vehiculo;
import java.util.StringTokenizer;

/**
 *
 * @author Andres
 */
@ManagedBean
@SessionScoped
public class UsuariosMB implements Serializable {

    @EJB
    private EmpleadoFacadeLocal empleadoFacade;
    @EJB
    private PersonaFacadeLocal personaFacade;
    @EJB
    private VehiculoFacadeLocal vehiculoFacade; 

    private Empleado empleado;
    private int idEmp;
    private String usuarioLogin;
    private List<Empleado> listaEmpleado;
    private List<Persona> listaEmp;
    private List<Vehiculo> listaVehPorEmpleado;
    
    
    
    

    /**
     * Creates a new instance of UsuariosMB
     */
    public UsuariosMB() {
        empleado = new Empleado();
    }

    public List<Empleado> getListaEmpleado() {
        listaEmpleado = empleadoFacade.findAll();
        return listaEmpleado;
    }

    public String prepararCreate() {
        empleado = new Empleado();
        return "Usuarios";
    }

    public String createUsuario() {
        empleado.setUsuario(createUsuarioLogin());
        personaFacade.create(empleado.getPersona());
        empleado.setIdPersona(empleado.getPersona().getIdPersona());
        empleadoFacade.create(empleado);

        return prepararCreate();
    }
    
    
    
    public String prepararUpdate(){        
        empleado = new Empleado();        
        return "Usuarios";
    }
    
    public String updateUsuario(){        
        personaFacade.edit(empleado.getPersona());
        return prepararUpdate();
    }
    
    public void deleteUsuario(){
        empleadoFacade.remove(empleado);
        personaFacade.remove(empleado.getPersona());
        empleado = new Empleado();        
    }    

    public void saveOrUpdate() {
        try {            
            if (empleado.getIdPersona()== null) {
                empleado.setIdPersona(0);
            }
            if (empleadoFacade.find(empleado.getIdPersona()) != null) {
                updateUsuario();         
            } else {
                createUsuario();
            }
            
        } catch (Exception e) {
            System.out.println("Error al guardar "+e.getMessage());
        }
        
    }
    
    public String detalleUsuario(){ 
        listaEmp = personaFacade.objectPersona(empleado.getPersona().getIdentificacion());
        idEmp = empleado.getPersona().getIdPersona(); 
        return "DetalleUsuarios?faces-redirect=true";
    }
    
    public String volverUsuario(){
        empleado = new Empleado();
        return "Usuarios?faces-redirect=true";
    } 

    public void cancel() {          
        empleado = new Empleado();        
    }

    public String createUsuarioLogin() {
        int i=0;
        String nombres, apellidos, nombresM, apellidosM;
        String letraPrimerNombre = null; 
        String letraSegundoNombre = null;
        nombres = empleado.getPersona().getNombres();
        apellidos = empleado.getPersona().getApellidos();

        nombresM = nombres.toLowerCase();
        apellidosM = apellidos.toLowerCase();

        

        StringTokenizer stPalabras = new StringTokenizer(apellidosM);

        while (stPalabras.hasMoreTokens()) {
            String sPalabra = stPalabras.nextToken();
            i++;
            if (i == 1) {
                letraPrimerNombre = sPalabra.substring(0, 1);
                usuarioLogin = nombresM+""+letraPrimerNombre;
            }else{
                letraSegundoNombre = sPalabra.substring(0, 1);
                usuarioLogin = nombresM+""+letraPrimerNombre+""+letraSegundoNombre;
            }
            
        }       
        
        return usuarioLogin;
    }

    public List<Persona> getListaEmp() {
        return listaEmp;
    }
    
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<Vehiculo> getListaVehPorEmpleado() {
        listaVehPorEmpleado =  vehiculoFacade.findVehiculosPorCliente(idEmp); 
        return listaVehPorEmpleado;
    }
    
    

}
