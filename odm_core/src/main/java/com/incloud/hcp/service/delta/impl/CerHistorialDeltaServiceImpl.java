/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/dto/EntitydeltaDTOService.java.e.vm
 */
package com.incloud.hcp.service.delta.impl;

import com.incloud.hcp._security.SystemLoggedUser;
import com.incloud.hcp._security.UserSession;
import com.incloud.hcp.bean.custom.HistorialCustom;
import com.incloud.hcp.domain.CerCertificado;
import com.incloud.hcp.domain.CerCertificadoDetalleSap;
import com.incloud.hcp.domain.CerHistorial;
import com.incloud.hcp.domain.MtrEstado;
import com.incloud.hcp.mapper.CerCertificadoDetalleSapMapper;
import com.incloud.hcp.repository.CerCertificadoRepository;
import com.incloud.hcp.repository.CerHistorialRepository;
import com.incloud.hcp.repository.delta.CerHistorialDeltaRepository;
import com.incloud.hcp.service.delta.AppParametriaDeltaService;
import com.incloud.hcp.service.delta.CerHistorialDeltaService;
import com.incloud.hcp.service.delta.MtrEstadoDeltaService;
import com.incloud.hcp.service.dto.CertificadoHistorialDto;
import com.incloud.hcp.service.impl.CerHistorialServiceImpl;
import com.incloud.hcp.service.support.PageRequestByExample;
import com.incloud.hcp.utils.Constants;
import com.incloud.hcp.utils.DateUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple DTO Facility for CerHistorial.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class CerHistorialDeltaServiceImpl extends CerHistorialServiceImpl implements CerHistorialDeltaService {

    @Autowired
    protected CerHistorialRepository cerHistorialRepository;

    @Autowired
    protected CerCertificadoRepository cerCertificadoRepository;

    @Autowired
    protected MtrEstadoDeltaService mtrEstadoDeltaService;

    @Autowired
    private SystemLoggedUser systemLoggedUser;

    @Autowired
    private AppParametriaDeltaService appParametriaDeltaService;

    @Autowired
    private CerHistorialDeltaRepository cerHistorialDeltaRepository;

    @Autowired
    private CerCertificadoDetalleSapMapper cerCertificadoDetalleSapMapper;

    /**************************/
    /* Metodos Personalizados */
    /**************************/

    public CerHistorial saveCertificadoHistorial(CertificadoHistorialDto certificadoHistorialDto) throws Exception {
        if (this.appParametriaDeltaService.devuelveApagarCertificado()) {
            throw new Exception(Constants.MENSAJE_SISTEMA_APAGADO);
        }

        UserSession user = this.systemLoggedUser.getUserSession();

        MtrEstado estado =  new MtrEstado();
        estado.setCodigoEstado("CEPE");

        CerHistorial cerHistorial = new CerHistorial();
        cerHistorial.setCerCertificado(this.cerCertificadoRepository.getOne(certificadoHistorialDto.getCerCertificadoId()));
        this.mtrEstadoDeltaService.find(estado).forEach(e->{ cerHistorial.setMtrEstado(e); });
        cerHistorial.setDescripcion(certificadoHistorialDto.getDescripcion());
        cerHistorial.setUsuarioHistoral(user.getDisplayName());//Debe optenerlo de la session
        cerHistorial.setFechaHistorial(DateUtils.obtenerFechaHoraActual());

        return this.cerHistorialRepository.save(cerHistorial);

    }


    /***********************/
    /* Metodos de Busqueda */
    /***********************/

    protected Sort setFindAll(Sort sort) {
        sort = Sort.by(
                new Sort.Order(Sort.Direction.DESC, "fechaHistorial")
        );
        return sort;
    }

    protected Sort setFind(CerHistorial req, ExampleMatcher matcher, Example<CerHistorial> example, Sort sort) {
        sort = Sort.by(
                new Sort.Order(Sort.Direction.DESC, "fechaHistorial")
        );
        return sort;
    }

    protected void setFindPaginated(PageRequestByExample<CerHistorial> req, ExampleMatcher matcher, Example<CerHistorial> example) {
        return;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected String setValidacionesPrevias(CerHistorial bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected CerHistorial setCreate(CerHistorial bean) throws Exception {
        return bean;
    }

    protected void setSave(CerHistorial dto) throws Exception {
        return;
    }

    protected void setDelete(Integer id) throws Exception {

    }

    protected void setDeleteAll() throws Exception {

    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected CerHistorial setUploadExcel(Cell currentCell, CerHistorial cerHistorial, int contador) throws Exception {
        cerHistorial = super.setUploadExcel(currentCell, cerHistorial, contador);
        return cerHistorial;
    }

    protected String setSaveMasivo(CerHistorial dto) throws Exception {
        return "";
    }

    protected List<CerHistorial> setBeforeDeleteMasivo(List<CerHistorial> listaDto) throws Exception {
        return listaDto;
    }

    protected void setAfterDeleteMasivo() throws Exception {
        return;
    }

    /*****************************/
    /* Metodos que generan Excel */
    /*****************************/

    protected void setDownloadExcelItem(CerHistorial bean, HSSFRow dataRow) {

    }

    protected void setDownloadExcel(HSSFSheet sheet) {

    }

    /*****************/
    /* Otros Metodos */
    /*****************/

    protected String setGraphDescripcionByMtrEstado(MtrEstado mtrEstado) {
        return mtrEstado.getId().toString();
    }

    protected String setGraphPieChartTituloByMtrEstado() {
        return "MtrEstado";
    }

    protected String setGraphBarChartTituloByMtrEstado() {
        return "MtrEstado";
    }

    protected String setGraphDescripcionByCerCertificado(CerCertificado cerCertificado) {
        return cerCertificado.getId().toString();
    }
   //ddfdfdf
    protected String setGraphPieChartTituloByCerCertificado() {
        return "CerCertificado";
    }

    protected String setGraphBarChartTituloByCerCertificado() {
        return "CerCertificado";
    }

    @Override
    public List<HistorialCustom> listaHistorial (Integer idCertificado) {
     List<CerHistorial> listaHistorial = this.cerHistorialDeltaRepository.findByIdCertificadox(idCertificado);
     List<CerCertificadoDetalleSap> listaDetalle = this.cerCertificadoDetalleSapMapper.findByIdCertificado(idCertificado);
     List<HistorialCustom> lista = new ArrayList<HistorialCustom>();

     for(CerHistorial ele: listaHistorial) {
         HistorialCustom hs = new HistorialCustom();
         hs.setId(ele.getId());
         hs.setDescripcion(ele.getDescripcion());
         hs.setResponsable(ele.getUsuarioHistoral());
         hs.setTipoEntidad("H");
         hs.setFecha(ele.getCreatedDate());
         lista.add(hs);
     }

     for(CerCertificadoDetalleSap ele: listaDetalle) {
         HistorialCustom hs = new HistorialCustom();
         hs.setId(ele.getId());
         hs.setDescripcion(ele.getTextoError());
         hs.setResponsable("SAP");
         hs.setTipoEntidad("D");
         hs.setFecha(ele.getCreatedDate());
         lista.add(hs);
     }

      return lista;
    }

}
