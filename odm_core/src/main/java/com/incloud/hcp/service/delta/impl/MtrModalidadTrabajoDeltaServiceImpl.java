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

import com.incloud.hcp.domain.MtrModalidadTrabajo;
import com.incloud.hcp.domain.response.MtrModalidadTrabajoResponse;
import com.incloud.hcp.service.delta.MtrModalidadTrabajoDeltaService;
import com.incloud.hcp.service.impl.MtrModalidadTrabajoServiceImpl;
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
 * A simple DTO Facility for MtrModalidadTrabajo.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class MtrModalidadTrabajoDeltaServiceImpl extends MtrModalidadTrabajoServiceImpl implements MtrModalidadTrabajoDeltaService {

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

    protected Sort setFind(MtrModalidadTrabajo req, ExampleMatcher matcher, Example<MtrModalidadTrabajo> example, Sort sort) {
        sort = Sort.by(new Sort.Order(Sort.Direction.ASC, "descripcion"));
        return sort;
    }

    protected void setFindPaginated(PageRequestByExample<MtrModalidadTrabajo> req, ExampleMatcher matcher, Example<MtrModalidadTrabajo> example) {
        return;
    }

    protected List<Predicate> setAdicionalDeltaPredicate(List<Predicate> predicates, MtrModalidadTrabajoResponse bean, CriteriaBuilder cb,
            CriteriaQuery<MtrModalidadTrabajo> query, Root<MtrModalidadTrabajo> root) throws Exception {

        MtrModalidadTrabajo entity = bean.getBean();
        //Ejemplo
        /*
        if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
            Join<MtrModalidadTrabajo, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
        
            if (Optional.ofNullable(entity.get<VariableManytoOne>().get<Atributo>()).isPresent()) {
                Join<MtrModalidadTrabajo, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
                Predicate thirdCondition = cb.equal(from<ClaseManytoOne>.get("<Atributo>"), entity.get<ClaseManytoOne>().get<Atributo>());
                predicates.add(thirdCondition);
            }
            
        }
        query.orderBy(cb.desc(root.get("<campo entity>")));
        */
        return predicates;
    }

    protected Root<MtrModalidadTrabajo> setAdicionalDeltaTotalPredicate(MtrModalidadTrabajoResponse bean, Root<MtrModalidadTrabajo> countRoot)
            throws Exception {
        MtrModalidadTrabajo entity = bean.getBean();
        //Ejemplo
        /*
        if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
            if (Optional.ofNullable(entity.get<VariableManytoOne>()).isPresent()) {
                Join<MtrModalidadTrabajo, <ClaseManytoOne>> from<ClaseManytoOne> = countRoot.join("<variableManytoOne>", JoinType.INNER);
            }
        }
        */
        return countRoot;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected String setValidacionesPrevias(MtrModalidadTrabajo bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected MtrModalidadTrabajo setCreate(MtrModalidadTrabajo bean) throws Exception {
        return bean;
    }

    protected void setSave(MtrModalidadTrabajo dto) throws Exception {
        return;
    }

    protected void setDelete(Long id) throws Exception {

    }

    protected void setDeleteAll() throws Exception {

    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected MtrModalidadTrabajo setUploadExcel(Cell currentCell, MtrModalidadTrabajo mtrModalidadTrabajo, int contador) throws Exception {
        mtrModalidadTrabajo = super.setUploadExcel(currentCell, mtrModalidadTrabajo, contador);
        return mtrModalidadTrabajo;
    }

    protected String setSaveMasivo(MtrModalidadTrabajo dto) throws Exception {
        return "";
    }

    protected List<MtrModalidadTrabajo> setBeforeDeleteMasivo(List<MtrModalidadTrabajo> listaDto) throws Exception {
        return listaDto;
    }

    protected void setAfterDeleteMasivo() throws Exception {
        return;
    }

    /*****************************/
    /* Metodos que generan Excel */
    /*****************************/

    protected void setDownloadExcelItem(MtrModalidadTrabajo bean, HSSFRow dataRow) {

    }

    protected void setDownloadExcel(HSSFSheet sheet) {

    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
