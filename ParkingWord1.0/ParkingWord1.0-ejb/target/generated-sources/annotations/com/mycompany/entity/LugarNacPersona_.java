package com.mycompany.entity;

import com.mycompany.entity.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-26T12:16:35")
@StaticMetamodel(LugarNacPersona.class)
public class LugarNacPersona_ { 

    public static volatile SingularAttribute<LugarNacPersona, Integer> idLugarNacPersona;
    public static volatile SingularAttribute<LugarNacPersona, String> estado;
    public static volatile ListAttribute<LugarNacPersona, Persona> personaList;
    public static volatile SingularAttribute<LugarNacPersona, String> lugarNacimiento;

}