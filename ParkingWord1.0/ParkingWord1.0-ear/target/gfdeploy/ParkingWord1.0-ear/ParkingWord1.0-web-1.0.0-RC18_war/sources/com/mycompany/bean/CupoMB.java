/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;


import com.mycompany.dao.CupoFacadeLocal;
import com.mycompany.dao.ParqueaderoFacadeLocal;
import com.mycompany.entity.Cupo;
import com.mycompany.entity.Parqueadero;
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
public class CupoMB implements Serializable {
    
    @EJB
    private CupoFacadeLocal cupoFacade;
    @EJB
    private ParqueaderoFacadeLocal parqueaderoFacade;
    private Cupo cupo;
    private List<Cupo> listaCupo;
    
    private Integer idParqueadero = 1;
    private Parqueadero parqueadero;
    private List<Parqueadero> listaParq;
    
    /**
     * Creates a new instance of CupoMB
     */
    public CupoMB() {
        cupo = new Cupo();
    }

    public List<Cupo> getListaCupo() {
        listaCupo = cupoFacade.findAll();
        return listaCupo;
    }
    
    
    public String prepararCreate() {
        cupo = new Cupo();
        return "Usuarios";
    }

    public String createCupo() {         
        cupoFacade.create(cupo);
        return prepararCreate();
    }   
    
    public String prepararUpdate(){        
        cupo = new Cupo();        
        return "Cupo";
    }
    
    public String updateCupo(){        
        cupoFacade.edit(cupo);
        return prepararUpdate();
    }
    
    public void deleteCupo(){
        cupoFacade.remove(cupo);
        cupo = new Cupo();        
    }
    
    
    public void saveOrUpdate() {
        try {
            
            if (cupo.getIdCupo()== null) {
                cupo.setIdCupo(0);
            }
            if (cupoFacade.find(cupo.getIdCupo()) != null) {
                updateCupo();         
            } else {
                createCupo();
            }
            
        } catch (Exception e) {
            System.out.println("Error al guardar "+e.getMessage());
        }
        
    }
    
    

    public void cancel() {
        cupo = new Cupo();        
    }

    public Cupo getCupo() {
        return cupo;
    }

    public void setCupo(Cupo cupo) {
        this.cupo = cupo;
    }
    
    
}
