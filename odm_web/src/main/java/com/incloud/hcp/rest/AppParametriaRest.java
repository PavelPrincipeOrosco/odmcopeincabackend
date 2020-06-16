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

import com.incloud.hcp.domain.AppParametria;
import com.incloud.hcp.domain.response.AppParametriaResponse;
import com.incloud.hcp.repository.delta.AppParametriaDeltaRepository;
import com.incloud.hcp.rest._framework.JPACustomRest;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AppParametriaRest extends JPACustomRest<AppParametriaResponse, AppParametria, Long> {

    @Autowired
    protected AppParametriaDeltaRepository appParametriaDeltaRepository;

    protected String setObtenerNombreArchivoExcel() {
        return "AppParametria";
    }

    /************************/
    /* Instancia de Bean    */
    /************************/
    protected final AppParametria createInstance() {
        AppParametria appParametria = new AppParametria();
        return appParametria;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
