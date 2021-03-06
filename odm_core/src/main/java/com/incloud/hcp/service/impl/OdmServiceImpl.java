/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/dto/EntityDTOService.java.e.vm
 */
package com.incloud.hcp.service.impl;

import com.incloud.hcp.common.enums.AppParametriaLabelEnum;
import com.incloud.hcp.common.enums.AppParametriaModuloEnum;
import com.incloud.hcp.common.excel.ExcelDefault;
import com.incloud.hcp.domain.AppParametria;
import com.incloud.hcp.domain.Odm;
import com.incloud.hcp.domain.Odm_;
import com.incloud.hcp.domain.response.OdmResponse;
import com.incloud.hcp.exception.ServiceException;
import com.incloud.hcp.repository.delta.AppParametriaDeltaRepository;
import com.incloud.hcp.repository.delta.OdmDeltaRepository;
import com.incloud.hcp.service.OdmService;
import com.incloud.hcp.service._framework.bean.BeanCargaMasivoDTO;
import com.incloud.hcp.service._framework.bean.BeanListaMasivoDTO;
import com.incloud.hcp.service._framework.impl.JPACustomServiceImpl;
import com.incloud.hcp.service.requireNew.OdmRequireNewService;
import com.incloud.hcp.service.support.PageRequestByExample;
import com.incloud.hcp.utils.Constants;
import com.incloud.hcp.utils.PredicateUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple DTO Facility for Odm.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public abstract class OdmServiceImpl extends JPACustomServiceImpl<OdmResponse, Odm, Long> implements OdmService {

    protected final String NAME_SHEET = "Odm";
    protected final String CONFIG_TITLE = "com/incloud/hcp/excel/OdmExcel.xml";
    private final Integer REGISTROS_COLOR = 10;

    @Autowired
    protected AppParametriaDeltaRepository appParametriaDeltaRepository;

    @Autowired
    protected OdmDeltaRepository odmDeltaRepository;

    @Autowired
    protected OdmRequireNewService odmRequireNewService;

    /*****************************/
    /* Metodos de Busqueda       */
    /*****************************/

    protected final ExampleMatcher setAbstractFind(ExampleMatcher matcher) {
        matcher = ExampleMatcher.matching() //
                .withMatcher(Odm_.codigoEquipoSap.getName(), match -> match.ignoreCase().startsWith())
                .withMatcher(Odm_.codigoProveedorSap.getName(), match -> match.ignoreCase().startsWith());
        return matcher;
    }

    protected abstract Sort setFindAll(Sort sort);

    protected abstract Sort setFind(Odm req, ExampleMatcher matcher, Example<Odm> example, Sort sort);

    protected abstract void setFindPaginated(PageRequestByExample<Odm> req, ExampleMatcher matcher, Example<Odm> example);

    protected final Odm setObtenerBeanResponse(OdmResponse bean) {
        return bean.getBean();
    }

    protected final Class<Odm> setObtenerClassBean() {
        return Odm.class;
    }

    protected List<Predicate> setAbstractPredicate(OdmResponse bean, CriteriaBuilder cb, Root<Odm> root) {
        List<Predicate> predicates = new ArrayList<>();
        Odm entity = bean.getBean();
        /* Obtener condiciones */
        PredicateUtils.addPredicates(predicates, bean.getIdCondicion(), "id", entity.getId(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getCodigoEquipoSapCondicion(), "codigoEquipoSap", entity.getCodigoEquipoSap(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getCodigoProveedorSapCondicion(), "codigoProveedorSap", entity.getCodigoProveedorSap(), cb, root);
        /* Obtener valores de Lista */
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "id", bean.getIdList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "codigoEquipoSap", bean.getCodigoEquipoSapList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "codigoProveedorSap", bean.getCodigoProveedorSapList(), cb, root);
        return predicates;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected final String validacionesPrevias(Odm bean) throws Exception {
        String mensaje = "";
        String msg = this.setValidacionesPrevias(bean);
        if (StringUtils.isNotBlank(msg)) {
            mensaje += "* " + msg + "<br/>";
        }
        return mensaje;
    }

    protected String setValidacionesPrevias(Odm bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected String validacionesPreviasCreate(Odm bean) throws Exception {
        String msg = null;
        Odm validar = null;
        return msg;
    }

    protected String validacionesPreviasSave(Odm bean) throws Exception {
        String msg = null;
        Odm validar = null;
        return msg;
    }

    protected Odm completarDatosBean(Odm bean) throws Exception {
        BigDecimal data = new BigDecimal(0.00);
        bean = this.setCompletarDatosBean(bean);
        return bean;
    }

    protected Odm setCompletarDatosBean(Odm bean) throws Exception {
        return bean;
    }

    protected final Odm setAbstractCreate(Odm dto) throws Exception {
        Odm bean = new Odm();
        bean = (Odm) BeanUtils.cloneBean(dto);
        return bean;
    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected Odm setUploadExcel(Cell currentCell, Odm odm, int contador) throws Exception {
        Double valorDouble = new Double(0);
        BigDecimal valorDecimal = new BigDecimal(0);
        Boolean valorBoolean = new Boolean(true);
        String valorCadena = "";
        switch (contador) {
        case 1:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 18) {
                    throw new ServiceException("Valor Campo codigoEquipoSap contiene mas de 18 caracter(es)");
                }
                odm.setCodigoEquipoSap(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo codigoEquipoSap está en formato incorrecto");
            }
            break;
        case 2:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 10) {
                    throw new ServiceException("Valor Campo codigoProveedorSap contiene mas de 10 caracter(es)");
                }
                odm.setCodigoProveedorSap(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo codigoProveedorSap está en formato incorrecto");
            }
            break;
        default:
            break;
        }
        return odm;
    }

    protected AppParametria setObtenerRegistroConfiguracionUploadExcel() {
        AppParametria appParametriaData = this.appParametriaDeltaRepository.getByModuloAndLabelAndStatus(AppParametriaModuloEnum.CARGA_EXCEL.getEstado(),
                AppParametriaLabelEnum.INICIO_REGISTRO_DATA.getEstado(), Constants.ESTADO_ACTIVO);
        return appParametriaData;
    }

    protected Odm setInicializarBeanUpdateExcel() {
        Odm bean = new Odm();
        bean.setId(null);
        return bean;
    }

    protected final Long setObtenerId(Odm bean) {
        return bean.getId();
    }

    /************************/
    /* Instancia de Bean    */
    /************************/

    protected final Odm createInstance() {
        Odm odm = new Odm();
        return odm;
    }

    protected final BeanCargaMasivoDTO<Odm> createInstanceMasivoDTO() {
        BeanCargaMasivoDTO<Odm> beanCargaMasivoDTO = new BeanCargaMasivoDTO<Odm>();
        return beanCargaMasivoDTO;

    }

    protected final BeanListaMasivoDTO<BeanCargaMasivoDTO<Odm>> createInstanceListaMasivoDTO() {
        BeanListaMasivoDTO<BeanCargaMasivoDTO<Odm>> beanCargaMasivoDTOBeanListaMasivoDTO = new BeanListaMasivoDTO<BeanCargaMasivoDTO<Odm>>();
        return beanCargaMasivoDTOBeanListaMasivoDTO;
    }

    /*****************************/
    /* Metodos que generan Excel */
    /*****************************/

    protected String devuelveNombreSheet() {
        return this.NAME_SHEET;
    }

    protected String devuelveListaHeaderExcelXML() {
        return this.CONFIG_TITLE;
    }

    protected int setAbstractDownloadExcel(Odm bean, HSSFRow dataRow) {
        int contador = 0;
        ExcelDefault.setValueCell(bean.getId(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getCodigoEquipoSap(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getCodigoProveedorSap(), dataRow.createCell(contador));
        contador++;
        return contador;
    }

    protected int setAbstractDownloadExcelSXLSX(Odm bean, Row dataRow, List<CellStyle> cellStyleList) {
        int contador = 0;
        ExcelDefault.setValueCell(bean.getId(), dataRow.createCell(contador), "I", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getCodigoEquipoSap(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getCodigoProveedorSap(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        return contador;
    }

    protected String setAbstractGenerateInsertExcelSXLSX(Odm bean) {
        String fechaS = "";
        String sqlInsert = "INSERT INTO ODM(";
        sqlInsert = sqlInsert + "ODM_ID" + ", ";
        sqlInsert = sqlInsert + "CODIGO_EQUIPO_SAP" + ", ";
        sqlInsert = sqlInsert + "CODIGO_PROVEEDOR_SAP" + ")";
        sqlInsert = sqlInsert + " VALUES (";
        sqlInsert = sqlInsert + bean.getId() + ", ";
        if (StringUtils.isBlank(bean.getCodigoEquipoSap())) {
            sqlInsert = sqlInsert + "null" + ", ";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getCodigoEquipoSap() + "'" + ", ";
        }
        if (StringUtils.isBlank(bean.getCodigoProveedorSap())) {
            sqlInsert = sqlInsert + "null";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getCodigoProveedorSap() + "'";
        }
        sqlInsert = sqlInsert + " );";
        return sqlInsert;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

}
