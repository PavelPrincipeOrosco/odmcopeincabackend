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
@Table(name = "MTR_MODALIDAD_TRABAJO")
//@Audited
//@AuditTable("_audi_MTR_MODALIDAD_TRABAJO")
public class MtrModalidadTrabajo extends BaseDomain implements Identifiable<Long>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(MtrModalidadTrabajo.class.getName());

    /***************************/
    /* Atributos de la Entidad */
    /***************************/

    // Raw attributes
    private Long id;
    private String descripcion;
    private String status;

    @Override
    public String entityClassName() {
        return MtrModalidadTrabajo.class.getSimpleName();
    }

    // -- [id] ------------------------

    @Override
    @Column(name = "MTR_MODALIDAD_TRABAJO_ID", precision = 19)
    @GeneratedValue(strategy = SEQUENCE, generator = "seq_MTR_MODALIDAD_TRABAJO")
    @Id
    @SequenceGenerator(name = "seq_MTR_MODALIDAD_TRABAJO", sequenceName = "seq_MTR_MODALIDAD_TRABAJO", allocationSize = 1)
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public MtrModalidadTrabajo id(Long id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    public boolean isIdSet() {
        return id != null;
    }
    // -- [descripcion] ------------------------

    @NotEmpty(message = "{message.mtrModalidadTrabajo.descripcion.requerido}")
    @Size(max = 100, message = "{message.mtrModalidadTrabajo.descripcion.sizeMax} {max} {message.caracter}")
    @Column(name = "DESCRIPCION", nullable = false, length = 100)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public MtrModalidadTrabajo descripcion(String descripcion) {
        setDescripcion(descripcion);
        return this;
    }
    // -- [status] ------------------------

    @Size(max = 2, message = "{message.mtrModalidadTrabajo.status.sizeMax} {max} {message.caracter}")
    @Column(name = "STATUS", length = 2)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MtrModalidadTrabajo status(String status) {
        setStatus(status);
        return this;
    }

    /**
     * Apply the default values.
     */
    public MtrModalidadTrabajo withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof MtrModalidadTrabajo && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this MtrModalidadTrabajo instance.
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
