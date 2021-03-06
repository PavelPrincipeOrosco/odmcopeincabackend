/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/repository/EntityRepository.java.e.vm
 */
package com.incloud.hcp.repository;

import com.incloud.hcp.domain.CsMaterial;
import com.incloud.hcp.domain.CsMaterial_;
import com.incloud.hcp.domain.CsOrdenServicio;
import com.incloud.hcp.domain.MtrUnidadMedida;
import com.incloud.hcp.repository._framework.JPACustomRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import java.util.List;

@NoRepositoryBean
public interface CsMaterialRepository extends JPACustomRepository<CsMaterial, Long> {

    default List<CsMaterial> findCompletePaginated(String query, int maxResults) {
        CsMaterial probe = new CsMaterial();
        //probe.setCodigoMaterial(query);
        probe.setCodigoMaterial(null);
        ExampleMatcher matcher = ExampleMatcher.matching() //
                .withMatcher(CsMaterial_.codigoMaterial.getName(), match -> match.ignoreCase().startsWith());

        Page<CsMaterial> page = this.findAll(Example.of(probe, matcher), PageRequest.of(0, maxResults));
        return page.getContent();
    }

    Long countByMtrUnidadMedida(@Param("mtrUnidadMedida") MtrUnidadMedida mtrUnidadMedida);

    Long countByCsOrdenServicio(@Param("csOrdenServicio") CsOrdenServicio csOrdenServicio);

}
