/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Modificado por CARLOS BAZALAR
 * Email: cbazalarlarosa@gmail.com
 * Template pack-angular:src/main/java/domain/Entity.java.e.vm
 */
package com.incloud.hcp.domain;

import com.google.common.base.MoreObjects;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.logging.Logger;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "MTR_CALIDAD_SERVICIO")
//@Audited
//@AuditTable("_audi_MTR_CALIDAD_SERVICIO")
public class MtrCalidadServicio extends BaseDomain implements Identifiable<Long>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(MtrCalidadServicio.class.getName());

    /***************************/
    /* Atributos de la Entidad */
    /***************************/

    // Raw attributes
    private Long id;
    private String descripcion;
    private String status;

    @Override
    public String entityClassName() {
        return MtrCalidadServicio.class.getSimpleName();
    }

    // -- [id] ------------------------

    @Override
    @Column(name = "MTR_CALIDAD_SERVICIO_ID", precision = 19)
    @GeneratedValue(strategy = SEQUENCE, generator = "seq_MTR_CALIDAD_SERVICIO")
    @Id
    @SequenceGenerator(name = "seq_MTR_CALIDAD_SERVICIO", sequenceName = "seq_MTR_CALIDAD_SERVICIO", allocationSize = 1)
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public MtrCalidadServicio id(Long id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    public boolean isIdSet() {
        return id != null;
    }
    // -- [descripcion] ------------------------

    @NotEmpty(message = "{message.mtrCalidadServicio.descripcion.requerido}")
    @Size(max = 200, message = "{message.mtrCalidadServicio.descripcion.sizeMax} {max} {message.caracter}")
    @Column(name = "DESCRIPCION", nullable = false, length = 200)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public MtrCalidadServicio descripcion(String descripcion) {
        setDescripcion(descripcion);
        return this;
    }
    // -- [status] ------------------------

    @Size(max = 2, message = "{message.mtrCalidadServicio.status.sizeMax} {max} {message.caracter}")
    @Column(name = "STATUS", length = 2)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MtrCalidadServicio status(String status) {
        setStatus(status);
        return this;
    }

    /**
     * Apply the default values.
     */
    public MtrCalidadServicio withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof MtrCalidadServicio && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this MtrCalidadServicio instance.
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this) //
                .add("id", getId()) //
                .add("descripcion", getDescripcion()) //
                .add("status", getStatus()) //
                .toString();
    }
}
