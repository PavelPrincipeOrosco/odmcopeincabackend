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

import com.incloud.hcp.domain.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * Simple Interface for CerFirma.
 */
@Data
@ToString
@EqualsAndHashCode
public class CerFirmaResponse extends BaseResponseDomain<CerFirma> {

    /****************************/
    /* Variables de Condiciones */
    /****************************/

    private String idCondicion;
    private String ebelnCondicion;
    //private String cerNotaPedidoCondicion;
    //private String mtrAprobadorCondicion;
    //private String mtrTipoFirmaCondicion;

    /****************************/
    /* Variables Listas         */
    /****************************/

    private List<Integer> idList;
    private List<String> ebelnList;
    private List<CerNotaPedido> cerNotaPedidoList;
    private List<MtrAprobador> mtrAprobadorList;
    private List<MtrTipoFirma> mtrTipoFirmaList;

}