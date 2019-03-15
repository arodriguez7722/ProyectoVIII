package com.mycompany.entity;

import com.mycompany.entity.Cliente;
import com.mycompany.entity.Empleado;
import com.mycompany.entity.LugarNacPersona;
import com.mycompany.entity.TipoDocPersona;
import com.mycompany.entity.Vehiculo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-23T17:56:22")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> apellidos;
    public static volatile SingularAttribute<Persona, LugarNacPersona> idLugarNacPersona;
    public static volatile SingularAttribute<Persona, String> estado;
    public static volatile SingularAttribute<Persona, Date> fechaNacimiento;
    public static volatile SingularAttribute<Persona, String> direccion;
    public static volatile SingularAttribute<Persona, String> identificacion;
    public static volatile SingularAttribute<Persona, String> nombres;
    public static volatile SingularAttribute<Persona, Cliente> cliente;
    public static volatile SingularAttribute<Persona, Empleado> empleado;
    public static volatile SingularAttribute<Persona, String> celular;
    public static volatile SingularAttribute<Persona, TipoDocPersona> idTipoDocPersona;
    public static volatile SingularAttribute<Persona, Integer> idPersona;
    public static volatile SingularAttribute<Persona, String> email;
    public static volatile ListAttribute<Persona, Vehiculo> vehiculoList;

}