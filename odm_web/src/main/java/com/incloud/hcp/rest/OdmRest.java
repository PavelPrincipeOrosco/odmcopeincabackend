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

import com.incloud.hcp.domain.Odm;
import com.incloud.hcp.domain.response.OdmResponse;
import com.incloud.hcp.repository.delta.OdmDeltaRepository;
import com.incloud.hcp.rest._framework.JPACustomRest;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class OdmRest extends JPACustomRest<OdmResponse, Odm, Long> {

    @Autowired
    protected OdmDeltaRepository odmDeltaRepository;

    protected String setObtenerNombreArchivoExcel() {
        return "Odm";
    }

    /************************/
    /* Instancia de Bean    */
    /************************/
    protected final Odm createInstance() {
        Odm odm = new Odm();
        return odm;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
