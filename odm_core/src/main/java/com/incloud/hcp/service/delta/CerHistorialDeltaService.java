/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/dto/EntitydeltaDTO.java.e.vm
 */
package com.incloud.hcp.service.delta;

import com.incloud.hcp.bean.custom.HistorialCustom;
import com.incloud.hcp.domain.CerHistorial;
import com.incloud.hcp.service.CerHistorialService;
import com.incloud.hcp.service.dto.CertificadoHistorialDto;

import java.util.List;

/**
 * Simple Interface for CerHistorial.
 */
public interface CerHistorialDeltaService extends CerHistorialService {

    public CerHistorial saveCertificadoHistorial(CertificadoHistorialDto certificadoHistorialDto) throws Exception ;
    public List<HistorialCustom> listaHistorial (Integer idCertificado);
}
