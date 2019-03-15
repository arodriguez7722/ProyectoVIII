package com.mycompany.entity;

import com.mycompany.entity.Cupo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-23T17:56:23")
@StaticMetamodel(PisoCupo.class)
public class PisoCupo_ { 

    public static volatile SingularAttribute<PisoCupo, Integer> idPisoCupo;
    public static volatile SingularAttribute<PisoCupo, String> estado;
    public static volatile ListAttribute<PisoCupo, Cupo> cupoList;
    public static volatile SingularAttribute<PisoCupo, String> pisoCupo;

}