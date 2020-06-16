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
import com.incloud.hcp.domain.CsAdjunto;
import com.incloud.hcp.domain.CsOrdenServicio;
import com.incloud.hcp.domain.MtrTipoDocumento;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * Simple Interface for CsAdjunto.
 */
@Data
@ToString
@EqualsAndHashCode
public class CsAdjuntoResponse extends BaseResponseDomain<CsAdjunto> {

    /****************************/
    /* Variables de Condiciones */
    /****************************/

    private String idCondicion;
    private String numeroOdsCondicion;
    private String extensionCondicion;
    private String descProveedorCondicion;
    private String documentoRepositorioIdCondicion;
    //private String mtrTipoDocumentoCondicion;
    //private String csOrdenServicioCondicion;

    /****************************/
    /* Variables Listas         */
    /****************************/

    private List<Long> idList;
    private List<String> numeroOdsList;
    private List<String> extensionList;
    private List<String> descProveedorList;
    private List<String> documentoRepositorioIdList;
    private List<MtrTipoDocumento> mtrTipoDocumentoList;
    private List<CsOrdenServicio> csOrdenServicioList;

}