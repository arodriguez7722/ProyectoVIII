package com.mycompany.entity;

import com.mycompany.entity.Empleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-23T17:56:23")
@StaticMetamodel(PerfilEmpleado.class)
public class PerfilEmpleado_ { 

    public static volatile SingularAttribute<PerfilEmpleado, Boolean> registroEmpresa;
    public static volatile SingularAttribute<PerfilEmpleado, Boolean> registroClientes;
    public static volatile ListAttribute<PerfilEmpleado, Empleado> empleadoList;
    public static volatile SingularAttribute<PerfilEmpleado, Boolean> detalleEmpresa;
    public static volatile SingularAttribute<PerfilEmpleado, Integer> idPerfilEmpleado;
    public static volatile SingularAttribute<PerfilEmpleado, Boolean> usuario;
    public static volatile SingularAttribute<PerfilEmpleado, Boolean> detalleClientes;
    public static volatile SingularAttribute<PerfilEmpleado, Boolean> registroUsuario;
    public static volatile SingularAttribute<PerfilEmpleado, String> perfilEmpleado;
    public static volatile SingularAttribute<PerfilEmpleado, Boolean> empresa;
    public static volatile SingularAttribute<PerfilEmpleado, Boolean> clientes;
    public static volatile SingularAttribute<PerfilEmpleado, Short> detalleUsuario;

}