/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Andres
 */
@Entity
@Table(name = "parqueadero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parqueadero.findAll", query = "SELECT p FROM Parqueadero p")
    , @NamedQuery(name = "Parqueadero.findByIdParqueadero", query = "SELECT p FROM Parqueadero p WHERE p.idParqueadero = :idParqueadero")
    , @NamedQuery(name = "Parqueadero.findByNombre", query = "SELECT p FROM Parqueadero p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Parqueadero.findByDireccion", query = "SELECT p FROM Parqueadero p WHERE p.direccion = :direccion")
    , @NamedQuery(name = "Parqueadero.findByTelefono", query = "SELECT p FROM Parqueadero p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "Parqueadero.findByNumeroCupos", query = "SELECT p FROM Parqueadero p WHERE p.numeroCupos = :numeroCupos")
    , @NamedQuery(name = "Parqueadero.findByEstado", query = "SELECT p FROM Parqueadero p WHERE p.estado = :estado")})
public class Parqueadero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_parqueadero")
    private Integer idParqueadero;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "numero_cupos")
    private Integer numeroCupos;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "idParqueadero")
    private List<Vehiculo> vehiculoList;

    public Parqueadero() {
    }

    public Parqueadero(Integer idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    public Integer getIdParqueadero() {
        return idParqueadero;
    }

    public void setIdParqueadero(Integer idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getNumeroCupos() {
        return numeroCupos;
    }

    public void setNumeroCupos(Integer numeroCupos) {
        this.numeroCupos = numeroCupos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }

    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParqueadero != null ? idParqueadero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parqueadero)) {
            return false;
        }
        Parqueadero other = (Parqueadero) object;
        if ((this.idParqueadero == null && other.idParqueadero != null) || (this.idParqueadero != null && !this.idParqueadero.equals(other.idParqueadero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.Parqueadero[ idParqueadero=" + idParqueadero + " ]";
    }
    
}
