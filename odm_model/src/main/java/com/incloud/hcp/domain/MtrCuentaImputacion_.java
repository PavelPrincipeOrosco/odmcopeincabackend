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

@StaticMetamodel(MtrCuentaImputacion.class)
public abstract class MtrCuentaImputacion_ {

    // Raw attributes
    public static volatile SingularAttribute<MtrCuentaImputacion, Integer> id;
    public static volatile SingularAttribute<MtrCuentaImputacion, String> codigoCuentaImputacion;
    public static volatile SingularAttribute<MtrCuentaImputacion, String> descripcion;

    // Many to one
    public static volatile SingularAttribute<MtrCuentaImputacion, MtrTipoImputacion> mtrTipoImputacion;
    public static volatile SingularAttribute<MtrCuentaImputacion, MtrSociedad> mtrSociedad;
}