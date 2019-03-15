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
import com.mycompany.dao.TurnoEmpleadoFacadeLocal;
import com.mycompany.entity.TurnoEmpleado;

/**
 *
 * @author Andres
 */
@ManagedBean
@SessionScoped
public class turnoMB implements Serializable {

    @EJB
    private TurnoEmpleadoFacadeLocal turnoEmpleadoFacadeLocal;
    
    private TurnoEmpleado turno;
    private List<TurnoEmpleado> listaTurno;
    
    /**
     * Creates a new instance of turnoMB
     */
    public turnoMB() {
        turno = new TurnoEmpleado();
    }

    public List<TurnoEmpleado> getListaTurno() {
        listaTurno = turnoEmpleadoFacadeLocal.findAll();
        return listaTurno;
    }
    
    
    

    public TurnoEmpleado getTurno() {
        return turno;
    }

    public void setTurno(TurnoEmpleado turno) {
        this.turno = turno;
    }
    
    
}
