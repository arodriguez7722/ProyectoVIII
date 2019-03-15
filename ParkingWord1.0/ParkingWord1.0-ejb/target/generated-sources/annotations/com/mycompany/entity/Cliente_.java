package com.mycompany.entity;

import com.mycompany.entity.Contrato;
import com.mycompany.entity.Empresa;
import com.mycompany.entity.Persona;
import com.mycompany.entity.Reserva;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-23T17:56:23")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> tipoCliente;
    public static volatile SingularAttribute<Cliente, Persona> persona;
    public static volatile ListAttribute<Cliente, Reserva> reservaList;
    public static volatile SingularAttribute<Cliente, String> codigoCliente;
    public static volatile ListAttribute<Cliente, Contrato> contratoList;
    public static volatile SingularAttribute<Cliente, Empresa> idEmpresa;
    public static volatile SingularAttribute<Cliente, Integer> idPersona;

}