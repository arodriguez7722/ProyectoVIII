/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Andres
 */
@Entity
@Table(name = "perfil_empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PerfilEmpleado.findAll", query = "SELECT p FROM PerfilEmpleado p")
    , @NamedQuery(name = "PerfilEmpleado.findByIdPerfilEmpleado", query = "SELECT p FROM PerfilEmpleado p WHERE p.idPerfilEmpleado = :idPerfilEmpleado")
    , @NamedQuery(name = "PerfilEmpleado.findByPerfilEmpleado", query = "SELECT p FROM PerfilEmpleado p WHERE p.perfilEmpleado = :perfilEmpleado")
    , @NamedQuery(name = "PerfilEmpleado.findByDescripcion", query = "SELECT p FROM PerfilEmpleado p WHERE p.descripcion = :descripcion")})
public class PerfilEmpleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_perfil_empleado")
    private Integer idPerfilEmpleado;
    @Size(max = 45)
    @Column(name = "perfil_empleado")
    private String perfilEmpleado;
    @Size(max = 256)
    @Column(name = "descripcion")
    private String descripcion;

    public PerfilEmpleado() {
    }

    public PerfilEmpleado(Integer idPerfilEmpleado) {
        this.idPerfilEmpleado = idPerfilEmpleado;
    }

    public Integer getIdPerfilEmpleado() {
        return idPerfilEmpleado;
    }

    public void setIdPerfilEmpleado(Integer idPerfilEmpleado) {
        this.idPerfilEmpleado = idPerfilEmpleado;
    }

    public String getPerfilEmpleado() {
        return perfilEmpleado;
    }

    public void setPerfilEmpleado(String perfilEmpleado) {
        this.perfilEmpleado = perfilEmpleado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerfilEmpleado != null ? idPerfilEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfilEmpleado)) {
            return false;
        }
        PerfilEmpleado other = (PerfilEmpleado) object;
        if ((this.idPerfilEmpleado == null && other.idPerfilEmpleado != null) || (this.idPerfilEmpleado != null && !this.idPerfilEmpleado.equals(other.idPerfilEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.PerfilEmpleado[ idPerfilEmpleado=" + idPerfilEmpleado + " ]";
    }
    
}
