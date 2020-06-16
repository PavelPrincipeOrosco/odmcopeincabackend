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

import com.incloud.hcp.domain.MtrModalidadTrabajo;
import com.incloud.hcp.domain.response.MtrModalidadTrabajoResponse;
import com.incloud.hcp.repository.delta.MtrModalidadTrabajoDeltaRepository;
import com.incloud.hcp.rest._framework.JPACustomRest;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class MtrModalidadTrabajoRest extends JPACustomRest<MtrModalidadTrabajoResponse, MtrModalidadTrabajo, Long> {

    @Autowired
    protected MtrModalidadTrabajoDeltaRepository mtrModalidadTrabajoDeltaRepository;

    protected String setObtenerNombreArchivoExcel() {
        return "MtrModalidadTrabajo";
    }

    /************************/
    /* Instancia de Bean    */
    /************************/
    protected final MtrModalidadTrabajo createInstance() {
        MtrModalidadTrabajo mtrModalidadTrabajo = new MtrModalidadTrabajo();
        return mtrModalidadTrabajo;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
