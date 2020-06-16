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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.base.MoreObjects;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.logging.Logger;

import static javax.persistence.GenerationType.SEQUENCE;
import static javax.persistence.TemporalType.TIMESTAMP;

@Entity
@Table(name = "CS_ORDEN_SERVICIO")
//@Audited
//@AuditTable("_audi_CS_ORDEN_SERVICIO")
public class CsOrdenServicio extends BaseDomain implements Identifiable<Long>, Serializable {
    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(CsOrdenServicio.class.getName());

    /***************************/
    /* Atributos de la Entidad */
    /***************************/

    // Raw attributes
    private Long id;
    private String numeroOrdenServicio;
    private Date fechaEmision;
    private String motivo;
    private String txtAprobacion;
    private String horometro;
    private Date fechaInicioDuracionReal;
    private String horaInicioDuracionReal;
    private Date fechaFinDuracionReal;
    private String horaFinDuracionReal;
    private String codigoSistema;
    private String descripcionSistema;
    private String codigoEmbarcacion;
    private String descripcionEmbarcacion;
    private String claseOdm;
    private String rucProveedor;
    private String razonSocialProveedor;
    private String lifnrProveedor;
    private String observacion;
    private String codigoEquipo;
    private String descripcionEquipo;

    // Many to one
    private MtrModalidadTrabajo mtrModalidadTrabajo;
    private MtrTiempoEntrega mtrTiempoEntrega;
    private MtrCalidadServicio mtrCalidadServicio;
    private MtrEstado mtrEstado;
    private MtrLugarTrabajo mtrLugarTrabajo;
    private Odm odm;
    private MtrPuerto mtrPuerto;
    private MtrSeguridad mtrSeguridad;

    @Override
    public String entityClassName() {
        return CsOrdenServicio.class.getSimpleName();
    }

    // -- [id] ------------------------

    @Override
    @Column(name = "CS_ORDEN_SERVICIO_ID", precision = 19)
    @GeneratedValue(strategy = SEQUENCE, generator = "seq_CS_ORDEN_SERVICIO")
    @Id
    @SequenceGenerator(name = "seq_CS_ORDEN_SERVICIO", sequenceName = "seq_CS_ORDEN_SERVICIO", allocationSize = 1)
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public CsOrdenServicio id(Long id) {
        setId(id);
        return this;
    }

    @Override
    @Transient
    public boolean isIdSet() {
        return id != null;
    }
    // -- [numeroOrdenServicio] ------------------------

    @NotEmpty(message = "{message.csOrdenServicio.numeroOrdenServicio.requerido}")
    @Size(max = 50, message = "{message.csOrdenServicio.numeroOrdenServicio.sizeMax} {max} {message.caracter}")
    @Column(name = "NUMERO_ORDEN_SERVICIO", nullable = false, length = 50)
    public String getNumeroOrdenServicio() {
        return numeroOrdenServicio;
    }

    public void setNumeroOrdenServicio(String numeroOrdenServicio) {
        this.numeroOrdenServicio = numeroOrdenServicio;
    }

    public CsOrdenServicio numeroOrdenServicio(String numeroOrdenServicio) {
        setNumeroOrdenServicio(numeroOrdenServicio);
        return this;
    }
    // -- [fechaEmision] ------------------------

    @Column(name = "FECHA_EMISION", length = 29)

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public CsOrdenServicio fechaEmision(Date fechaEmision) {
        setFechaEmision(fechaEmision);
        return this;
    }
    // -- [motivo] ------------------------

    @Size(max = 100, message = "{message.csOrdenServicio.motivo.sizeMax} {max} {message.caracter}")
    @Column(name = "MOTIVO", length = 100)
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public CsOrdenServicio motivo(String motivo) {
        setMotivo(motivo);
        return this;
    }
    // -- [txtAprobacion] ------------------------

    @Size(max = 255, message = "{message.csOrdenServicio.txtAprobacion.sizeMax} {max} {message.caracter}")
    @Column(name = "TXT_APROBACION")
    public String getTxtAprobacion() {
        return txtAprobacion;
    }

    public void setTxtAprobacion(String txtAprobacion) {
        this.txtAprobacion = txtAprobacion;
    }

    public CsOrdenServicio txtAprobacion(String txtAprobacion) {
        setTxtAprobacion(txtAprobacion);
        return this;
    }
    // -- [horometro] ------------------------

    @Size(max = 20, message = "{message.csOrdenServicio.horometro.sizeMax} {max} {message.caracter}")
    @Column(name = "HOROMETRO", length = 20)
    public String getHorometro() {
        return horometro;
    }

    public void setHorometro(String horometro) {
        this.horometro = horometro;
    }

    public CsOrdenServicio horometro(String horometro) {
        setHorometro(horometro);
        return this;
    }
    // -- [fechaInicioDuracionReal] ------------------------

    @Column(name = "FECHA_INICIO_DURACION_REAL", length = 29)

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFechaInicioDuracionReal() {
        return fechaInicioDuracionReal;
    }

    public void setFechaInicioDuracionReal(Date fechaInicioDuracionReal) {
        this.fechaInicioDuracionReal = fechaInicioDuracionReal;
    }

    public CsOrdenServicio fechaInicioDuracionReal(Date fechaInicioDuracionReal) {
        setFechaInicioDuracionReal(fechaInicioDuracionReal);
        return this;
    }
    // -- [horaInicioDuracionReal] ------------------------

    @Size(max = 20, message = "{message.csOrdenServicio.horaInicioDuracionReal.sizeMax} {max} {message.caracter}")
    @Column(name = "HORA_INICIO_DURACION_REAL", length = 20)
    public String getHoraInicioDuracionReal() {
        return horaInicioDuracionReal;
    }

    public void setHoraInicioDuracionReal(String horaInicioDuracionReal) {
        this.horaInicioDuracionReal = horaInicioDuracionReal;
    }

    public CsOrdenServicio horaInicioDuracionReal(String horaInicioDuracionReal) {
        setHoraInicioDuracionReal(horaInicioDuracionReal);
        return this;
    }
    // -- [fechaFinDuracionReal] ------------------------

    @Column(name = "FECHA_FIN_DURACION_REAL", length = 29)

    @Temporal(TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date getFechaFinDuracionReal() {
        return fechaFinDuracionReal;
    }

    public void setFechaFinDuracionReal(Date fechaFinDuracionReal) {
        this.fechaFinDuracionReal = fechaFinDuracionReal;
    }

    public CsOrdenServicio fechaFinDuracionReal(Date fechaFinDuracionReal) {
        setFechaFinDuracionReal(fechaFinDuracionReal);
        return this;
    }
    // -- [horaFinDuracionReal] ------------------------

    @Size(max = 20, message = "{message.csOrdenServicio.horaFinDuracionReal.sizeMax} {max} {message.caracter}")
    @Column(name = "HORA_FIN_DURACION_REAL", length = 20)
    public String getHoraFinDuracionReal() {
        return horaFinDuracionReal;
    }

    public void setHoraFinDuracionReal(String horaFinDuracionReal) {
        this.horaFinDuracionReal = horaFinDuracionReal;
    }

    public CsOrdenServicio horaFinDuracionReal(String horaFinDuracionReal) {
        setHoraFinDuracionReal(horaFinDuracionReal);
        return this;
    }
    // -- [codigoSistema] ------------------------

    @Size(max = 50, message = "{message.csOrdenServicio.codigoSistema.sizeMax} {max} {message.caracter}")
    @Column(name = "CODIGO_SISTEMA", length = 50)
    public String getCodigoSistema() {
        return codigoSistema;
    }

    public void setCodigoSistema(String codigoSistema) {
        this.codigoSistema = codigoSistema;
    }

    public CsOrdenServicio codigoSistema(String codigoSistema) {
        setCodigoSistema(codigoSistema);
        return this;
    }
    // -- [descripcionSistema] ------------------------

    @Size(max = 255, message = "{message.csOrdenServicio.descripcionSistema.sizeMax} {max} {message.caracter}")
    @Column(name = "DESCRIPCION_SISTEMA")
    public String getDescripcionSistema() {
        return descripcionSistema;
    }

    public void setDescripcionSistema(String descripcionSistema) {
        this.descripcionSistema = descripcionSistema;
    }

    public CsOrdenServicio descripcionSistema(String descripcionSistema) {
        setDescripcionSistema(descripcionSistema);
        return this;
    }
    // -- [codigoEmbarcacion] ------------------------

    @Size(max = 50, message = "{message.csOrdenServicio.codigoEmbarcacion.sizeMax} {max} {message.caracter}")
    @Column(name = "CODIGO_EMBARCACION", length = 50)
    public String getCodigoEmbarcacion() {
        return codigoEmbarcacion;
    }

    public void setCodigoEmbarcacion(String codigoEmbarcacion) {
        this.codigoEmbarcacion = codigoEmbarcacion;
    }

    public CsOrdenServicio codigoEmbarcacion(String codigoEmbarcacion) {
        setCodigoEmbarcacion(codigoEmbarcacion);
        return this;
    }
    // -- [descripcionEmbarcacion] ------------------------

    @Size(max = 255, message = "{message.csOrdenServicio.descripcionEmbarcacion.sizeMax} {max} {message.caracter}")
    @Column(name = "DESCRIPCION_EMBARCACION")
    public String getDescripcionEmbarcacion() {
        return descripcionEmbarcacion;
    }

    public void setDescripcionEmbarcacion(String descripcionEmbarcacion) {
        this.descripcionEmbarcacion = descripcionEmbarcacion;
    }

    public CsOrdenServicio descripcionEmbarcacion(String descripcionEmbarcacion) {
        setDescripcionEmbarcacion(descripcionEmbarcacion);
        return this;
    }
    // -- [claseOdm] ------------------------

    @Size(max = 200, message = "{message.csOrdenServicio.claseOdm.sizeMax} {max} {message.caracter}")
    @Column(name = "CLASE_ODM", length = 200)
    public String getClaseOdm() {
        return claseOdm;
    }

    public void setClaseOdm(String claseOdm) {
        this.claseOdm = claseOdm;
    }

    public CsOrdenServicio claseOdm(String claseOdm) {
        setClaseOdm(claseOdm);
        return this;
    }
    // -- [rucProveedor] ------------------------

    @Size(max = 20, message = "{message.csOrdenServicio.rucProveedor.sizeMax} {max} {message.caracter}")
    @Column(name = "RUC_PROVEEDOR", length = 20)
    public String getRucProveedor() {
        return rucProveedor;
    }

    public void setRucProveedor(String rucProveedor) {
        this.rucProveedor = rucProveedor;
    }

    public CsOrdenServicio rucProveedor(String rucProveedor) {
        setRucProveedor(rucProveedor);
        return this;
    }
    // -- [razonSocialProveedor] ------------------------

    @Size(max = 200, message = "{message.csOrdenServicio.razonSocialProveedor.sizeMax} {max} {message.caracter}")
    @Column(name = "RAZON_SOCIAL_PROVEEDOR", length = 200)
    public String getRazonSocialProveedor() {
        return razonSocialProveedor;
    }

    public void setRazonSocialProveedor(String razonSocialProveedor) {
        this.razonSocialProveedor = razonSocialProveedor;
    }

    public CsOrdenServicio razonSocialProveedor(String razonSocialProveedor) {
        setRazonSocialProveedor(razonSocialProveedor);
        return this;
    }
    // -- [lifnrProveedor] ------------------------

    @Size(max = 20, message = "{message.csOrdenServicio.lifnrProveedor.sizeMax} {max} {message.caracter}")
    @Column(name = "LIFNR_PROVEEDOR", length = 20)
    public String getLifnrProveedor() {
        return lifnrProveedor;
    }

    public void setLifnrProveedor(String lifnrProveedor) {
        this.lifnrProveedor = lifnrProveedor;
    }

    public CsOrdenServicio lifnrProveedor(String lifnrProveedor) {
        setLifnrProveedor(lifnrProveedor);
        return this;
    }
    // -- [observacion] ------------------------

    @Size(max = 255, message = "{message.csOrdenServicio.observacion.sizeMax} {max} {message.caracter}")
    @Column(name = "OBSERVACION")
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public CsOrdenServicio observacion(String observacion) {
        setObservacion(observacion);
        return this;
    }
    // -- [codigoEquipo] ------------------------

    @Size(max = 50, message = "{message.csOrdenServicio.codigoEquipo.sizeMax} {max} {message.caracter}")
    @Column(name = "CODIGO_EQUIPO", length = 50)
    public String getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(String codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public CsOrdenServicio codigoEquipo(String codigoEquipo) {
        setCodigoEquipo(codigoEquipo);
        return this;
    }
    // -- [descripcionEquipo] ------------------------

    @Size(max = 255, message = "{message.csOrdenServicio.descripcionEquipo.sizeMax} {max} {message.caracter}")
    @Column(name = "DESCRIPCION_EQUIPO")
    public String getDescripcionEquipo() {
        return descripcionEquipo;
    }

    public void setDescripcionEquipo(String descripcionEquipo) {
        this.descripcionEquipo = descripcionEquipo;
    }

    public CsOrdenServicio descripcionEquipo(String descripcionEquipo) {
        setDescripcionEquipo(descripcionEquipo);
        return this;
    }

    // -----------------------------------------------------------------
    // Many to One support
    // -----------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CsOrdenServicio.mtrModalidadTrabajo ==> MtrModalidadTrabajo.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "MTR_MODALIDAD_TRABAJO_ID", nullable = false)
    @ManyToOne
    public MtrModalidadTrabajo getMtrModalidadTrabajo() {
        return mtrModalidadTrabajo;
    }

    /**
     * Set the {@link #mtrModalidadTrabajo} without adding this CsOrdenServicio instance on the passed {@link #mtrModalidadTrabajo}
     */
    public void setMtrModalidadTrabajo(MtrModalidadTrabajo mtrModalidadTrabajo) {
        this.mtrModalidadTrabajo = mtrModalidadTrabajo;
    }

    public CsOrdenServicio mtrModalidadTrabajo(MtrModalidadTrabajo mtrModalidadTrabajo) {
        setMtrModalidadTrabajo(mtrModalidadTrabajo);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CsOrdenServicio.mtrTiempoEntrega ==> MtrTiempoEntrega.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "MTR_TIEMPO_ENTREGA_ID", nullable = false)
    @ManyToOne
    public MtrTiempoEntrega getMtrTiempoEntrega() {
        return mtrTiempoEntrega;
    }

    /**
     * Set the {@link #mtrTiempoEntrega} without adding this CsOrdenServicio instance on the passed {@link #mtrTiempoEntrega}
     */
    public void setMtrTiempoEntrega(MtrTiempoEntrega mtrTiempoEntrega) {
        this.mtrTiempoEntrega = mtrTiempoEntrega;
    }

    public CsOrdenServicio mtrTiempoEntrega(MtrTiempoEntrega mtrTiempoEntrega) {
        setMtrTiempoEntrega(mtrTiempoEntrega);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CsOrdenServicio.mtrCalidadServicio ==> MtrCalidadServicio.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "MTR_CALIDAD_SERVICIO_ID", nullable = false)
    @ManyToOne
    public MtrCalidadServicio getMtrCalidadServicio() {
        return mtrCalidadServicio;
    }

    /**
     * Set the {@link #mtrCalidadServicio} without adding this CsOrdenServicio instance on the passed {@link #mtrCalidadServicio}
     */
    public void setMtrCalidadServicio(MtrCalidadServicio mtrCalidadServicio) {
        this.mtrCalidadServicio = mtrCalidadServicio;
    }

    public CsOrdenServicio mtrCalidadServicio(MtrCalidadServicio mtrCalidadServicio) {
        setMtrCalidadServicio(mtrCalidadServicio);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CsOrdenServicio.mtrEstado ==> MtrEstado.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "MTR_ESTADO_ID", nullable = false)
    @ManyToOne
    public MtrEstado getMtrEstado() {
        return mtrEstado;
    }

    /**
     * Set the {@link #mtrEstado} without adding this CsOrdenServicio instance on the passed {@link #mtrEstado}
     */
    public void setMtrEstado(MtrEstado mtrEstado) {
        this.mtrEstado = mtrEstado;
    }

    public CsOrdenServicio mtrEstado(MtrEstado mtrEstado) {
        setMtrEstado(mtrEstado);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CsOrdenServicio.mtrLugarTrabajo ==> MtrLugarTrabajo.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "MTR_LUGAR_TRABAJO_ID", nullable = false)
    @ManyToOne
    public MtrLugarTrabajo getMtrLugarTrabajo() {
        return mtrLugarTrabajo;
    }

    /**
     * Set the {@link #mtrLugarTrabajo} without adding this CsOrdenServicio instance on the passed {@link #mtrLugarTrabajo}
     */
    public void setMtrLugarTrabajo(MtrLugarTrabajo mtrLugarTrabajo) {
        this.mtrLugarTrabajo = mtrLugarTrabajo;
    }

    public CsOrdenServicio mtrLugarTrabajo(MtrLugarTrabajo mtrLugarTrabajo) {
        setMtrLugarTrabajo(mtrLugarTrabajo);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CsOrdenServicio.odm ==> Odm.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @JoinColumn(name = "ODM_ID")
    @ManyToOne
    public Odm getOdm() {
        return odm;
    }

    /**
     * Set the {@link #odm} without adding this CsOrdenServicio instance on the passed {@link #odm}
     */
    public void setOdm(Odm odm) {
        this.odm = odm;
    }

    public CsOrdenServicio odm(Odm odm) {
        setOdm(odm);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CsOrdenServicio.mtrPuerto ==> MtrPuerto.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "MTR_PUERTO_ID", nullable = false)
    @ManyToOne
    public MtrPuerto getMtrPuerto() {
        return mtrPuerto;
    }

    /**
     * Set the {@link #mtrPuerto} without adding this CsOrdenServicio instance on the passed {@link #mtrPuerto}
     */
    public void setMtrPuerto(MtrPuerto mtrPuerto) {
        this.mtrPuerto = mtrPuerto;
    }

    public CsOrdenServicio mtrPuerto(MtrPuerto mtrPuerto) {
        setMtrPuerto(mtrPuerto);
        return this;
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // many-to-one: CsOrdenServicio.mtrSeguridad ==> MtrSeguridad.id
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @NotNull
    @JoinColumn(name = "MTR_SEGURIDAD_ID", nullable = false)
    @ManyToOne
    public MtrSeguridad getMtrSeguridad() {
        return mtrSeguridad;
    }

    /**
     * Set the {@link #mtrSeguridad} without adding this CsOrdenServicio instance on the passed {@link #mtrSeguridad}
     */
    public void setMtrSeguridad(MtrSeguridad mtrSeguridad) {
        this.mtrSeguridad = mtrSeguridad;
    }

    public CsOrdenServicio mtrSeguridad(MtrSeguridad mtrSeguridad) {
        setMtrSeguridad(mtrSeguridad);
        return this;
    }

    /**
     * Apply the default values.
     */
    public CsOrdenServicio withDefaults() {
        return this;
    }

    /**
     * Equals implementation using a business key.
     */
    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof CsOrdenServicio && hashCode() == other.hashCode());
    }

    private IdentifiableHashBuilder identifiableHashBuilder = new IdentifiableHashBuilder();

    @Override
    public int hashCode() {
        return identifiableHashBuilder.hash(log, this);
    }

    /**
     * Construct a readable string representation for this CsOrdenServicio instance.
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this) //
                .add("id", getId()) //
                .add("numeroOrdenServicio", getNumeroOrdenServicio()) //
                .add("fechaEmision", getFechaEmision()) //
                .add("motivo", getMotivo()) //
                .add("txtAprobacion", getTxtAprobacion()) //
                .add("horometro", getHorometro()) //
                .add("fechaInicioDuracionReal", getFechaInicioDuracionReal()) //
                .add("horaInicioDuracionReal", getHoraInicioDuracionReal()) //
                .add("fechaFinDuracionReal", getFechaFinDuracionReal()) //
                .add("horaFinDuracionReal", getHoraFinDuracionReal()) //
                .add("codigoSistema", getCodigoSistema()) //
                .add("descripcionSistema", getDescripcionSistema()) //
                .add("codigoEmbarcacion", getCodigoEmbarcacion()) //
                .add("descripcionEmbarcacion", getDescripcionEmbarcacion()) //
                .add("claseOdm", getClaseOdm()) //
                .add("rucProveedor", getRucProveedor()) //
                .add("razonSocialProveedor", getRazonSocialProveedor()) //
                .add("lifnrProveedor", getLifnrProveedor()) //
                .add("observacion", getObservacion()) //
                .add("codigoEquipo", getCodigoEquipo()) //
                .add("descripcionEquipo", getDescripcionEquipo()) //
                .add("mtrEstado", getMtrEstado()) //    
                .add("odm", getOdm()) //    
                .add("mtrPuerto", getMtrPuerto()) //    
                .add("mtrModalidadTrabajo", getMtrModalidadTrabajo()) //    
                .add("mtrLugarTrabajo", getMtrLugarTrabajo()) //    
                .add("mtrCalidadServicio", getMtrCalidadServicio()) //    
                .add("mtrTiempoEntrega", getMtrTiempoEntrega()) //    
                .add("mtrSeguridad", getMtrSeguridad()) //    
                .toString();
    }
}
