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

import com.incloud.hcp.bean.custom.MensajeHes;
import com.incloud.hcp.bean.custom.MensajeSap;
import com.incloud.hcp.bean.custom.OperacionCertificado;
import com.incloud.hcp.domain.CerCertificado;
import com.incloud.hcp.domain.CerDocumentoAdjunto;
import com.incloud.hcp.domain.MtrAprobador;
import com.incloud.hcp.domain.response.CerCertificadoResponse;
import com.incloud.hcp.service.CerCertificadoService;
import com.incloud.hcp.service.dto.*;
import com.incloud.hcp.service.support.PageResponse;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

/**
 * Simple Interface for CerCertificado.
 */
public interface CerCertificadoDeltaService extends CerCertificadoService {
    List<MensajeSap> uploadExcelCertificado(InputStream in);
    List<MensajeSap> ejecutarWorkflow (OperacionCertificado operacion) throws Exception;
    CerCertificado eliminarCertificado(CerCertificadoEliminarEntradaDto bean) throws Exception;

    ByteArrayResource generarReportePdf(Integer cerCertificadoId) throws Exception;

    CerCertificadoAprobacionFirmaBDto aprobacionFirmaB(CerCertificadoAprobacionFirmaBDto bean) throws Exception;

    SXSSFWorkbook downloadExcelporFiltro(CerCertificado cerCertificado) throws Exception;

    SXSSFWorkbook downloadExcelProveedorporFiltro(CerCertificado cerCertificado) throws Exception;

    PageResponse<CerCertificado> findCondicionProveedorPaginated(
            CerCertificadoResponse req,
            PageRequest pageRequest) throws Exception;

    CerCertificado actualizarEstadoCertificado(EstadoCertificadoDto estadoDto) throws Exception;

    List<MensajeSap> realizarOperacion (OperacionCertificado operacion) throws Exception;

    List<CerCertificado> splitCertificados(String param);

    CerDocumentoAdjunto agregarDocumentoCerificado(MultipartFile file) throws Exception;

    CerDocumentoAdjunto adjuntosAprobador(MultipartFile file, Integer certificadoId) throws Exception;

    List listaAdjuntos(Integer idCertificado) throws Exception;

    List listadoCertificadoByProveedor(String rucProveedor);

    List<CertificadoConglomeradoDto> listadoCertificadoConglomerado(Integer idCertificado) throws Exception;

    CertificadoCabezeraDetallesAdjuntosDto saveAllCertificado(CertificadoCabezeraDetallesAdjuntosDto certificadoAdjuntos) throws Exception;

    CertificadoCabezeraDetallesAdjuntosDto updateAllCertificado(CertificadoCabezeraDetallesAdjuntosDto certificadoAdjuntos) throws Exception;

    CerCertificado deleteAllCertificado(Integer archivoID) throws Exception;

    CerCertificado deleteDocumento(Integer id) throws Exception;

    List deleteAllFiles(String DIRECTORY) throws Exception;

    List deleteAllFilesCMIS(CerDeleteAllFilesDto cerDeleteAllFilesDto) throws Exception;

    List deleteOneFile(String idFile) throws Exception;

    List<MensajeHes> crearHes(CerCertificado certificado, String aprobadorFirmaB, MtrAprobador aprobador) throws Exception;

}
