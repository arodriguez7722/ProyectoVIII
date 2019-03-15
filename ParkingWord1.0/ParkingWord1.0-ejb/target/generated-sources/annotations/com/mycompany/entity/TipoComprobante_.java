package com.mycompany.entity;

import com.mycompany.entity.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-23T17:56:23")
@StaticMetamodel(TipoComprobante.class)
public class TipoComprobante_ { 

    public static volatile SingularAttribute<TipoComprobante, String> estado;
    public static volatile SingularAttribute<TipoComprobante, Integer> idTipoComprobante;
    public static volatile ListAttribute<TipoComprobante, Factura> facturaList;
    public static volatile SingularAttribute<TipoComprobante, String> tipoComprobante;

}