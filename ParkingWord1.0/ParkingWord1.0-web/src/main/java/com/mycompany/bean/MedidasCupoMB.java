/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;



import com.mycompany.dao.MedidasCupoFacadeLocal;
import com.mycompany.entity.MedidasCupo;
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
public class MedidasCupoMB implements Serializable {

    @EJB
    private MedidasCupoFacadeLocal medidasCupoFacade;
    private MedidasCupo medidasCupo;
    private List<MedidasCupo> listaMedidasCupo;
    /**
     * Creates a new instance of MedidasCupoMB
     */
    public MedidasCupoMB() {
        medidasCupo = new MedidasCupo();
    }

    public List<MedidasCupo> getListaMedidasCupo() {
        listaMedidasCupo = medidasCupoFacade.findAll();
        return listaMedidasCupo;
    }

    public MedidasCupo getMedidasCupo() {
        return medidasCupo;
    }

    public void setMedidasCupo(MedidasCupo medidasCupo) {
        this.medidasCupo = medidasCupo;
    }
    
    
    
}
