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
import com.incloud.hcp.domain.response.CsHistorialResponse;
import com.incloud.hcp.exception.ServiceException;
import com.incloud.hcp.repository.delta.AppParametriaDeltaRepository;
import com.incloud.hcp.repository.delta.CsHistorialDeltaRepository;
import com.incloud.hcp.repository.delta.CsOrdenServicioDeltaRepository;
import com.incloud.hcp.repository.delta.MtrEstadoDeltaRepository;
import com.incloud.hcp.service.CsHistorialService;
import com.incloud.hcp.service._framework.bean.BeanCargaMasivoDTO;
import com.incloud.hcp.service._framework.bean.BeanListaMasivoDTO;
import com.incloud.hcp.service._framework.impl.JPACustomServiceImpl;
import com.incloud.hcp.service.delta.CsOrdenServicioDeltaService;
import com.incloud.hcp.service.delta.MtrEstadoDeltaService;
import com.incloud.hcp.service.requireNew.CsHistorialRequireNewService;
import com.incloud.hcp.service.support.PageRequestByExample;
import com.incloud.hcp.utils.Constants;
import com.incloud.hcp.utils.DateUtils;
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
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * A simple DTO Facility for CsHistorial.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public abstract class CsHistorialServiceImpl extends JPACustomServiceImpl<CsHistorialResponse, CsHistorial, Long> implements CsHistorialService {

    protected final String NAME_SHEET = "CsHistorial";
    protected final String CONFIG_TITLE = "com/incloud/hcp/excel/CsHistorialExcel.xml";
    private final Integer REGISTROS_COLOR = 10;

    @Autowired
    protected AppParametriaDeltaRepository appParametriaDeltaRepository;

    @Autowired
    protected CsHistorialDeltaRepository csHistorialDeltaRepository;

    @Autowired
    protected CsHistorialRequireNewService csHistorialRequireNewService;

    @Autowired
    protected CsOrdenServicioDeltaService csOrdenServicioDeltaService;

    @Autowired
    protected CsOrdenServicioDeltaRepository csOrdenServicioDeltaRepository;

    @Autowired
    protected MtrEstadoDeltaService mtrEstadoDeltaService;

    @Autowired
    protected MtrEstadoDeltaRepository mtrEstadoDeltaRepository;

    /*****************************/
    /* Metodos de Busqueda       */
    /*****************************/

    protected final ExampleMatcher setAbstractFind(ExampleMatcher matcher) {
        matcher = ExampleMatcher.matching() //
                .withMatcher(CsHistorial_.descripcion.getName(), match -> match.ignoreCase().startsWith())
                .withMatcher(CsHistorial_.usuarioHistorial.getName(), match -> match.ignoreCase().startsWith());
        return matcher;
    }

    protected abstract Sort setFindAll(Sort sort);

    protected abstract Sort setFind(CsHistorial req, ExampleMatcher matcher, Example<CsHistorial> example, Sort sort);

    protected abstract void setFindPaginated(PageRequestByExample<CsHistorial> req, ExampleMatcher matcher, Example<CsHistorial> example);

    protected final CsHistorial setObtenerBeanResponse(CsHistorialResponse bean) {
        return bean.getBean();
    }

    protected final Class<CsHistorial> setObtenerClassBean() {
        return CsHistorial.class;
    }

    protected List<Predicate> setAbstractPredicate(CsHistorialResponse bean, CriteriaBuilder cb, Root<CsHistorial> root) {
        List<Predicate> predicates = new ArrayList<>();
        CsHistorial entity = bean.getBean();
        /* Obtener condiciones */
        PredicateUtils.addPredicates(predicates, bean.getIdCondicion(), "id", entity.getId(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getDescripcionCondicion(), "descripcion", entity.getDescripcion(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getUsuarioHistorialCondicion(), "usuarioHistorial", entity.getUsuarioHistorial(), cb, root);
        PredicateUtils.addPredicates(predicates, bean.getFechaHistorialCondicion(), "fechaHistorial", entity.getFechaHistorial(), cb, root);
        //PredicateUtils.addPredicates(predicates, bean.getCsOrdenServicioCondicion(), "csOrdenServicio", entity.getCsOrdenServicio(), cb, root);
        //PredicateUtils.addPredicates(predicates, bean.getMtrEstadoCondicion(), "mtrEstado", entity.getMtrEstado(), cb, root);
        /* Obtener valores de Lista */
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "id", bean.getIdList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "descripcion", bean.getDescripcionList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "usuarioHistorial", bean.getUsuarioHistorialList(), cb, root);
        PredicateUtils.addPredicatesListValorPrimitivo(predicates, "fechaHistorial", bean.getFechaHistorialList(), cb, root);
        //PredicateUtils.addPredicatesListValorBean(predicates, "csOrdenServicio", bean.getCsOrdenServicioList(), cb, root);
        //PredicateUtils.addPredicatesListValorBean(predicates, "mtrEstado", bean.getMtrEstadoList(), cb, root);
        return predicates;
    }

    /****************/
    /* METODOS CRUD */
    /****************/

    protected final String validacionesPrevias(CsHistorial bean) throws Exception {
        String mensaje = "";
        if (!Optional.of(bean.getUsuarioHistorial()).isPresent()) {
            String msg = this.messageSource.getMessage("message.csHistorial.usuarioHistorial.requerido", null, LocaleContextHolder.getLocale());
            mensaje += "* " + msg + "<br/>";
        }
        if (!Optional.of(bean.getFechaHistorial()).isPresent()) {
            String msg = this.messageSource.getMessage("message.csHistorial.fechaHistorial.requerido", null, LocaleContextHolder.getLocale());
            mensaje += "* " + msg + "<br/>";
        }
        String msg = this.setValidacionesPrevias(bean);
        if (StringUtils.isNotBlank(msg)) {
            mensaje += "* " + msg + "<br/>";
        }
        return mensaje;
    }

    protected String setValidacionesPrevias(CsHistorial bean) throws Exception {
        String mensaje = "";
        return mensaje;
    }

    protected String validacionesPreviasCreate(CsHistorial bean) throws Exception {
        String msg = null;
        CsHistorial validar = null;
        return msg;
    }

    protected String validacionesPreviasSave(CsHistorial bean) throws Exception {
        String msg = null;
        CsHistorial validar = null;
        return msg;
    }

    protected CsHistorial completarDatosBean(CsHistorial bean) throws Exception {
        BigDecimal data = new BigDecimal(0.00);
        bean = this.setCompletarDatosBean(bean);
        return bean;
    }

    protected CsHistorial setCompletarDatosBean(CsHistorial bean) throws Exception {
        return bean;
    }

    protected final CsHistorial setAbstractCreate(CsHistorial dto) throws Exception {
        CsHistorial bean = new CsHistorial();
        bean = (CsHistorial) BeanUtils.cloneBean(dto);
        return bean;
    }

    /************************/
    /* METODOS CRUD Masivos */
    /************************/

    protected CsHistorial setUploadExcel(Cell currentCell, CsHistorial csHistorial, int contador) throws Exception {
        Double valorDouble = new Double(0);
        BigDecimal valorDecimal = new BigDecimal(0);
        Boolean valorBoolean = new Boolean(true);
        String valorCadena = "";
        switch (contador) {
        case 1:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 255) {
                    throw new ServiceException("Valor Campo descripcion contiene mas de 255 caracter(es)");
                }
                csHistorial.setDescripcion(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo descripcion está en formato incorrecto");
            }
            break;
        case 2:
            try {
                valorCadena = currentCell.getStringCellValue();
                if (valorCadena.length() > 100) {
                    throw new ServiceException("Valor Campo usuarioHistorial contiene mas de 100 caracter(es)");
                }
                csHistorial.setUsuarioHistorial(valorCadena);
            } catch (Exception e) {
                throw new ServiceException("Valor Campo usuarioHistorial está en formato incorrecto");
            }
            break;
        case 3:
            try {
                valorCadena = currentCell.getStringCellValue();
                Date valorFechaD = DateUtils.convertStringToDate("dd/MM/yyyy", valorCadena);
                csHistorial.setFechaHistorial(valorFechaD);
            } catch (Exception ex) {
                throw new ServiceException("Valor Campo fechaHistorial está en formato incorrecto");
            }
            break;
        default:
            break;
        }
        return csHistorial;
    }

    protected AppParametria setObtenerRegistroConfiguracionUploadExcel() {
        AppParametria appParametriaData = this.appParametriaDeltaRepository.getByModuloAndLabelAndStatus(AppParametriaModuloEnum.CARGA_EXCEL.getEstado(),
                AppParametriaLabelEnum.INICIO_REGISTRO_DATA.getEstado(), Constants.ESTADO_ACTIVO);
        return appParametriaData;
    }

    protected CsHistorial setInicializarBeanUpdateExcel() {
        CsHistorial bean = new CsHistorial();
        bean.setId(null);
        return bean;
    }

    protected final Long setObtenerId(CsHistorial bean) {
        return bean.getId();
    }

    /************************/
    /* Instancia de Bean    */
    /************************/

    protected final CsHistorial createInstance() {
        CsHistorial csHistorial = new CsHistorial();
        return csHistorial;
    }

    protected final BeanCargaMasivoDTO<CsHistorial> createInstanceMasivoDTO() {
        BeanCargaMasivoDTO<CsHistorial> beanCargaMasivoDTO = new BeanCargaMasivoDTO<CsHistorial>();
        return beanCargaMasivoDTO;

    }

    protected final BeanListaMasivoDTO<BeanCargaMasivoDTO<CsHistorial>> createInstanceListaMasivoDTO() {
        BeanListaMasivoDTO<BeanCargaMasivoDTO<CsHistorial>> beanCargaMasivoDTOBeanListaMasivoDTO = new BeanListaMasivoDTO<BeanCargaMasivoDTO<CsHistorial>>();
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

    protected int setAbstractDownloadExcel(CsHistorial bean, HSSFRow dataRow) {
        int contador = 0;
        ExcelDefault.setValueCell(bean.getId(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getDescripcion(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getUsuarioHistorial(), dataRow.createCell(contador));
        contador++;
        ExcelDefault.setValueCell(bean.getFechaHistorial(), dataRow.createCell(contador));
        contador++;
        return contador;
    }

    protected int setAbstractDownloadExcelSXLSX(CsHistorial bean, Row dataRow, List<CellStyle> cellStyleList) {
        int contador = 0;
        ExcelDefault.setValueCell(bean.getId(), dataRow.createCell(contador), "I", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getDescripcion(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getUsuarioHistorial(), dataRow.createCell(contador), "S", cellStyleList);
        contador++;
        ExcelDefault.setValueCell(bean.getFechaHistorial(), dataRow.createCell(contador), "DT", cellStyleList);
        contador++;
        return contador;
    }

    protected String setAbstractGenerateInsertExcelSXLSX(CsHistorial bean) {
        String fechaS = "";
        String sqlInsert = "INSERT INTO CS_HISTORIAL(";
        sqlInsert = sqlInsert + "CS_HISTORIAL_ID" + ", ";
        sqlInsert = sqlInsert + "DESCRIPCION" + ", ";
        sqlInsert = sqlInsert + "USUARIO_HISTORIAL" + ", ";
        sqlInsert = sqlInsert + "FECHA_HISTORIAL" + ", ";
        sqlInsert = sqlInsert + "MTR_ESTADO_ID" + ", ";
        sqlInsert = sqlInsert + "CS_ORDEN_SERVICIO_ID" + ")";
        sqlInsert = sqlInsert + " VALUES (";
        sqlInsert = sqlInsert + bean.getId() + ", ";
        if (StringUtils.isBlank(bean.getDescripcion())) {
            sqlInsert = sqlInsert + "null" + ", ";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getDescripcion() + "'" + ", ";
        }
        if (StringUtils.isBlank(bean.getUsuarioHistorial())) {
            sqlInsert = sqlInsert + "null" + ", ";
        } else {
            sqlInsert = sqlInsert + "'" + bean.getUsuarioHistorial() + "'" + ", ";
        }
        if (bean.getFechaHistorial() != null) {
            fechaS = DateUtils.convertDateToString("dd/MM/yyyy HH:mm:ss", bean.getFechaHistorial());
            sqlInsert = sqlInsert + "to_date('" + fechaS + "','dd/MM/yyyy HH:mm:ss')" + ", ";
        } else {
            sqlInsert = sqlInsert + "null" + ", ";
        }
        sqlInsert = sqlInsert + bean.getCsOrdenServicio().getId() + ", ";
        sqlInsert = sqlInsert + bean.getMtrEstado().getId();
        sqlInsert = sqlInsert + " );";
        return sqlInsert;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

    public Long countByCsOrdenServicio(CsOrdenServicio csOrdenServicio) {
        return this.csHistorialDeltaRepository.countByCsOrdenServicio(csOrdenServicio);
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
            Long valor = this.csHistorialDeltaRepository.countByCsOrdenServicio(bean);
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
            Long valor = this.csHistorialDeltaRepository.countByCsOrdenServicio(bean);
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

    public Long countByMtrEstado(MtrEstado mtrEstado) {
        return this.csHistorialDeltaRepository.countByMtrEstado(mtrEstado);
    }

    public GraphBean graphByMtrEstado() {
        List<MtrEstado> lista = this.mtrEstadoDeltaRepository.findAll();
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
        for (MtrEstado bean : lista) {
            Long valor = this.csHistorialDeltaRepository.countByMtrEstado(bean);
            String descripcion = this.setGraphDescripcionByMtrEstado(bean);
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
        String titulo = this.setGraphPieChartTituloByMtrEstado();
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
        labelsBar[0] = this.setGraphBarChartTituloByMtrEstado();
        contador = 0;
        contadorColor = 0;
        for (MtrEstado bean : lista) {
            Long valor = this.csHistorialDeltaRepository.countByMtrEstado(bean);
            String descripcion = this.setGraphDescripcionByMtrEstado(bean);
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

    protected String setGraphDescripcionByMtrEstado(MtrEstado mtrEstado) {
        return mtrEstado.getId().toString();
    }

    protected String setGraphPieChartTituloByMtrEstado() {
        return "MtrEstado";
    }

    protected String setGraphBarChartTituloByMtrEstado() {
        return "MtrEstado";
    }

}