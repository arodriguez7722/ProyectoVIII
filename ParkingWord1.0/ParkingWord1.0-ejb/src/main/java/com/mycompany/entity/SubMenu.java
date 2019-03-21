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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Andres
 */
@Entity
@Table(name = "sub_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubMenu.findAll", query = "SELECT s FROM SubMenu s")
    , @NamedQuery(name = "SubMenu.findByIdSubMenu", query = "SELECT s FROM SubMenu s WHERE s.idSubMenu = :idSubMenu")
    , @NamedQuery(name = "SubMenu.findByNombre", query = "SELECT s FROM SubMenu s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "SubMenu.findByRuta", query = "SELECT s FROM SubMenu s WHERE s.ruta = :ruta")
    , @NamedQuery(name = "SubMenu.findByDescripcion", query = "SELECT s FROM SubMenu s WHERE s.descripcion = :descripcion")})
public class SubMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sub_menu")
    private Integer idSubMenu;
    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 200)
    @Column(name = "ruta")
    private String ruta;
    @Size(max = 256)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "id_menu", referencedColumnName = "id_menu")
    @ManyToOne
    private Menu idMenu;

    public SubMenu() {
    }

    public SubMenu(Integer idSubMenu) {
        this.idSubMenu = idSubMenu;
    }

    public Integer getIdSubMenu() {
        return idSubMenu;
    }

    public void setIdSubMenu(Integer idSubMenu) {
        this.idSubMenu = idSubMenu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Menu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Menu idMenu) {
        this.idMenu = idMenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSubMenu != null ? idSubMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubMenu)) {
            return false;
        }
        SubMenu other = (SubMenu) object;
        if ((this.idSubMenu == null && other.idSubMenu != null) || (this.idSubMenu != null && !this.idSubMenu.equals(other.idSubMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.SubMenu[ idSubMenu=" + idSubMenu + " ]";
    }
    
}
