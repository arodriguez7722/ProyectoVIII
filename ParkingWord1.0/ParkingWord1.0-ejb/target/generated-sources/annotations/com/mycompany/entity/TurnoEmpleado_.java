package com.mycompany.entity;

import com.mycompany.entity.Empleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-23T17:56:23")
@StaticMetamodel(TurnoEmpleado.class)
public class TurnoEmpleado_ { 

    public static volatile SingularAttribute<TurnoEmpleado, String> estado;
    public static volatile SingularAttribute<TurnoEmpleado, String> turnoEmpleado;
    public static volatile ListAttribute<TurnoEmpleado, Empleado> empleadoList;
    public static volatile SingularAttribute<TurnoEmpleado, Integer> idTurnoEmpleado;

}