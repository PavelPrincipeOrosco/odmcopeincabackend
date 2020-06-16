/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/dto/EntityDTO.java.e.vm
 */
package com.incloud.hcp.service;

import com.incloud.hcp.common.graph.GraphBean;
import com.incloud.hcp.domain.*;
import com.incloud.hcp.domain.response.CsOrdenServicioResponse;
import com.incloud.hcp.service._framework.JPACustomService;

/**
 * Simple Interface for CsOrdenServicio.
 */
public interface CsOrdenServicioService extends JPACustomService<CsOrdenServicioResponse, CsOrdenServicio, Long> {

    Long countByMtrModalidadTrabajo(MtrModalidadTrabajo mtrModalidadTrabajo);

    GraphBean graphByMtrModalidadTrabajo();

    Long countByMtrTiempoEntrega(MtrTiempoEntrega mtrTiempoEntrega);

    GraphBean graphByMtrTiempoEntrega();

    Long countByMtrCalidadServicio(MtrCalidadServicio mtrCalidadServicio);

    GraphBean graphByMtrCalidadServicio();

    Long countByMtrEstado(MtrEstado mtrEstado);

    GraphBean graphByMtrEstado();

    Long countByMtrLugarTrabajo(MtrLugarTrabajo mtrLugarTrabajo);

    GraphBean graphByMtrLugarTrabajo();

    Long countByOdm(Odm odm);

    GraphBean graphByOdm();

    Long countByMtrPuerto(MtrPuerto mtrPuerto);

    GraphBean graphByMtrPuerto();

    Long countByMtrSeguridad(MtrSeguridad mtrSeguridad);

    GraphBean graphByMtrSeguridad();

}
