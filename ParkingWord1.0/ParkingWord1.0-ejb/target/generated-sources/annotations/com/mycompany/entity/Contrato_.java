package com.mycompany.entity;

import com.mycompany.entity.Cliente;
import com.mycompany.entity.TipoContrato;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-23T17:56:23")
@StaticMetamodel(Contrato.class)
public class Contrato_ { 

    public static volatile SingularAttribute<Contrato, TipoContrato> idTipoContrato;
    public static volatile SingularAttribute<Contrato, String> estado;
    public static volatile SingularAttribute<Contrato, Integer> numeroContrato;
    public static volatile SingularAttribute<Contrato, Date> fechaInicio;
    public static volatile SingularAttribute<Contrato, Integer> numeroDias;
    public static volatile SingularAttribute<Contrato, Integer> idContrato;
    public static volatile SingularAttribute<Contrato, Date> fechaFin;
    public static volatile SingularAttribute<Contrato, Cliente> idPersona;

}