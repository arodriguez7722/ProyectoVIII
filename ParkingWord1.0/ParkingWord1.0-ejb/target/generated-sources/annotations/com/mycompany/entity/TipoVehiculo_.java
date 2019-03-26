package com.mycompany.entity;

import com.mycompany.entity.MarcaVehiculo;
import com.mycompany.entity.Tarifa;
import com.mycompany.entity.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-26T12:16:35")
@StaticMetamodel(TipoVehiculo.class)
public class TipoVehiculo_ { 

    public static volatile SingularAttribute<TipoVehiculo, String> estado;
    public static volatile SingularAttribute<TipoVehiculo, String> tipoVehiculo;
    public static volatile SingularAttribute<TipoVehiculo, Integer> idtipoVehiculo;
    public static volatile ListAttribute<TipoVehiculo, MarcaVehiculo> marcaVehiculoList;
    public static volatile ListAttribute<TipoVehiculo, Vehiculo> vehiculoList;
    public static volatile ListAttribute<TipoVehiculo, Tarifa> tarifaList;

}