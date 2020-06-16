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

import com.incloud.hcp.domain.MtrTipoImputacion;
import com.incloud.hcp.service.delta.MtrTipoImputacionDeltaService;
import com.incloud.hcp.service.impl.MtrTipoImputacionServiceImpl;
import com.incloud.hcp.service.support.PageRequestByExample;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * A simple DTO Facility for MtrTipoImputacion.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class MtrTipoImputacionDeltaServiceImpl extends MtrTipoImputacionServiceImpl implements MtrTipoImputacionDeltaService {

    /**************************/
    /* Metodos Personalizados */
    /**************************/

    /***********************/
    /* Metodos de Busqueda */
    /***********************/

    protected Sort setFindAll(Sort sort) {
        sort = Sort.by(new Sort.Order(Sort.Direction.ASC, "descripcion"));
        return sort;
    }

    protected Sort setFind(MtrTipoImputacion req, ExampleMatcher matcher, Example<MtrTipoImputacion> example, Sort sort) {
        sort = Sort.by(new Sort.Order(Sort.Direction.ASC, "descripcion"));
        return sort;
    }

    protected void setFindPaginated(PageRequestByExample<MtrTipoImputacion> req, ExampleMatcher matcher, Example<MtrTipoImputacion> example) {
        return;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected String setValidacionesPrevias(MtrTipoImputacion bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected MtrTipoImputacion setCreate(MtrTipoImputacion bean) throws Exception {
        return bean;
    }

    protected void setSave(MtrTipoImputacion dto) throws Exception {
        return;
    }

    protected void setDelete(Integer id) throws Exception {

    }

    protected void setDeleteAll() throws Exception {

    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected MtrTipoImputacion setUploadExcel(Cell currentCell, MtrTipoImputacion mtrTipoImputacion, int contador) throws Exception {
        mtrTipoImputacion = super.setUploadExcel(currentCell, mtrTipoImputacion, contador);
        return mtrTipoImputacion;
    }

    protected String setSaveMasivo(MtrTipoImputacion dto) throws Exception {
        return "";
    }

    protected List<MtrTipoImputacion> setBeforeDeleteMasivo(List<MtrTipoImputacion> listaDto) throws Exception {
        return listaDto;
    }

    protected void setAfterDeleteMasivo() throws Exception {
        return;
    }

    /*****************************/
    /* Metodos que generan Excel */
    /*****************************/

    protected void setDownloadExcelItem(MtrTipoImputacion bean, HSSFRow dataRow) {

    }

    protected void setDownloadExcel(HSSFSheet sheet) {

    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}