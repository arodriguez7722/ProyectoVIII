package com.mycompany.entity;

import com.mycompany.entity.Pago;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-23T17:56:23")
@StaticMetamodel(Convenio.class)
public class Convenio_ { 

    public static volatile SingularAttribute<Convenio, String> estado;
    public static volatile ListAttribute<Convenio, Pago> pagoList;
    public static volatile SingularAttribute<Convenio, Double> descuento;
    public static volatile SingularAttribute<Convenio, String> empresa;
    public static volatile SingularAttribute<Convenio, String> nombre;
    public static volatile SingularAttribute<Convenio, Integer> idConvenio;

}