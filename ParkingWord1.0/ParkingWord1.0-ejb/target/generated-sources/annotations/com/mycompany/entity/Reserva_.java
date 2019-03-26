package com.mycompany.entity;

import com.mycompany.entity.Cliente;
import com.mycompany.entity.Cupo;
import com.mycompany.entity.Empleado;
import com.mycompany.entity.Pago;
import com.mycompany.entity.Vehiculo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-26T12:16:35")
@StaticMetamodel(Reserva.class)
public class Reserva_ { 

    public static volatile SingularAttribute<Reserva, Date> fechaIngreso;
    public static volatile SingularAttribute<Reserva, Cupo> idCupo;
    public static volatile SingularAttribute<Reserva, Date> horaIngreso;
    public static volatile SingularAttribute<Reserva, Vehiculo> idVehiculo;
    public static volatile SingularAttribute<Reserva, Cliente> idCliente;
    public static volatile ListAttribute<Reserva, Pago> pagoList;
    public static volatile SingularAttribute<Reserva, Empleado> idEmpleado;
    public static volatile SingularAttribute<Reserva, Integer> idReserva;

}