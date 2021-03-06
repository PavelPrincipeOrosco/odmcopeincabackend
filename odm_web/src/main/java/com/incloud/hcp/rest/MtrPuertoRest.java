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

import com.incloud.hcp.domain.MtrPuerto;
import com.incloud.hcp.domain.response.MtrPuertoResponse;
import com.incloud.hcp.repository.delta.MtrPuertoDeltaRepository;
import com.incloud.hcp.rest._framework.JPACustomRest;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class MtrPuertoRest extends JPACustomRest<MtrPuertoResponse, MtrPuerto, Long> {

    @Autowired
    protected MtrPuertoDeltaRepository mtrPuertoDeltaRepository;

    protected String setObtenerNombreArchivoExcel() {
        return "MtrPuerto";
    }

    /************************/
    /* Instancia de Bean    */
    /************************/
    protected final MtrPuerto createInstance() {
        MtrPuerto mtrPuerto = new MtrPuerto();
        return mtrPuerto;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
