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
@Table(name = "tipo_vehiculo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoVehiculo.findAll", query = "SELECT t FROM TipoVehiculo t")
    , @NamedQuery(name = "TipoVehiculo.findByIdtipoVehiculo", query = "SELECT t FROM TipoVehiculo t WHERE t.idtipoVehiculo = :idtipoVehiculo")
    , @NamedQuery(name = "TipoVehiculo.findByTipoVehiculo", query = "SELECT t FROM TipoVehiculo t WHERE t.tipoVehiculo = :tipoVehiculo")
    , @NamedQuery(name = "TipoVehiculo.findByEstado", query = "SELECT t FROM TipoVehiculo t WHERE t.estado = :estado")})
public class TipoVehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_Vehiculo")
    private Integer idtipoVehiculo;
    @Size(max = 50)
    @Column(name = "tipo_Vehiculo")
    private String tipoVehiculo;
    @Size(max = 10)
    @Column(name = "estado")
    private String estado;
    @OneToMany(mappedBy = "idTipoVehiculo")
    private List<MarcaVehiculo> marcaVehiculoList;
    @OneToMany(mappedBy = "idtipoVehiculo")
    private List<Tarifa> tarifaList;
    @OneToMany(mappedBy = "idTipoVehiculo")
    private List<Vehiculo> vehiculoList;

    public TipoVehiculo() {
    }

    public TipoVehiculo(Integer idtipoVehiculo) {
        this.idtipoVehiculo = idtipoVehiculo;
    }

    public Integer getIdtipoVehiculo() {
        return idtipoVehiculo;
    }

    public void setIdtipoVehiculo(Integer idtipoVehiculo) {
        this.idtipoVehiculo = idtipoVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<MarcaVehiculo> getMarcaVehiculoList() {
        return marcaVehiculoList;
    }

    public void setMarcaVehiculoList(List<MarcaVehiculo> marcaVehiculoList) {
        this.marcaVehiculoList = marcaVehiculoList;
    }

    @XmlTransient
    public List<Tarifa> getTarifaList() {
        return tarifaList;
    }

    public void setTarifaList(List<Tarifa> tarifaList) {
        this.tarifaList = tarifaList;
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
        hash += (idtipoVehiculo != null ? idtipoVehiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoVehiculo)) {
            return false;
        }
        TipoVehiculo other = (TipoVehiculo) object;
        if ((this.idtipoVehiculo == null && other.idtipoVehiculo != null) || (this.idtipoVehiculo != null && !this.idtipoVehiculo.equals(other.idtipoVehiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.TipoVehiculo[ idtipoVehiculo=" + idtipoVehiculo + " ]";
    }
    
}
