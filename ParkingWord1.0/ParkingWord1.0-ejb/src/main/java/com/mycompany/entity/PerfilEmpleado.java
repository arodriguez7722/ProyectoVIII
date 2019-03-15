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
@Table(name = "perfil_empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PerfilEmpleado.findAll", query = "SELECT p FROM PerfilEmpleado p")
    , @NamedQuery(name = "PerfilEmpleado.findByIdPerfilEmpleado", query = "SELECT p FROM PerfilEmpleado p WHERE p.idPerfilEmpleado = :idPerfilEmpleado")
    , @NamedQuery(name = "PerfilEmpleado.findByPerfilEmpleado", query = "SELECT p FROM PerfilEmpleado p WHERE p.perfilEmpleado = :perfilEmpleado")
    , @NamedQuery(name = "PerfilEmpleado.findByEmpresa", query = "SELECT p FROM PerfilEmpleado p WHERE p.empresa = :empresa")
    , @NamedQuery(name = "PerfilEmpleado.findByRegistroEmpresa", query = "SELECT p FROM PerfilEmpleado p WHERE p.registroEmpresa = :registroEmpresa")
    , @NamedQuery(name = "PerfilEmpleado.findByDetalleEmpresa", query = "SELECT p FROM PerfilEmpleado p WHERE p.detalleEmpresa = :detalleEmpresa")
    , @NamedQuery(name = "PerfilEmpleado.findByUsuario", query = "SELECT p FROM PerfilEmpleado p WHERE p.usuario = :usuario")
    , @NamedQuery(name = "PerfilEmpleado.findByRegistroUsuario", query = "SELECT p FROM PerfilEmpleado p WHERE p.registroUsuario = :registroUsuario")
    , @NamedQuery(name = "PerfilEmpleado.findByDetalleUsuario", query = "SELECT p FROM PerfilEmpleado p WHERE p.detalleUsuario = :detalleUsuario")
    , @NamedQuery(name = "PerfilEmpleado.findByClientes", query = "SELECT p FROM PerfilEmpleado p WHERE p.clientes = :clientes")
    , @NamedQuery(name = "PerfilEmpleado.findByRegistroClientes", query = "SELECT p FROM PerfilEmpleado p WHERE p.registroClientes = :registroClientes")
    , @NamedQuery(name = "PerfilEmpleado.findByDetalleClientes", query = "SELECT p FROM PerfilEmpleado p WHERE p.detalleClientes = :detalleClientes")})
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
    @Column(name = "empresa")
    private Boolean empresa;
    @Column(name = "registroEmpresa")
    private Boolean registroEmpresa;
    @Column(name = "detalleEmpresa")
    private Boolean detalleEmpresa;
    @Column(name = "usuario")
    private Boolean usuario;
    @Column(name = "registroUsuario")
    private Boolean registroUsuario;
    @Column(name = "detalleUsuario")
    private Short detalleUsuario;
    @Column(name = "clientes")
    private Boolean clientes;
    @Column(name = "registroClientes")
    private Boolean registroClientes;
    @Column(name = "detalleClientes")
    private Boolean detalleClientes;
    @OneToMany(mappedBy = "idPerfilEmpleado")
    private List<Empleado> empleadoList;

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

    public Boolean getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Boolean empresa) {
        this.empresa = empresa;
    }

    public Boolean getRegistroEmpresa() {
        return registroEmpresa;
    }

    public void setRegistroEmpresa(Boolean registroEmpresa) {
        this.registroEmpresa = registroEmpresa;
    }

    public Boolean getDetalleEmpresa() {
        return detalleEmpresa;
    }

    public void setDetalleEmpresa(Boolean detalleEmpresa) {
        this.detalleEmpresa = detalleEmpresa;
    }

    public Boolean getUsuario() {
        return usuario;
    }

    public void setUsuario(Boolean usuario) {
        this.usuario = usuario;
    }

    public Boolean getRegistroUsuario() {
        return registroUsuario;
    }

    public void setRegistroUsuario(Boolean registroUsuario) {
        this.registroUsuario = registroUsuario;
    }

    public Short getDetalleUsuario() {
        return detalleUsuario;
    }

    public void setDetalleUsuario(Short detalleUsuario) {
        this.detalleUsuario = detalleUsuario;
    }

    public Boolean getClientes() {
        return clientes;
    }

    public void setClientes(Boolean clientes) {
        this.clientes = clientes;
    }

    public Boolean getRegistroClientes() {
        return registroClientes;
    }

    public void setRegistroClientes(Boolean registroClientes) {
        this.registroClientes = registroClientes;
    }

    public Boolean getDetalleClientes() {
        return detalleClientes;
    }

    public void setDetalleClientes(Boolean detalleClientes) {
        this.detalleClientes = detalleClientes;
    }

    @XmlTransient
    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
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
