package com.mycompany.entity;

import com.mycompany.entity.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-26T12:16:34")
@StaticMetamodel(TipoDocPersona.class)
public class TipoDocPersona_ { 

    public static volatile SingularAttribute<TipoDocPersona, String> tipoDocumento;
    public static volatile SingularAttribute<TipoDocPersona, String> estado;
    public static volatile ListAttribute<TipoDocPersona, Persona> personaList;
    public static volatile SingularAttribute<TipoDocPersona, Integer> idTipoDocPersona;

}