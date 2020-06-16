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

import com.incloud.hcp.domain.CsMaterial;
import com.incloud.hcp.domain.CsOrdenServicio;
import com.incloud.hcp.domain.MtrUnidadMedida;
import com.incloud.hcp.domain.response.CsMaterialResponse;
import com.incloud.hcp.service.delta.CsMaterialDeltaService;
import com.incloud.hcp.service.impl.CsMaterialServiceImpl;
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
 * A simple DTO Facility for CsMaterial.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class CsMaterialDeltaServiceImpl extends CsMaterialServiceImpl implements CsMaterialDeltaService {

    /**************************/
    /* Metodos Personalizados */
    /**************************/

    /***********************/
    /* Metodos de Busqueda */
    /***********************/

    protected Sort setFindAll(Sort sort) {
        sort = Sort.by(new Sort.Order(Sort.Direction.ASC, "descripcionMaterial"));
        return sort;
    }

    protected Sort setFind(CsMaterial req, ExampleMatcher matcher, Example<CsMaterial> example, Sort sort) {
        sort = Sort.by(new Sort.Order(Sort.Direction.ASC, "descripcionMaterial"));
        return sort;
    }

    protected void setFindPaginated(PageRequestByExample<CsMaterial> req, ExampleMatcher matcher, Example<CsMaterial> example) {
        return;
    }

    protected List<Predicate> setAdicionalDeltaPredicate(List<Predicate> predicates, CsMaterialResponse bean, CriteriaBuilder cb,
            CriteriaQuery<CsMaterial> query, Root<CsMaterial> root) throws Exception {

        CsMaterial entity = bean.getBean();
        //Ejemplo
        /*
        if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
            Join<CsMaterial, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
        
            if (Optional.ofNullable(entity.get<VariableManytoOne>().get<Atributo>()).isPresent()) {
                Join<CsMaterial, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
                Predicate thirdCondition = cb.equal(from<ClaseManytoOne>.get("<Atributo>"), entity.get<ClaseManytoOne>().get<Atributo>());
                predicates.add(thirdCondition);
            }
            
        }
        query.orderBy(cb.desc(root.get("<campo entity>")));
        */
        return predicates;
    }

    protected Root<CsMaterial> setAdicionalDeltaTotalPredicate(CsMaterialResponse bean, Root<CsMaterial> countRoot) throws Exception {
        CsMaterial entity = bean.getBean();
        //Ejemplo
        /*
        if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
            if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
                Join<CsMaterial, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
            }
        }
        */
        return countRoot;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected String setValidacionesPrevias(CsMaterial bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected CsMaterial setCreate(CsMaterial bean) throws Exception {
        return bean;
    }

    protected void setSave(CsMaterial dto) throws Exception {
        return;
    }

    protected void setDelete(Long id) throws Exception {

    }

    protected void setDeleteAll() throws Exception {

    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected CsMaterial setUploadExcel(Cell currentCell, CsMaterial csMaterial, int contador) throws Exception {
        csMaterial = super.setUploadExcel(currentCell, csMaterial, contador);
        return csMaterial;
    }

    protected String setSaveMasivo(CsMaterial dto) throws Exception {
        return "";
    }

    protected List<CsMaterial> setBeforeDeleteMasivo(List<CsMaterial> listaDto) throws Exception {
        return listaDto;
    }

    protected void setAfterDeleteMasivo() throws Exception {
        return;
    }

    /*****************************/
    /* Metodos que generan Excel */
    /*****************************/

    protected void setDownloadExcelItem(CsMaterial bean, HSSFRow dataRow) {

    }

    protected void setDownloadExcel(HSSFSheet sheet) {

    }

    /*****************/
    /* Otros Metodos */
    /*****************/

    protected String setGraphDescripcionByMtrUnidadMedida(MtrUnidadMedida mtrUnidadMedida) {
        return mtrUnidadMedida.getId().toString();
    }

    protected String setGraphPieChartTituloByMtrUnidadMedida() {
        return "MtrUnidadMedida";
    }

    protected String setGraphBarChartTituloByMtrUnidadMedida() {
        return "MtrUnidadMedida";
    }

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