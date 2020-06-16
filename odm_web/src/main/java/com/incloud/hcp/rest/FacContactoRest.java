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
import com.incloud.hcp.domain.FacContacto;
import com.incloud.hcp.domain.MtrSector;
import com.incloud.hcp.domain.response.FacContactoResponse;
import com.incloud.hcp.repository.delta.FacContactoDeltaRepository;
import com.incloud.hcp.rest._framework.JPACustomRest;
import com.incloud.hcp.service.delta.FacContactoDeltaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.net.URISyntaxException;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public abstract class FacContactoRest extends JPACustomRest<FacContactoResponse, FacContacto, Integer> {

    @Autowired
    protected FacContactoDeltaService facContactoDeltaService;

    @Autowired
    protected FacContactoDeltaRepository facContactoDeltaRepository;

    protected String setObtenerNombreArchivoExcel() {
        return "FacContacto";
    }

    /************************/
    /* Instancia de Bean    */
    /************************/
    protected final FacContacto createInstance() {
        FacContacto facContacto = new FacContacto();
        return facContacto;
    }

    /**
     * Find by por usuario
     */
    @ApiOperation(value = "Busca registro de tipo <T> en base a usuario", produces = "application/json")
    @GetMapping(value = "/_getByUsuario/{usuario}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<FacContacto> getByUsuario(@PathVariable String usuario) throws URISyntaxException {
        log.debug(this.NOMBRE_CLASE + " - Ingresando getByUsuario: " + usuario);
        try {
            return Optional.ofNullable(this.facContactoDeltaRepository.getByUsuario(usuario)).map(bean -> new ResponseEntity<>(bean, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            HttpHeaders headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Find by por email
     */
    @ApiOperation(value = "Busca registro de tipo <T> en base a email", produces = "application/json")
    @GetMapping(value = "/_getByEmail/{email}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<FacContacto> getByEmail(@PathVariable String email) throws URISyntaxException {
        log.debug(this.NOMBRE_CLASE + " - Ingresando getByEmail: " + email);
        try {
            return Optional.ofNullable(this.facContactoDeltaRepository.getByEmail(email)).map(bean -> new ResponseEntity<>(bean, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        } catch (Exception e) {
            if (this.devuelveRuntimeException) {
                throw new RuntimeException(e);
            }
            HttpHeaders headers = this.devuelveErrorHeaders(e);
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }

    /*****************/
    /* Otros Metodos */
    /*****************/

    /**
    * Contador de registros para el atributo mtrSector.
    */
    @ApiOperation(value = "Contador de registros para el atributo mtrSector", produces = "application/json")
    @PostMapping(value = "/countByMtrSector", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> countByMtrSector(@RequestBody @Valid MtrSector mtrSector, BindingResult bindingResult) throws URISyntaxException {
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
        log.debug("Ingresando countByMtrSector");
        try {
            return Optional.ofNullable(this.facContactoDeltaService.countByMtrSector(mtrSector)).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
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
    * Genera Grafico de registros para el atributo mtrSector.
    */
    @ApiOperation(value = "Genera Grafico de registros para el atributo mtrSector", produces = "application/json")
    @GetMapping(value = "/graphByMtrSector", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<GraphBean> graphByMtrSector() throws URISyntaxException {
        log.debug("Ingresando graphByMtrSector");
        try {
            return Optional.ofNullable(this.facContactoDeltaService.graphByMtrSector()).map(l -> new ResponseEntity<>(l, HttpStatus.OK))
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