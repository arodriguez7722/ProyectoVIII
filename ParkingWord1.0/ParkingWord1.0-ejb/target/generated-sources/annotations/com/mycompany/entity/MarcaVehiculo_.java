package com.mycompany.entity;

import com.mycompany.entity.ModeloVehiculo;
import com.mycompany.entity.TipoVehiculo;
import com.mycompany.entity.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-26T12:16:35")
@StaticMetamodel(MarcaVehiculo.class)
public class MarcaVehiculo_ { 

    public static volatile SingularAttribute<MarcaVehiculo, TipoVehiculo> idTipoVehiculo;
    public static volatile ListAttribute<MarcaVehiculo, ModeloVehiculo> modeloVehiculoList;
    public static volatile SingularAttribute<MarcaVehiculo, String> estado;
    public static volatile SingularAttribute<MarcaVehiculo, Integer> idmarcaVehiculo;
    public static volatile ListAttribute<MarcaVehiculo, Vehiculo> vehiculoList;
    public static volatile SingularAttribute<MarcaVehiculo, String> marcaVehiculo;

}