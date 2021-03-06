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
import java.math.BigDecimal;

@StaticMetamodel(CsMaterial.class)
public abstract class CsMaterial_ {

    // Raw attributes
    public static volatile SingularAttribute<CsMaterial, Long> id;
    public static volatile SingularAttribute<CsMaterial, String> codigoMaterial;
    public static volatile SingularAttribute<CsMaterial, String> descripcionMaterial;
    public static volatile SingularAttribute<CsMaterial, BigDecimal> cantidad;

    // Many to one
    public static volatile SingularAttribute<CsMaterial, MtrUnidadMedida> mtrUnidadMedida;
    public static volatile SingularAttribute<CsMaterial, CsOrdenServicio> csOrdenServicio;
}
