/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/repository/EntitydeltaRepository.java.e.vm
 */
package com.incloud.hcp.repository.delta;

import com.incloud.hcp.domain.CerCertificado;
import com.incloud.hcp.domain.CerNotaPedido;
import com.incloud.hcp.domain.MtrEstado;
import com.incloud.hcp.repository.CerCertificadoRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CerCertificadoDeltaRepository extends CerCertificadoRepository {

    List<CerCertificado> findByMtrEstado(MtrEstado mtrEstado);

    @Query("select c from CerCertificado c where c.cerNotaPedido.id = ?1")
    List<CerCertificado> findByIdNotaPedidoId(Integer cerNotaPedidoId);

    @Query("select c from CerCertificado c where c.cerNotaPedido.id = ?1 and c.mtrEstado.id <> ?2")
    List<CerCertificado> findByIdNotaPedidoIdAndNotEstado(Integer cerNotaPedidoId, Integer estadoId);

    @Query("select c from CerCertificado c where c.cerNotaPedido.id = ?1 and c.mtrEstado.id = ?2")
    List<CerCertificado> findByNotaPedidoEstado(Integer cerNotaPedidoId, Integer estadoId);

    List<CerCertificado> findByCerNotaPedido(CerNotaPedido cerNotaPedido);

}