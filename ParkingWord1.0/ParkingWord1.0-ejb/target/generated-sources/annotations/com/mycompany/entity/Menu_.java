package com.mycompany.entity;

import com.mycompany.entity.PerfilMenu;
import com.mycompany.entity.SubMenu;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-26T12:16:34")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile SingularAttribute<Menu, String> descripcion;
    public static volatile SingularAttribute<Menu, String> icono;
    public static volatile SingularAttribute<Menu, String> color;
    public static volatile ListAttribute<Menu, SubMenu> subMenuList;
    public static volatile ListAttribute<Menu, PerfilMenu> perfilMenuList;
    public static volatile SingularAttribute<Menu, Integer> idMenu;
    public static volatile SingularAttribute<Menu, String> nombre;

}