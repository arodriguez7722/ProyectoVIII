package com.mycompany.entity;

import com.mycompany.entity.AreaEmpleado;
import com.mycompany.entity.PerfilEmpleado;
import com.mycompany.entity.Persona;
import com.mycompany.entity.Reserva;
import com.mycompany.entity.TurnoEmpleado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-23T17:56:23")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, Date> fechaModificacion;
    public static volatile SingularAttribute<Empleado, Persona> persona;
    public static volatile SingularAttribute<Empleado, String> pass;
    public static volatile ListAttribute<Empleado, Reserva> reservaList;
    public static volatile SingularAttribute<Empleado, TurnoEmpleado> idTurnoEmpleado;
    public static volatile SingularAttribute<Empleado, Date> fechaCreacion;
    public static volatile SingularAttribute<Empleado, PerfilEmpleado> idPerfilEmpleado;
    public static volatile SingularAttribute<Empleado, String> usuario;
    public static volatile SingularAttribute<Empleado, String> direccionPorteria;
    public static volatile SingularAttribute<Empleado, AreaEmpleado> idAreaEmpleado;
    public static volatile SingularAttribute<Empleado, Integer> idPersona;

}