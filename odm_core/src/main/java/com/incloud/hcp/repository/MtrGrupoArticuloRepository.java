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

import com.incloud.hcp.domain.MtrGrupoArticulo;
import com.incloud.hcp.domain.MtrGrupoArticulo_;
import com.incloud.hcp.repository._framework.JPACustomRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@NoRepositoryBean
public interface MtrGrupoArticuloRepository extends JPACustomRepository<MtrGrupoArticulo, Integer> {

    /**
     * Return the persistent instance of {@link MtrGrupoArticulo} with the given unique property value codigoSap,
     * or null if there is no such persistent instance.
     *
     * @param codigoSap the unique value
     * @return the corresponding {@link MtrGrupoArticulo} persistent instance or null
     */
    @RestResource(path = "/getByCodigoSap")
    MtrGrupoArticulo getByCodigoSap(@Param("codigoSap") String codigoSap);

    /**
     * Return the persistent instance of {@link MtrGrupoArticulo} with the given unique property value descripcion,
     * or null if there is no such persistent instance.
     *
     * @param descripcion the unique value
     * @return the corresponding {@link MtrGrupoArticulo} persistent instance or null
     */
    @RestResource(path = "/getByDescripcion")
    MtrGrupoArticulo getByDescripcion(@Param("descripcion") String descripcion);

    default List<MtrGrupoArticulo> findCompletePaginated(String query, int maxResults) {
        MtrGrupoArticulo probe = new MtrGrupoArticulo();
        //probe.setDescripcion(query);
        probe.setDescripcion(null);
        ExampleMatcher matcher = ExampleMatcher.matching() //
                .withMatcher(MtrGrupoArticulo_.descripcion.getName(), match -> match.ignoreCase().startsWith());

        Page<MtrGrupoArticulo> page = this.findAll(Example.of(probe, matcher), PageRequest.of(0, maxResults));
        return page.getContent();
    }

}
