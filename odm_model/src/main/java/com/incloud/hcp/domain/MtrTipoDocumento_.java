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

@StaticMetamodel(MtrTipoDocumento.class)
public abstract class MtrTipoDocumento_ {

    // Raw attributes
    public static volatile SingularAttribute<MtrTipoDocumento, Long> id;
    public static volatile SingularAttribute<MtrTipoDocumento, String> descripcion;
    public static volatile SingularAttribute<MtrTipoDocumento, String> status;
}
