/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/rest/EntityResource.java.e.vm
 */
package com.incloud.hcp.rest;

import com.incloud.hcp.common.BindingErrorsResponse;
import com.incloud.hcp.common.graph.GraphBean;
import com.incloud.hcp.domain.*;
import com.incloud.hcp.domain.response.CsOrdenServicioResponse;
import com.incloud.hcp.repository.delta.CsOrdenServicioDeltaRepository;
import com.incloud.hcp.rest._framework.JPACustomRest;
import com.incloud.hcp.service.delta.CsOrdenServicioDeltaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.net.URISyntaxException;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public abstract class CsOrdenServicioRest extends JPACustomRest<CsOrdenServicioResponse, CsOrdenServicio, Long> {

    @Autowired
    protected CsOrdenServicioDeltaService csOrdenServicioDeltaService;

    @Autowired
    protected CsOrdenServicioDeltaRepository csOrdenServicioDeltaRepository;

    protected String setObtenerNombreArchivoExcel() {
        return "CsOrdenServicio";
    }

    /************************/
    /* Instancia de Bean    */
    /************************/
    protected final CsOrdenServicio createInstance() {
        CsOrdenServicio csOrdenServicio = new CsOrdenServicio();
        return csOrdenServicio;
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

    /**
    * Contador de registros para el atributo mtrModalidadTrabajo.
    */
    @ApiOperation(value = "Contador de registros para el atributo mtrModalidadTrabajo", produces = "application/json")
    @PostMapping(value = "/countByMtrModalidadTrabajo", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> countByMtrModalidadTrabajo(@RequestBody @Valid MtrModalidadTrabajo mtrModalidadTrabajo, BindingResult bindingResult)
            throws URISyntaxException {
        BindingErrorsResponse errors = new BindingErrorsResponse();
        HttpHeaders headers = new HttpHeaders();
        if (bindingResult.hasErrors()) {
            errors.addAllErrors(bindingResult);
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(errors.toJSON());
            }
            headers.add("errors", errors.toJSON());
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
        log.debug("Ingresando countByMtrModalidadTrabajo");
        try {
            return Optional.ofNullable(this.csOrdenServicioDeltaService.countByMtrModalidadTrabajo(mtrModalidadTrabajo))
                    .map(l -> new ResponseEntity<>(l, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Genera Grafico de registros para el atributo mtrModalidadTrabajo.
    */
    @ApiOperation(value = "Genera Grafico de registros para el atributo mtrModalidadTrabajo", produces = "application/json")
    @GetMapping(value = "/graphByMtrModalidadTrabajo", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GraphBean> graphByMtrModalidadTrabajo() throws URISyntaxException {
        log.debug("Ingresando graphByMtrModalidadTrabajo");
        try {
            return Optional.ofNullable(this.csOrdenServicioDeltaService.graphByMtrModalidadTrabajo()).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            HttpHeaders headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Contador de registros para el atributo mtrTiempoEntrega.
    */
    @ApiOperation(value = "Contador de registros para el atributo mtrTiempoEntrega", produces = "application/json")
    @PostMapping(value = "/countByMtrTiempoEntrega", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> countByMtrTiempoEntrega(@RequestBody @Valid MtrTiempoEntrega mtrTiempoEntrega, BindingResult bindingResult)
            throws URISyntaxException {
        BindingErrorsResponse errors = new BindingErrorsResponse();
        HttpHeaders headers = new HttpHeaders();
        if (bindingResult.hasErrors()) {
            errors.addAllErrors(bindingResult);
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(errors.toJSON());
            }
            headers.add("errors", errors.toJSON());
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
        log.debug("Ingresando countByMtrTiempoEntrega");
        try {
            return Optional.ofNullable(this.csOrdenServicioDeltaService.countByMtrTiempoEntrega(mtrTiempoEntrega))
                    .map(l -> new ResponseEntity<>(l, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Genera Grafico de registros para el atributo mtrTiempoEntrega.
    */
    @ApiOperation(value = "Genera Grafico de registros para el atributo mtrTiempoEntrega", produces = "application/json")
    @GetMapping(value = "/graphByMtrTiempoEntrega", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GraphBean> graphByMtrTiempoEntrega() throws URISyntaxException {
        log.debug("Ingresando graphByMtrTiempoEntrega");
        try {
            return Optional.ofNullable(this.csOrdenServicioDeltaService.graphByMtrTiempoEntrega()).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            HttpHeaders headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Contador de registros para el atributo mtrCalidadServicio.
    */
    @ApiOperation(value = "Contador de registros para el atributo mtrCalidadServicio", produces = "application/json")
    @PostMapping(value = "/countByMtrCalidadServicio", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> countByMtrCalidadServicio(@RequestBody @Valid MtrCalidadServicio mtrCalidadServicio, BindingResult bindingResult)
            throws URISyntaxException {
        BindingErrorsResponse errors = new BindingErrorsResponse();
        HttpHeaders headers = new HttpHeaders();
        if (bindingResult.hasErrors()) {
            errors.addAllErrors(bindingResult);
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(errors.toJSON());
            }
            headers.add("errors", errors.toJSON());
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
        log.debug("Ingresando countByMtrCalidadServicio");
        try {
            return Optional.ofNullable(this.csOrdenServicioDeltaService.countByMtrCalidadServicio(mtrCalidadServicio))
                    .map(l -> new ResponseEntity<>(l, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Genera Grafico de registros para el atributo mtrCalidadServicio.
    */
    @ApiOperation(value = "Genera Grafico de registros para el atributo mtrCalidadServicio", produces = "application/json")
    @GetMapping(value = "/graphByMtrCalidadServicio", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GraphBean> graphByMtrCalidadServicio() throws URISyntaxException {
        log.debug("Ingresando graphByMtrCalidadServicio");
        try {
            return Optional.ofNullable(this.csOrdenServicioDeltaService.graphByMtrCalidadServicio()).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            HttpHeaders headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Contador de registros para el atributo mtrEstado.
    */
    @ApiOperation(value = "Contador de registros para el atributo mtrEstado", produces = "application/json")
    @PostMapping(value = "/countByMtrEstado", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> countByMtrEstado(@RequestBody @Valid MtrEstado mtrEstado, BindingResult bindingResult) throws URISyntaxException {
        BindingErrorsResponse errors = new BindingErrorsResponse();
        HttpHeaders headers = new HttpHeaders();
        if (bindingResult.hasErrors()) {
            errors.addAllErrors(bindingResult);
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(errors.toJSON());
            }
            headers.add("errors", errors.toJSON());
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
        log.debug("Ingresando countByMtrEstado");
        try {
            return Optional.ofNullable(this.csOrdenServicioDeltaService.countByMtrEstado(mtrEstado)).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Genera Grafico de registros para el atributo mtrEstado.
    */
    @ApiOperation(value = "Genera Grafico de registros para el atributo mtrEstado", produces = "application/json")
    @GetMapping(value = "/graphByMtrEstado", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GraphBean> graphByMtrEstado() throws URISyntaxException {
        log.debug("Ingresando graphByMtrEstado");
        try {
            return Optional.ofNullable(this.csOrdenServicioDeltaService.graphByMtrEstado()).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            HttpHeaders headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Contador de registros para el atributo mtrLugarTrabajo.
    */
    @ApiOperation(value = "Contador de registros para el atributo mtrLugarTrabajo", produces = "application/json")
    @PostMapping(value = "/countByMtrLugarTrabajo", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> countByMtrLugarTrabajo(@RequestBody @Valid MtrLugarTrabajo mtrLugarTrabajo, BindingResult bindingResult)
            throws URISyntaxException {
        BindingErrorsResponse errors = new BindingErrorsResponse();
        HttpHeaders headers = new HttpHeaders();
        if (bindingResult.hasErrors()) {
            errors.addAllErrors(bindingResult);
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(errors.toJSON());
            }
            headers.add("errors", errors.toJSON());
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
        log.debug("Ingresando countByMtrLugarTrabajo");
        try {
            return Optional.ofNullable(this.csOrdenServicioDeltaService.countByMtrLugarTrabajo(mtrLugarTrabajo))
                    .map(l -> new ResponseEntity<>(l, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Genera Grafico de registros para el atributo mtrLugarTrabajo.
    */
    @ApiOperation(value = "Genera Grafico de registros para el atributo mtrLugarTrabajo", produces = "application/json")
    @GetMapping(value = "/graphByMtrLugarTrabajo", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GraphBean> graphByMtrLugarTrabajo() throws URISyntaxException {
        log.debug("Ingresando graphByMtrLugarTrabajo");
        try {
            return Optional.ofNullable(this.csOrdenServicioDeltaService.graphByMtrLugarTrabajo()).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            HttpHeaders headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Contador de registros para el atributo odm.
    */
    @ApiOperation(value = "Contador de registros para el atributo odm", produces = "application/json")
    @PostMapping(value = "/countByOdm", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> countByOdm(@RequestBody @Valid Odm odm, BindingResult bindingResult) throws URISyntaxException {
        BindingErrorsResponse errors = new BindingErrorsResponse();
        HttpHeaders headers = new HttpHeaders();
        if (bindingResult.hasErrors()) {
            errors.addAllErrors(bindingResult);
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(errors.toJSON());
            }
            headers.add("errors", errors.toJSON());
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
        log.debug("Ingresando countByOdm");
        try {
            return Optional.ofNullable(this.csOrdenServicioDeltaService.countByOdm(odm)).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Genera Grafico de registros para el atributo odm.
    */
    @ApiOperation(value = "Genera Grafico de registros para el atributo odm", produces = "application/json")
    @GetMapping(value = "/graphByOdm", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GraphBean> graphByOdm() throws URISyntaxException {
        log.debug("Ingresando graphByOdm");
        try {
            return Optional.ofNullable(this.csOrdenServicioDeltaService.graphByOdm()).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            HttpHeaders headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Contador de registros para el atributo mtrPuerto.
    */
    @ApiOperation(value = "Contador de registros para el atributo mtrPuerto", produces = "application/json")
    @PostMapping(value = "/countByMtrPuerto", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> countByMtrPuerto(@RequestBody @Valid MtrPuerto mtrPuerto, BindingResult bindingResult) throws URISyntaxException {
        BindingErrorsResponse errors = new BindingErrorsResponse();
        HttpHeaders headers = new HttpHeaders();
        if (bindingResult.hasErrors()) {
            errors.addAllErrors(bindingResult);
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(errors.toJSON());
            }
            headers.add("errors", errors.toJSON());
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
        log.debug("Ingresando countByMtrPuerto");
        try {
            return Optional.ofNullable(this.csOrdenServicioDeltaService.countByMtrPuerto(mtrPuerto)).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Genera Grafico de registros para el atributo mtrPuerto.
    */
    @ApiOperation(value = "Genera Grafico de registros para el atributo mtrPuerto", produces = "application/json")
    @GetMapping(value = "/graphByMtrPuerto", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GraphBean> graphByMtrPuerto() throws URISyntaxException {
        log.debug("Ingresando graphByMtrPuerto");
        try {
            return Optional.ofNullable(this.csOrdenServicioDeltaService.graphByMtrPuerto()).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            HttpHeaders headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Contador de registros para el atributo mtrSeguridad.
    */
    @ApiOperation(value = "Contador de registros para el atributo mtrSeguridad", produces = "application/json")
    @PostMapping(value = "/countByMtrSeguridad", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> countByMtrSeguridad(@RequestBody @Valid MtrSeguridad mtrSeguridad, BindingResult bindingResult) throws URISyntaxException {
        BindingErrorsResponse errors = new BindingErrorsResponse();
        HttpHeaders headers = new HttpHeaders();
        if (bindingResult.hasErrors()) {
            errors.addAllErrors(bindingResult);
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(errors.toJSON());
            }
            headers.add("errors", errors.toJSON());
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
        log.debug("Ingresando countByMtrSeguridad");
        try {
            return Optional.ofNullable(this.csOrdenServicioDeltaService.countByMtrSeguridad(mtrSeguridad)).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
    * Genera Grafico de registros para el atributo mtrSeguridad.
    */
    @ApiOperation(value = "Genera Grafico de registros para el atributo mtrSeguridad", produces = "application/json")
    @GetMapping(value = "/graphByMtrSeguridad", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GraphBean> graphByMtrSeguridad() throws URISyntaxException {
        log.debug("Ingresando graphByMtrSeguridad");
        try {
            return Optional.ofNullable(this.csOrdenServicioDeltaService.graphByMtrSeguridad()).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            HttpHeaders headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

}
