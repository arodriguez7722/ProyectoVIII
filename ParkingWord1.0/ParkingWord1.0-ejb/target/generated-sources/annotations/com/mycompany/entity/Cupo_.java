package com.mycompany.entity;

import com.mycompany.entity.MedidasCupo;
import com.mycompany.entity.PisoCupo;
import com.mycompany.entity.Reserva;
import com.mycompany.entity.Tarifa;
import com.mycompany.entity.TipoCupo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-26T12:16:34")
@StaticMetamodel(Cupo.class)
public class Cupo_ { 

    public static volatile SingularAttribute<Cupo, PisoCupo> idPisoCupo;
    public static volatile SingularAttribute<Cupo, Integer> idCupo;
    public static volatile SingularAttribute<Cupo, String> numeroCupo;
    public static volatile SingularAttribute<Cupo, String> estado;
    public static volatile ListAttribute<Cupo, Reserva> reservaList;
    public static volatile SingularAttribute<Cupo, TipoCupo> idTipoCupo;
    public static volatile SingularAttribute<Cupo, MedidasCupo> idMedidasCupo;
    public static volatile ListAttribute<Cupo, Tarifa> tarifaList;

}