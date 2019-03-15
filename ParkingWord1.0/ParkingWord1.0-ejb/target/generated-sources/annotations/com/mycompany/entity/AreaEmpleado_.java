package com.mycompany.entity;

import com.mycompany.entity.Empleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-23T17:56:23")
@StaticMetamodel(AreaEmpleado.class)
public class AreaEmpleado_ { 

    public static volatile SingularAttribute<AreaEmpleado, String> estado;
    public static volatile ListAttribute<AreaEmpleado, Empleado> empleadoList;
    public static volatile SingularAttribute<AreaEmpleado, Integer> idAreaEmpleado;
    public static volatile SingularAttribute<AreaEmpleado, String> areaEmpleado;

}