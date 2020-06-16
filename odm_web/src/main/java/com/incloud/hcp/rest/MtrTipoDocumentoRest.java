/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/rest/EntityResource.java.e.vm
 */
package com.incloud.hcp.rest;

import com.incloud.hcp.domain.MtrTipoDocumento;
import com.incloud.hcp.domain.response.MtrTipoDocumentoResponse;
import com.incloud.hcp.repository.delta.MtrTipoDocumentoDeltaRepository;
import com.incloud.hcp.rest._framework.JPACustomRest;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class MtrTipoDocumentoRest extends JPACustomRest<MtrTipoDocumentoResponse, MtrTipoDocumento, Long> {

    @Autowired
    protected MtrTipoDocumentoDeltaRepository mtrTipoDocumentoDeltaRepository;

    protected String setObtenerNombreArchivoExcel() {
        return "MtrTipoDocumento";
    }

    /************************/
    /* Instancia de Bean    */
    /************************/
    protected final MtrTipoDocumento createInstance() {
        MtrTipoDocumento mtrTipoDocumento = new MtrTipoDocumento();
        return mtrTipoDocumento;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}