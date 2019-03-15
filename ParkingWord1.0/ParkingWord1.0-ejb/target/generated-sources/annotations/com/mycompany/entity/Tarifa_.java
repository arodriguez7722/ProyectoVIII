package com.mycompany.entity;

import com.mycompany.entity.Cupo;
import com.mycompany.entity.Pago;
import com.mycompany.entity.TipoVehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-23T17:56:22")
@StaticMetamodel(Tarifa.class)
public class Tarifa_ { 

    public static volatile SingularAttribute<Tarifa, String> estado;
    public static volatile ListAttribute<Tarifa, Cupo> cupoList;
    public static volatile SingularAttribute<Tarifa, Double> valorMinuto;
    public static volatile ListAttribute<Tarifa, Pago> pagoList;
    public static volatile SingularAttribute<Tarifa, Integer> idTarifa;
    public static volatile SingularAttribute<Tarifa, Double> valorNoche;
    public static volatile SingularAttribute<Tarifa, Double> valorHora;
    public static volatile SingularAttribute<Tarifa, Double> valorMesDiurno;
    public static volatile SingularAttribute<Tarifa, Double> valorDia;
    public static volatile SingularAttribute<Tarifa, TipoVehiculo> idtipoVehiculo;
    public static volatile SingularAttribute<Tarifa, Double> valorMesNocturna;

}