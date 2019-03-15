/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bean;


import com.mycompany.dao.PersonaFacadeLocal;
import com.mycompany.entity.Persona;
import java.io.Serializable;
import java.util.ArrayList;
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
public class PersonaMB implements Serializable {

    @EJB
    private PersonaFacadeLocal perosnaFacade;
    private List<String> listaLikeIdenty;
    /**
     * Creates a new instance of PersonaMB
     */
    public PersonaMB() {
    }
    
    public List<String> completeText(String query){
        listaLikeIdenty = perosnaFacade.findLikeIndenty(query);
        
        return listaLikeIdenty;
    }
    
    public List<String> completeText1(String query) {
		List<String> results = new ArrayList<String>();
		for(int i = 0; i < 10; i++) {
			results.add(query + i);
		}
		
		return results;
	}
    
}
