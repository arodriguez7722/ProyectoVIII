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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "tarifa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarifa.findAll", query = "SELECT t FROM Tarifa t")
    , @NamedQuery(name = "Tarifa.findByIdTarifa", query = "SELECT t FROM Tarifa t WHERE t.idTarifa = :idTarifa")
    , @NamedQuery(name = "Tarifa.findByValorMinuto", query = "SELECT t FROM Tarifa t WHERE t.valorMinuto = :valorMinuto")
    , @NamedQuery(name = "Tarifa.findByValorHora", query = "SELECT t FROM Tarifa t WHERE t.valorHora = :valorHora")
    , @NamedQuery(name = "Tarifa.findByValorDia", query = "SELECT t FROM Tarifa t WHERE t.valorDia = :valorDia")
    , @NamedQuery(name = "Tarifa.findByValorNoche", query = "SELECT t FROM Tarifa t WHERE t.valorNoche = :valorNoche")
    , @NamedQuery(name = "Tarifa.findByValorMesDiurno", query = "SELECT t FROM Tarifa t WHERE t.valorMesDiurno = :valorMesDiurno")
    , @NamedQuery(name = "Tarifa.findByValorMesNocturna", query = "SELECT t FROM Tarifa t WHERE t.valorMesNocturna = :valorMesNocturna")
    , @NamedQuery(name = "Tarifa.findByEstado", query = "SELECT t FROM Tarifa t WHERE t.estado = :estado")})
public class Tarifa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tarifa")
    private Integer idTarifa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor_minuto")
    private Double valorMinuto;
    @Column(name = "valor_hora")
    private Double valorHora;
    @Column(name = "valor_dia")
    private Double valorDia;
    @Column(name = "valor_noche")
    private Double valorNoche;
    @Column(name = "valor_mes_diurno")
    private Double valorMesDiurno;
    @Column(name = "valor_mes_nocturna")
    private Double valorMesNocturna;
    @Size(max = 15)
    @Column(name = "estado")
    private String estado;
    @ManyToMany(mappedBy = "tarifaList")
    private List<Cupo> cupoList;
    @JoinColumn(name = "id_tipo_Vehiculo", referencedColumnName = "id_tipo_Vehiculo")
    @ManyToOne
    private TipoVehiculo idtipoVehiculo;
    @OneToMany(mappedBy = "idTarifa")
    private List<Pago> pagoList;

    public Tarifa() {
        idtipoVehiculo = new TipoVehiculo();
    }

    public Tarifa(Integer idTarifa) {
        this.idTarifa = idTarifa;
    }

    public Integer getIdTarifa() {
        return idTarifa;
    }

    public void setIdTarifa(Integer idTarifa) {
        this.idTarifa = idTarifa;
    }

    public Double getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(Double valorMinuto) {
        this.valorMinuto = valorMinuto;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorDia() {
        return valorDia;
    }

    public void setValorDia(Double valorDia) {
        this.valorDia = valorDia;
    }

    public Double getValorNoche() {
        return valorNoche;
    }

    public void setValorNoche(Double valorNoche) {
        this.valorNoche = valorNoche;
    }

    public Double getValorMesDiurno() {
        return valorMesDiurno;
    }

    public void setValorMesDiurno(Double valorMesDiurno) {
        this.valorMesDiurno = valorMesDiurno;
    }

    public Double getValorMesNocturna() {
        return valorMesNocturna;
    }

    public void setValorMesNocturna(Double valorMesNocturna) {
        this.valorMesNocturna = valorMesNocturna;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Cupo> getCupoList() {
        return cupoList;
    }

    public void setCupoList(List<Cupo> cupoList) {
        this.cupoList = cupoList;
    }

    public TipoVehiculo getIdtipoVehiculo() {
        return idtipoVehiculo;
    }

    public void setIdtipoVehiculo(TipoVehiculo idtipoVehiculo) {
        this.idtipoVehiculo = idtipoVehiculo;
    }

    @XmlTransient
    public List<Pago> getPagoList() {
        return pagoList;
    }

    public void setPagoList(List<Pago> pagoList) {
        this.pagoList = pagoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTarifa != null ? idTarifa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarifa)) {
            return false;
        }
        Tarifa other = (Tarifa) object;
        if ((this.idTarifa == null && other.idTarifa != null) || (this.idTarifa != null && !this.idTarifa.equals(other.idTarifa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.Tarifa[ idTarifa=" + idTarifa + " ]";
    }
    
}
