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

import com.incloud.hcp.domain.CsOrdenServicio;
import com.incloud.hcp.domain.CsOrdenServicioActividad;
import com.incloud.hcp.domain.response.CsOrdenServicioActividadResponse;
import com.incloud.hcp.service.delta.CsOrdenServicioActividadDeltaService;
import com.incloud.hcp.service.impl.CsOrdenServicioActividadServiceImpl;
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

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * A simple DTO Facility for CsOrdenServicioActividad.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class CsOrdenServicioActividadDeltaServiceImpl extends CsOrdenServicioActividadServiceImpl implements CsOrdenServicioActividadDeltaService {

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

    protected Sort setFind(CsOrdenServicioActividad req, ExampleMatcher matcher, Example<CsOrdenServicioActividad> example, Sort sort) {
        sort = Sort.by(new Sort.Order(Sort.Direction.ASC, "descripcion"));
        return sort;
    }

    protected void setFindPaginated(PageRequestByExample<CsOrdenServicioActividad> req, ExampleMatcher matcher, Example<CsOrdenServicioActividad> example) {
        return;
    }

    protected List<Predicate> setAdicionalDeltaPredicate(List<Predicate> predicates, CsOrdenServicioActividadResponse bean, CriteriaBuilder cb,
            CriteriaQuery<CsOrdenServicioActividad> query, Root<CsOrdenServicioActividad> root) throws Exception {

        CsOrdenServicioActividad entity = bean.getBean();
        //Ejemplo
        /*
        if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
            Join<CsOrdenServicioActividad, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
        
            if (Optional.ofNullable(entity.get<VariableManytoOne>().get<Atributo>()).isPresent()) {
                Join<CsOrdenServicioActividad, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
                Predicate thirdCondition = cb.equal(from<ClaseManytoOne>.get("<Atributo>"), entity.get<ClaseManytoOne>().get<Atributo>());
                predicates.add(thirdCondition);
            }
            
        }
        query.orderBy(cb.desc(root.get("<campo entity>")));
        */
        return predicates;
    }

    protected Root<CsOrdenServicioActividad> setAdicionalDeltaTotalPredicate(CsOrdenServicioActividadResponse bean, Root<CsOrdenServicioActividad> countRoot)
            throws Exception {
        CsOrdenServicioActividad entity = bean.getBean();
        //Ejemplo
        /*
        if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
            if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
                Join<CsOrdenServicioActividad, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
            }
        }
        */
        return countRoot;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected String setValidacionesPrevias(CsOrdenServicioActividad bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected CsOrdenServicioActividad setCreate(CsOrdenServicioActividad bean) throws Exception {
        return bean;
    }

    protected void setSave(CsOrdenServicioActividad dto) throws Exception {
        return;
    }

    protected void setDelete(Long id) throws Exception {

    }

    protected void setDeleteAll() throws Exception {

    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected CsOrdenServicioActividad setUploadExcel(Cell currentCell, CsOrdenServicioActividad csOrdenServicioActividad, int contador) throws Exception {
        csOrdenServicioActividad = super.setUploadExcel(currentCell, csOrdenServicioActividad, contador);
        return csOrdenServicioActividad;
    }

    protected String setSaveMasivo(CsOrdenServicioActividad dto) throws Exception {
        return "";
    }

    protected List<CsOrdenServicioActividad> setBeforeDeleteMasivo(List<CsOrdenServicioActividad> listaDto) throws Exception {
        return listaDto;
    }

    protected void setAfterDeleteMasivo() throws Exception {
        return;
    }

    /*****************************/
    /* Metodos que generan Excel */
    /*****************************/

    protected void setDownloadExcelItem(CsOrdenServicioActividad bean, HSSFRow dataRow) {

    }

    protected void setDownloadExcel(HSSFSheet sheet) {

    }

    /*****************/
    /* Otros Metodos */
    /*****************/

    protected String setGraphDescripcionByCsOrdenServicio(CsOrdenServicio csOrdenServicio) {
        return csOrdenServicio.getId().toString();
    }

    protected String setGraphPieChartTituloByCsOrdenServicio() {
        return "CsOrdenServicio";
    }

    protected String setGraphBarChartTituloByCsOrdenServicio() {
        return "CsOrdenServicio";
    }

}
