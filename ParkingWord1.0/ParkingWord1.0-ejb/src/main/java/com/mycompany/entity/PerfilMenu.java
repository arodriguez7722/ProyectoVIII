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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Andres
 */
@Entity
@Table(name = "perfil_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PerfilMenu.findAll", query = "SELECT p FROM PerfilMenu p")
    , @NamedQuery(name = "PerfilMenu.findByIdPerfilmenu", query = "SELECT p FROM PerfilMenu p WHERE p.idPerfilmenu = :idPerfilmenu")})
public class PerfilMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPerfil_menu")
    private Integer idPerfilmenu;
    @JoinColumn(name = "id_menu", referencedColumnName = "id_menu")
    @ManyToOne
    private Menu idMenu;
    @JoinColumn(name = "id_perfil_empleado", referencedColumnName = "id_perfil_empleado")
    @ManyToOne
    private PerfilEmpleado idPerfilEmpleado;

    public PerfilMenu() {
    }

    public PerfilMenu(Integer idPerfilmenu) {
        this.idPerfilmenu = idPerfilmenu;
    }

    public Integer getIdPerfilmenu() {
        return idPerfilmenu;
    }

    public void setIdPerfilmenu(Integer idPerfilmenu) {
        this.idPerfilmenu = idPerfilmenu;
    }

    public Menu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Menu idMenu) {
        this.idMenu = idMenu;
    }

    public PerfilEmpleado getIdPerfilEmpleado() {
        return idPerfilEmpleado;
    }

    public void setIdPerfilEmpleado(PerfilEmpleado idPerfilEmpleado) {
        this.idPerfilEmpleado = idPerfilEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerfilmenu != null ? idPerfilmenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfilMenu)) {
            return false;
        }
        PerfilMenu other = (PerfilMenu) object;
        if ((this.idPerfilmenu == null && other.idPerfilmenu != null) || (this.idPerfilmenu != null && !this.idPerfilmenu.equals(other.idPerfilmenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.PerfilMenu[ idPerfilmenu=" + idPerfilmenu + " ]";
    }
    
}
