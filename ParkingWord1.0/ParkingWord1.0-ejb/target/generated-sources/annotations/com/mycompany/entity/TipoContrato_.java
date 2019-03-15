package com.mycompany.entity;

import com.mycompany.entity.Contrato;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-23T17:56:23")
@StaticMetamodel(TipoContrato.class)
public class TipoContrato_ { 

    public static volatile SingularAttribute<TipoContrato, Integer> idTipoContrato;
    public static volatile SingularAttribute<TipoContrato, String> estado;
    public static volatile ListAttribute<TipoContrato, Contrato> contratoList;
    public static volatile SingularAttribute<TipoContrato, String> tipoContrato;

}