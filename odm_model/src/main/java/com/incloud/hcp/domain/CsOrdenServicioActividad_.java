/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/domain/EntityMeta_.java.e.vm
 */
package com.incloud.hcp.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(CsOrdenServicioActividad.class)
public abstract class CsOrdenServicioActividad_ {

    // Raw attributes
    public static volatile SingularAttribute<CsOrdenServicioActividad, Long> id;
    public static volatile SingularAttribute<CsOrdenServicioActividad, String> descripcion;

    // Many to one
    public static volatile SingularAttribute<CsOrdenServicioActividad, CsOrdenServicio> csOrdenServicio;
}
