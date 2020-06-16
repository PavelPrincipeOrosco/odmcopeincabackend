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
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.logging.Logger;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "CS_MATERIAL")
//@Audited
//@AuditTable("_audi_CS_MATERIAL")
public class CsMaterial extends BaseDomain implements Identifiable<Long>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(CsMaterial.class.getName());

    /***************************/
    /* Atributos de la Entidad */
    /***************************/

    // Raw attributes
    private Long id;
    private String codigoMaterial;
    private String descripcionMaterial;
    private BigDecimal cantidad;

    // Many to one
    private MtrUnidadMedida mtrUnidadMedida;
    private CsOrdenServicio csOrdenServicio;

    @Override
    public String entityClassName() {
        return CsMaterial.class.getSimpleName();
    }

    // -- [id] ------------------------

    @Override
    @Column(name = "CS_MATERIAL_ID", precision = 19)
    @GeneratedValue(strategy = SEQUENCE, generator = "seq_CS_MATERIAL")
    @Id
    @SequenceGenerator(name = "seq_CS_MATERIAL", sequenceName = "seq_CS_MATERIAL", allocationSize = 1)
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public CsMaterial id(Long id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    public boolean isIdSet() {
        return id != null;
    }
    // -- [codigoMaterial] ------------------------

    @NotEmpty(message = "{message.csMaterial.codigoMaterial.requerido}")
    @Size(max = 100, message = "{message.csMaterial.codigoMaterial.sizeMax} {max} {message.caracter}")
    @Column(name = "CODIGO_MATERIAL", nullable = false, length = 100)
    public String getCodigoMaterial() {
        return codigoMaterial;
    }

    public void setCodigoMaterial(String codigoMaterial) {
        this.codigoMaterial = codigoMaterial;
    }

    public CsMaterial codigoMaterial(String codigoMaterial) {
        setCodigoMaterial(codigoMaterial);
        return this;
    }
    // -- [descripcionMaterial] ------------------------

    @NotEmpty(message = "{message.csMaterial.descripcionMaterial.requerido}")
    @Size(max = 255, message = "{message.csMaterial.descripcionMaterial.sizeMax} {max} {message.caracter}")
    @Column(name = "DESCRIPCION_MATERIAL", nullable = false)
    public String getDescripcionMaterial() {
        return descripcionMaterial;
    }

    public void setDescripcionMaterial(String descripcionMaterial) {
        this.descripcionMaterial = descripcionMaterial;
    }

    public CsMaterial descripcionMaterial(String descripcionMaterial) {
        setDescripcionMaterial(descripcionMaterial);
        return this;
    }
    // -- [cantidad] ------------------------

    @Digits(integer = 17, fraction = 2)
    @Column(name = "CANTIDAD", precision = 19, scale = 2)
    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public CsMaterial cantidad(BigDecimal cantidad) {
        setCantidad(cantidad);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CsMaterial.mtrUnidadMedida ==> MtrUnidadMedida.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "MTR_UNIDAD_MEDIDA_ID", nullable = false)
    @ManyToOne
    public MtrUnidadMedida getMtrUnidadMedida() {
        return mtrUnidadMedida;
    }

    /**
     * Set the {@link #mtrUnidadMedida} without adding this CsMaterial instance on the passed {@link #mtrUnidadMedida}
     */
    public void setMtrUnidadMedida(MtrUnidadMedida mtrUnidadMedida) {
        this.mtrUnidadMedida = mtrUnidadMedida;
    }

    public CsMaterial mtrUnidadMedida(MtrUnidadMedida mtrUnidadMedida) {
        setMtrUnidadMedida(mtrUnidadMedida);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CsMaterial.csOrdenServicio ==> CsOrdenServicio.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "CS_ORDEN_SERVICIO_ID", nullable = false)
    @ManyToOne
    public CsOrdenServicio getCsOrdenServicio() {
        return csOrdenServicio;
    }

    /**
     * Set the {@link #csOrdenServicio} without adding this CsMaterial instance on the passed {@link #csOrdenServicio}
     */
    public void setCsOrdenServicio(CsOrdenServicio csOrdenServicio) {
        this.csOrdenServicio = csOrdenServicio;
    }

    public CsMaterial csOrdenServicio(CsOrdenServicio csOrdenServicio) {
        setCsOrdenServicio(csOrdenServicio);
        return this;
    }

    /**
     * Apply the default values.
     */
    public CsMaterial withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof CsMaterial && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this CsMaterial instance.
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this) //
                .add("id", getId()) //
                .add("codigoMaterial", getCodigoMaterial()) //
                .add("descripcionMaterial", getDescripcionMaterial()) //
                .add("cantidad", getCantidad()) //
                .add("mtrUnidadMedida", getMtrUnidadMedida()) //    
                .add("csOrdenServicio", getCsOrdenServicio()) //    
                .toString();
    }
}