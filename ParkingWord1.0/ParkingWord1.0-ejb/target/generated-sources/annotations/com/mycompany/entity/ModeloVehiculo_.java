package com.mycompany.entity;

import com.mycompany.entity.MarcaVehiculo;
import com.mycompany.entity.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-23T17:56:22")
@StaticMetamodel(ModeloVehiculo.class)
public class ModeloVehiculo_ { 

    public static volatile SingularAttribute<ModeloVehiculo, String> estado;
    public static volatile SingularAttribute<ModeloVehiculo, String> modeloVehiculo;
    public static volatile SingularAttribute<ModeloVehiculo, Integer> idModeloVehiculo;
    public static volatile SingularAttribute<ModeloVehiculo, MarcaVehiculo> idMarcaVehiculo;
    public static volatile ListAttribute<ModeloVehiculo, Vehiculo> vehiculoList;

}