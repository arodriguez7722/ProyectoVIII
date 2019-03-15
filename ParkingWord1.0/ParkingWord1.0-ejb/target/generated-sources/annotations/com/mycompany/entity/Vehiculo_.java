package com.mycompany.entity;

import com.mycompany.entity.ColorVehiculo;
import com.mycompany.entity.MarcaVehiculo;
import com.mycompany.entity.ModeloVehiculo;
import com.mycompany.entity.Parqueadero;
import com.mycompany.entity.Persona;
import com.mycompany.entity.Reserva;
import com.mycompany.entity.TipoVehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-23T17:56:23")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, Parqueadero> idParqueadero;
    public static volatile SingularAttribute<Vehiculo, TipoVehiculo> idTipoVehiculo;
    public static volatile SingularAttribute<Vehiculo, Integer> idVehiculo;
    public static volatile ListAttribute<Vehiculo, Reserva> reservaList;
    public static volatile SingularAttribute<Vehiculo, ColorVehiculo> idColorVehiculo;
    public static volatile SingularAttribute<Vehiculo, ModeloVehiculo> idModeloVehiculo;
    public static volatile SingularAttribute<Vehiculo, MarcaVehiculo> idMarcaVehiculo;
    public static volatile SingularAttribute<Vehiculo, Persona> idPersona;
    public static volatile SingularAttribute<Vehiculo, String> placa;

}