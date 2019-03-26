package com.mycompany.entity;

import com.mycompany.entity.Pago;
import com.mycompany.entity.TipoComprobante;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-26T12:16:35")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, String> estado;
    public static volatile SingularAttribute<Factura, Double> iva;
    public static volatile SingularAttribute<Factura, TipoComprobante> idTipoComprobante;
    public static volatile SingularAttribute<Factura, Integer> idFactura;
    public static volatile SingularAttribute<Factura, Pago> idPago;
    public static volatile SingularAttribute<Factura, Double> totalPago;
    public static volatile SingularAttribute<Factura, Integer> numeroFactura;
    public static volatile SingularAttribute<Factura, Double> subTotal;

}