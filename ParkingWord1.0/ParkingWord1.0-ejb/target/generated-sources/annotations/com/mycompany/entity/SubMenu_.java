package com.mycompany.entity;

import com.mycompany.entity.Menu;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-26T12:16:35")
@StaticMetamodel(SubMenu.class)
public class SubMenu_ { 

    public static volatile SingularAttribute<SubMenu, String> descripcion;
    public static volatile SingularAttribute<SubMenu, String> ruta;
    public static volatile SingularAttribute<SubMenu, Integer> idSubMenu;
    public static volatile SingularAttribute<SubMenu, Menu> idMenu;
    public static volatile SingularAttribute<SubMenu, String> nombre;

}