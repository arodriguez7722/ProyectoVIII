/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;

import com.mycompany.dao.EmpresaFacadeLocal;
import com.mycompany.entity.Empleado;
import com.mycompany.entity.Empresa;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Andres
 */
@Named(value = "EmpresaMB")
@SessionScoped
public class EmpresaMB implements Serializable {
    @EJB
    private EmpresaFacadeLocal empresaFacade;
    private Empresa empresa;
    private List <Empresa> listaEmpresa;
    
    /**
     * Creates a new instance of EmpresaMB
     */
    public EmpresaMB() {
        empresa = new Empresa();
    }

    public List<Empresa> getListaEmpresa() {
        listaEmpresa = empresaFacade.findAll();
        return listaEmpresa;
    }
    
    public String prepararCreate() {
        empresa = new Empresa();
        return "Usuarios";
    }

    public String createEmpresa() {        
        empresaFacade.create(empresa);      

        return prepararCreate();
    }
    
    
    
    public String prepararUpdate(){        
        empresa = new Empresa();        
        return "Usuarios";
    }
    
    public String updateEmpresa(){        
        empresaFacade.edit(empresa);
        return prepararUpdate();
    }
    
    public void deleteEmpresa(){
        empresaFacade.remove(empresa);
        
        empresa = new Empresa();        
    }
    
    public String detalleEmpresa(){        
        return "DetalleEmpresa";
    }
    
     

    public void saveOrUpdate() {
        try {
            
            if (empresa.getIdEmpresa()== null) {
                empresa.setIdEmpresa(0);
            }
            if (empresaFacade.find(empresa.getIdEmpresa()) != null) {
                updateEmpresa();         
            } else {
                createEmpresa();
            }
            
        } catch (Exception e) {
            System.out.println("Error al guardar "+e.getMessage());
        }
        
    }
    
    public String volverEmpresa(){
        empresa = new Empresa();
        return "Empresa";
    } 

    public void cancel() {
        empresa = new Empresa();        
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
    
    
    
    
}
