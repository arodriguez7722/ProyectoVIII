package com.mycompany.entity;

import com.mycompany.entity.Convenio;
import com.mycompany.entity.Factura;
import com.mycompany.entity.Reserva;
import com.mycompany.entity.Tarifa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-26T12:16:34")
@StaticMetamodel(Pago.class)
public class Pago_ { 

    public static volatile SingularAttribute<Pago, Integer> tiempoTranscurrido;
    public static volatile SingularAttribute<Pago, Integer> idPago;
    public static volatile SingularAttribute<Pago, Date> fechaSalida;
    public static volatile SingularAttribute<Pago, Tarifa> idTarifa;
    public static volatile SingularAttribute<Pago, Integer> diasConsumidos;
    public static volatile ListAttribute<Pago, Factura> facturaList;
    public static volatile SingularAttribute<Pago, Date> horaSalida;
    public static volatile SingularAttribute<Pago, Convenio> idConvenio;
    public static volatile SingularAttribute<Pago, Reserva> idReserva;

}