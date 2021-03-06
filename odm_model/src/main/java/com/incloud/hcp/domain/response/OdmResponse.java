/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/domain/EntityResponse.java.e.vm
 */
package com.incloud.hcp.domain.response;

import com.incloud.hcp.domain.BaseResponseDomain;
import com.incloud.hcp.domain.Odm;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * Simple Interface for Odm.
 */
@Data
@ToString
@EqualsAndHashCode
public class OdmResponse extends BaseResponseDomain<Odm> {

    /****************************/
    /* Variables de Condiciones */
    /****************************/

    private String idCondicion;
    private String codigoEquipoSapCondicion;
    private String codigoProveedorSapCondicion;

    /****************************/
    /* Variables Listas         */
    /****************************/

    private List<Long> idList;
    private List<String> codigoEquipoSapList;
    private List<String> codigoProveedorSapList;

}
