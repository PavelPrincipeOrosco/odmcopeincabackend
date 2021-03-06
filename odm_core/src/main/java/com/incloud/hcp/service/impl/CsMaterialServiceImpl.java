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
import com.incloud.hcp.common.graph.GraphBarChart;
import com.incloud.hcp.common.graph.GraphBean;
import com.incloud.hcp.common.graph.GraphDataset;
import com.incloud.hcp.common.graph.GraphPieChart;
import com.incloud.hcp.domain.*;
import com.incloud.hcp.domain.response.CsMaterialResponse;
import com.incloud.hcp.exception.ServiceException;
import com.incloud.hcp.repository.delta.AppParametriaDeltaRepository;
import com.incloud.hcp.repository.delta.CsMaterialDeltaRepository;
import com.incloud.hcp.repository.delta.CsOrdenServicioDeltaRepository;
import com.incloud.hcp.repository.delta.MtrUnidadMedidaDeltaRepository;
import com.incloud.hcp.service.CsMaterialService;
import com.incloud.hcp.service._framework.bean.BeanCargaMasivoDTO;
import com.incloud.hcp.service._framework.bean.BeanListaMasivoDTO;
import com.incloud.hcp.service._framework.impl.JPACustomServiceImpl;
import com.incloud.hcp.service.delta.CsOrdenServicioDeltaService;
import com.incloud.hcp.service.delta.MtrUnidadMedidaDeltaService;
import com.incloud.hcp.service.requireNew.CsMaterialRequireNewService;
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
import org.springframework.context.i18n.LocaleContextHolder;
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
import java.util.Optional;

/**
 * A simple DTO Facility for CsMaterial.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public abstract class CsMaterialServiceImpl extends JPACustomServiceImpl<CsMaterialResponse, CsMaterial, Long> implements CsMaterialService {

    protected final String NAME_SHEET = "CsMaterial";
    protected final String CONFIG_TITLE = "com/incloud/hcp/excel/CsMaterialExcel.xml";
    private final Integer REGISTROS_COLOR = 10;

    @Autowired
    protected AppParametriaDeltaRepository appParametriaDeltaRepository;

    @Autowired
    protected CsMaterialDeltaRepository csMaterialDeltaRepository;

    @Autowired
    protected CsMaterialRequireNewService csMaterialRequireNewService;

    @Autowired
    protected MtrUnidadMedidaDeltaService mtrUnidadMedidaDeltaService;

    @Autowired
    protected MtrUnidadMedidaDeltaRepository mtrUnidadMedidaDeltaRepository;

    @Autowired
    protected CsOrdenServicioDeltaService csOrdenServicioDeltaService;

    @Autowired
    protected CsOrdenServicioDeltaRepository csOrdenServicioDeltaRepository;

    /*****************************/
    /* Metodos de Busqueda       */
    /*****************************/

    protected final ExampleMatcher setAbstractFind(ExampleMatcher matcher) {
        matcher = ExampleMatcher.matching() //
                .withMatcher(CsMaterial_.codigoMaterial.getName(), match -> match.ignoreCase().startsWith())
                .withMatcher(CsMaterial_.descripcionMaterial.getName(), match -> match.ignoreCase().startsWith());
        return matcher;
    }

    protected abstract Sort setFindAll(Sort sort);

    protected abstract Sort setFind(CsMaterial req, ExampleMatcher matcher, Example<CsMaterial> example, Sort sort);

    protected abstract void setFindPaginated(PageRequestByExample<CsMaterial> req, ExampleMatcher matcher, Example<CsMaterial> example);

    protected final CsMaterial setObtenerBeanResponse(CsMaterialResponse bean) {
        return bean.getBean();
    }

    protected final Class<CsMaterial> setObtenerClassBean() {
        return CsMaterial.class;
    }

    protected List<Predicate> setAbstractPredicate(CsMaterialResponse bean, CriteriaBuilder cb, Root<CsMaterial> root) {
        List<Predicate> predicates = new ArrayList<>();
        CsMaterial entity = bean.getBean();
        /* Obtener condiciones */
        PredicateUtils.addPredicates(predicates, bean.getIdCondicion(), "id", entity.getId(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getCodigoMaterialCondicion(), "codigoMaterial", entity.getCodigoMaterial(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getDescripcionMaterialCondicion(), "descripcionMaterial", entity.getDescripcionMaterial(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getCantidadCondicion(), "cantidad", entity.getCantidad(), cb, root);
        //PredicateUtils.addPredicates(predicates, bean.getMtrUnidadMedidaCondicion(), "mtrUnidadMedida", entity.getMtrUnidadMedida(), cb, root);
        //PredicateUtils.addPredicates(predicates, bean.getCsOrdenServicioCondicion(), "csOrdenServicio", entity.getCsOrdenServicio(), cb, root);
        /* Obtener valores de Lista */
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "id", bean.getIdList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "codigoMaterial", bean.getCodigoMaterialList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "descripcionMaterial", bean.getDescripcionMaterialList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "cantidad", bean.getCantidadList(), cb, root);
        //PredicateUtils.addPredicatesListValorBean(predicates, "mtrUnidadMedida", bean.getMtrUnidadMedidaList(), cb, root);
        //PredicateUtils.addPredicatesListValorBean(predicates, "csOrdenServicio", bean.getCsOrdenServicioList(), cb, root);
        return predicates;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected final String validacionesPrevias(CsMaterial bean) throws Exception {
        String mensaje = "";
        if (!Optional.of(bean.getCodigoMaterial()).isPresent()) {
            String msg = this.messageSource.getMessage("message.csMaterial.codigoMaterial.requerido", null, LocaleContextHolder.getLocale());
            mensaje += "* " + msg + "<br/>";
        }
        if (!Optional.of(bean.getDescripcionMaterial()).isPresent()) {
            String msg = this.messageSource.getMessage("message.csMaterial.descripcionMaterial.requerido", null, LocaleContextHolder.getLocale());
            mensaje += "* " + msg + "<br/>";
        }
        String msg = this.setValidacionesPrevias(bean);
        if (StringUtils.isNotBlank(msg)) {
            mensaje += "* " + msg + "<br/>";
        }
        return mensaje;
    }

    protected String setValidacionesPrevias(CsMaterial bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected String validacionesPreviasCreate(CsMaterial bean) throws Exception {
        String msg = null;
        CsMaterial validar = null;
        return msg;
    }

    protected String validacionesPreviasSave(CsMaterial bean) throws Exception {
        String msg = null;
        CsMaterial validar = null;
        return msg;
    }

    protected CsMaterial completarDatosBean(CsMaterial bean) throws Exception {
        BigDecimal data = new BigDecimal(0.00);
        if (Optional.ofNullable(bean.getCantidad()).isPresent()) {
            bean.setCantidad(bean.getCantidad().setScale(2, BigDecimal.ROUND_HALF_UP));
        }
        bean = this.setCompletarDatosBean(bean);
        return bean;
    }

    protected CsMaterial setCompletarDatosBean(CsMaterial bean) throws Exception {
        return bean;
    }

    protected final CsMaterial setAbstractCreate(CsMaterial dto) throws Exception {
        CsMaterial bean = new CsMaterial();
        bean = (CsMaterial) BeanUtils.cloneBean(dto);
        return bean;
    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected CsMaterial setUploadExcel(Cell currentCell, CsMaterial csMaterial, int contador) throws Exception {
        Double valorDouble = new Double(0);
        BigDecimal valorDecimal = new BigDecimal(0);
        Boolean valorBoolean = new Boolean(true);
        String valorCadena = "";
        switch (contador) {
        case 1:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 100) {
                    throw new ServiceException("Valor Campo codigoMaterial contiene mas de 100 caracter(es)");
                }
                csMaterial.setCodigoMaterial(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo codigoMaterial está en formato incorrecto");
            }
            break;
        case 2:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 255) {
                    throw new ServiceException("Valor Campo descripcionMaterial contiene mas de 255 caracter(es)");
                }
                csMaterial.setDescripcionMaterial(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo descripcionMaterial está en formato incorrecto");
            }
            break;
        case 3:
            try {
                valorDecimal = new BigDecimal(currentCell.getNumericCellValue());
                csMaterial.setCantidad(valorDecimal);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo cantidad está en formato incorrecto");
            }
            break;
        default:
            break;
        }
        return csMaterial;
    }

    protected AppParametria setObtenerRegistroConfiguracionUploadExcel() {
        AppParametria appParametriaData = this.appParametriaDeltaRepository.getByModuloAndLabelAndStatus(AppParametriaModuloEnum.CARGA_EXCEL.getEstado(),
                AppParametriaLabelEnum.INICIO_REGISTRO_DATA.getEstado(), Constants.ESTADO_ACTIVO);
        return appParametriaData;
    }

    protected CsMaterial setInicializarBeanUpdateExcel() {
        CsMaterial bean = new CsMaterial();
        bean.setId(null);
        return bean;
    }

    protected final Long setObtenerId(CsMaterial bean) {
        return bean.getId();
    }

    /************************/
    /* Instancia de Bean    */
    /************************/

    protected final CsMaterial createInstance() {
        CsMaterial csMaterial = new CsMaterial();
        return csMaterial;
    }

    protected final BeanCargaMasivoDTO<CsMaterial> createInstanceMasivoDTO() {
        BeanCargaMasivoDTO<CsMaterial> beanCargaMasivoDTO = new BeanCargaMasivoDTO<CsMaterial>();
        return beanCargaMasivoDTO;

    }

    protected final BeanListaMasivoDTO<BeanCargaMasivoDTO<CsMaterial>> createInstanceListaMasivoDTO() {
        BeanListaMasivoDTO<BeanCargaMasivoDTO<CsMaterial>> beanCargaMasivoDTOBeanListaMasivoDTO = new BeanListaMasivoDTO<BeanCargaMasivoDTO<CsMaterial>>();
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

    protected int setAbstractDownloadExcel(CsMaterial bean, HSSFRow dataRow) {
        int contador = 0;
        ExcelDefault.setValueCell(bean.getId(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getCodigoMaterial(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getDescripcionMaterial(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getCantidad(), dataRow.createCell(contador));
        contador++;
        return contador;
    }

    protected int setAbstractDownloadExcelSXLSX(CsMaterial bean, Row dataRow, List<CellStyle> cellStyleList) {
        int contador = 0;
        ExcelDefault.setValueCell(bean.getId(), dataRow.createCell(contador), "I", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getCodigoMaterial(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getDescripcionMaterial(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getCantidad(), dataRow.createCell(contador), "N", cellStyleList);
        contador++;
        return contador;
    }

    protected String setAbstractGenerateInsertExcelSXLSX(CsMaterial bean) {
        String fechaS = "";
        String sqlInsert = "INSERT INTO CS_MATERIAL(";
        sqlInsert = sqlInsert + "CS_MATERIAL_ID" + ", ";
        sqlInsert = sqlInsert + "CODIGO_MATERIAL" + ", ";
        sqlInsert = sqlInsert + "DESCRIPCION_MATERIAL" + ", ";
        sqlInsert = sqlInsert + "CANTIDAD" + ", ";
        sqlInsert = sqlInsert + "MTR_UNIDAD_MEDIDA_ID" + ", ";
        sqlInsert = sqlInsert + "CS_ORDEN_SERVICIO_ID" + ")";
        sqlInsert = sqlInsert + " VALUES (";
        sqlInsert = sqlInsert + bean.getId() + ", ";
        if (StringUtils.isBlank(bean.getCodigoMaterial())) {
            sqlInsert = sqlInsert + "null" + ", ";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getCodigoMaterial() + "'" + ", ";
        }
        if (StringUtils.isBlank(bean.getDescripcionMaterial())) {
            sqlInsert = sqlInsert + "null" + ", ";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getDescripcionMaterial() + "'" + ", ";
        }
        sqlInsert = sqlInsert + bean.getCantidad() + ", ";
        sqlInsert = sqlInsert + bean.getMtrUnidadMedida().getId() + ", ";
        sqlInsert = sqlInsert + bean.getCsOrdenServicio().getId();
        sqlInsert = sqlInsert + " );";
        return sqlInsert;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

    public Long countByMtrUnidadMedida(MtrUnidadMedida mtrUnidadMedida) {
        return this.csMaterialDeltaRepository.countByMtrUnidadMedida(mtrUnidadMedida);
    }

    public GraphBean graphByMtrUnidadMedida() {
        List<MtrUnidadMedida> lista = this.mtrUnidadMedidaDeltaRepository.findAll();
        if (lista == null || lista.size() <= 0) {
            return null;
        }
        GraphBean graphBean = new GraphBean();

        /* Obteniendo Pie Chart */
        GraphPieChart graphPieChart = new GraphPieChart();
        GraphDataset graphDataset = new GraphDataset();
        GraphDataset[] listaGraphDataset = new GraphDataset[1];
        Long[] data = new Long[lista.size()];
        String[] labels = new String[lista.size()];
        String[] backgroundColor = new String[lista.size()];
        String[] hoverBackgroundColor = new String[lista.size()];
        String[] borderColor = new String[lista.size()];
        String[] hoverBorderColor = new String[lista.size()];
        int contador = 0;
        int contadorColor = 0;
        for (MtrUnidadMedida bean : lista) {
            Long valor = this.csMaterialDeltaRepository.countByMtrUnidadMedida(bean);
            String descripcion = this.setGraphDescripcionByMtrUnidadMedida(bean);
            data[contador] = valor;
            labels[contador] = descripcion;
            backgroundColor[contador] = Constants.BACKGROUND_COLOR_GRAPH[contadorColor];
            hoverBackgroundColor[contador] = Constants.HOVER_BACKGROUND_COLOR_GRAPH[contadorColor];
            borderColor[contador] = Constants.BACKGROUND_COLOR_GRAPH[contadorColor];
            hoverBorderColor[contador] = Constants.HOVER_BACKGROUND_COLOR_GRAPH[contadorColor];
            contador++;
            contadorColor++;
            if (contadorColor >= REGISTROS_COLOR) {
                contadorColor = 1;
            }
        }
        String titulo = this.setGraphPieChartTituloByMtrUnidadMedida();
        graphDataset.setLabel(titulo);
        graphDataset.setData(data);
        graphDataset.setBackgroundColor(backgroundColor);
        graphDataset.setHoverBackgroundColor(hoverBackgroundColor);
        listaGraphDataset[0] = graphDataset;
        graphPieChart.setDatasets(listaGraphDataset);
        graphPieChart.setLabels(labels);
        graphBean.setPiechart(graphPieChart);

        GraphBarChart graphBarChart = new GraphBarChart();
        GraphDataset[] listaGraphDatasetBar = new GraphDataset[lista.size()];
        String[] labelsBar = new String[1];
        labelsBar[0] = this.setGraphBarChartTituloByMtrUnidadMedida();
        contador = 0;
        contadorColor = 0;
        for (MtrUnidadMedida bean : lista) {
            Long valor = this.csMaterialDeltaRepository.countByMtrUnidadMedida(bean);
            String descripcion = this.setGraphDescripcionByMtrUnidadMedida(bean);
            GraphDataset graphDatasetBar = new GraphDataset();
            Long[] dataBar = new Long[1];

            String[] backgroundColorBar = new String[1];
            String[] hoverBackgroundColorBar = new String[1];
            String[] borderColorBar = new String[1];
            String[] hoverBorderColorBar = new String[1];

            dataBar[0] = valor;
            backgroundColorBar[0] = Constants.BACKGROUND_COLOR_GRAPH[contadorColor];
            hoverBackgroundColorBar[0] = Constants.HOVER_BACKGROUND_COLOR_GRAPH[contadorColor];
            borderColorBar[0] = Constants.BACKGROUND_COLOR_GRAPH[contadorColor];
            hoverBorderColorBar[0] = Constants.HOVER_BACKGROUND_COLOR_GRAPH[contadorColor];

            graphDatasetBar.setLabel(descripcion);
            graphDatasetBar.setData(dataBar);
            graphDatasetBar.setBackgroundColor(backgroundColorBar);
            graphDatasetBar.setHoverBackgroundColor(hoverBackgroundColorBar);
            graphDatasetBar.setBorderColor(borderColorBar);
            graphDatasetBar.setHoverBorderColor(hoverBorderColorBar);
            listaGraphDatasetBar[contador] = graphDatasetBar;

            contador++;
            contadorColor++;
            if (contadorColor >= REGISTROS_COLOR) {
                contadorColor = 1;
            }

        }
        graphBarChart.setDatasets(listaGraphDatasetBar);
        graphBarChart.setLabels(labelsBar);
        graphBean.setBarchart(graphBarChart);
        return graphBean;
    }

    protected String setGraphDescripcionByMtrUnidadMedida(MtrUnidadMedida mtrUnidadMedida) {
        return mtrUnidadMedida.getId().toString();
    }

    protected String setGraphPieChartTituloByMtrUnidadMedida() {
        return "MtrUnidadMedida";
    }

    protected String setGraphBarChartTituloByMtrUnidadMedida() {
        return "MtrUnidadMedida";
    }

    public Long countByCsOrdenServicio(CsOrdenServicio csOrdenServicio) {
        return this.csMaterialDeltaRepository.countByCsOrdenServicio(csOrdenServicio);
    }

    public GraphBean graphByCsOrdenServicio() {
        List<CsOrdenServicio> lista = this.csOrdenServicioDeltaRepository.findAll();
        if (lista == null || lista.size() <= 0) {
            return null;
        }
        GraphBean graphBean = new GraphBean();

        /* Obteniendo Pie Chart */
        GraphPieChart graphPieChart = new GraphPieChart();
        GraphDataset graphDataset = new GraphDataset();
        GraphDataset[] listaGraphDataset = new GraphDataset[1];
        Long[] data = new Long[lista.size()];
        String[] labels = new String[lista.size()];
        String[] backgroundColor = new String[lista.size()];
        String[] hoverBackgroundColor = new String[lista.size()];
        String[] borderColor = new String[lista.size()];
        String[] hoverBorderColor = new String[lista.size()];
        int contador = 0;
        int contadorColor = 0;
        for (CsOrdenServicio bean : lista) {
            Long valor = this.csMaterialDeltaRepository.countByCsOrdenServicio(bean);
            String descripcion = this.setGraphDescripcionByCsOrdenServicio(bean);
            data[contador] = valor;
            labels[contador] = descripcion;
            backgroundColor[contador] = Constants.BACKGROUND_COLOR_GRAPH[contadorColor];
            hoverBackgroundColor[contador] = Constants.HOVER_BACKGROUND_COLOR_GRAPH[contadorColor];
            borderColor[contador] = Constants.BACKGROUND_COLOR_GRAPH[contadorColor];
            hoverBorderColor[contador] = Constants.HOVER_BACKGROUND_COLOR_GRAPH[contadorColor];
            contador++;
            contadorColor++;
            if (contadorColor >= REGISTROS_COLOR) {
                contadorColor = 1;
            }
        }
        String titulo = this.setGraphPieChartTituloByCsOrdenServicio();
        graphDataset.setLabel(titulo);
        graphDataset.setData(data);
        graphDataset.setBackgroundColor(backgroundColor);
        graphDataset.setHoverBackgroundColor(hoverBackgroundColor);
        listaGraphDataset[0] = graphDataset;
        graphPieChart.setDatasets(listaGraphDataset);
        graphPieChart.setLabels(labels);
        graphBean.setPiechart(graphPieChart);

        GraphBarChart graphBarChart = new GraphBarChart();
        GraphDataset[] listaGraphDatasetBar = new GraphDataset[lista.size()];
        String[] labelsBar = new String[1];
        labelsBar[0] = this.setGraphBarChartTituloByCsOrdenServicio();
        contador = 0;
        contadorColor = 0;
        for (CsOrdenServicio bean : lista) {
            Long valor = this.csMaterialDeltaRepository.countByCsOrdenServicio(bean);
            String descripcion = this.setGraphDescripcionByCsOrdenServicio(bean);
            GraphDataset graphDatasetBar = new GraphDataset();
            Long[] dataBar = new Long[1];

            String[] backgroundColorBar = new String[1];
            String[] hoverBackgroundColorBar = new String[1];
            String[] borderColorBar = new String[1];
            String[] hoverBorderColorBar = new String[1];

            dataBar[0] = valor;
            backgroundColorBar[0] = Constants.BACKGROUND_COLOR_GRAPH[contadorColor];
            hoverBackgroundColorBar[0] = Constants.HOVER_BACKGROUND_COLOR_GRAPH[contadorColor];
            borderColorBar[0] = Constants.BACKGROUND_COLOR_GRAPH[contadorColor];
            hoverBorderColorBar[0] = Constants.HOVER_BACKGROUND_COLOR_GRAPH[contadorColor];

            graphDatasetBar.setLabel(descripcion);
            graphDatasetBar.setData(dataBar);
            graphDatasetBar.setBackgroundColor(backgroundColorBar);
            graphDatasetBar.setHoverBackgroundColor(hoverBackgroundColorBar);
            graphDatasetBar.setBorderColor(borderColorBar);
            graphDatasetBar.setHoverBorderColor(hoverBorderColorBar);
            listaGraphDatasetBar[contador] = graphDatasetBar;

            contador++;
            contadorColor++;
            if (contadorColor >= REGISTROS_COLOR) {
                contadorColor = 1;
            }

        }
        graphBarChart.setDatasets(listaGraphDatasetBar);
        graphBarChart.setLabels(labelsBar);
        graphBean.setBarchart(graphBarChart);
        return graphBean;
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
