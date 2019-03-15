package com.mycompany.entity;

import com.mycompany.entity.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-23T17:56:23")
@StaticMetamodel(Parqueadero.class)
public class Parqueadero_ { 

    public static volatile SingularAttribute<Parqueadero, Integer> idParqueadero;
    public static volatile SingularAttribute<Parqueadero, Integer> numeroCupos;
    public static volatile SingularAttribute<Parqueadero, String> estado;
    public static volatile SingularAttribute<Parqueadero, String> direccion;
    public static volatile SingularAttribute<Parqueadero, String> telefono;
    public static volatile SingularAttribute<Parqueadero, String> nombre;
    public static volatile ListAttribute<Parqueadero, Vehiculo> vehiculoList;

}