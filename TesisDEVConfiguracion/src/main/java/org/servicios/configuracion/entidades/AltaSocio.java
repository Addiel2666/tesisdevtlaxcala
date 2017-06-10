package org.servicios.configuracion.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author zony_
 */
@Entity
@Table(name = "C##TESIS.ALTA_SOCIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AltaSocio.findAll", query = "SELECT a FROM AltaSocio a")
    , @NamedQuery(name = "AltaSocio.findById", query = "SELECT a FROM AltaSocio a WHERE a.id = :id")
    , @NamedQuery(name = "AltaSocio.findByNombreSocio", query = "SELECT a FROM AltaSocio a WHERE a.nombreSocio = :nombreSocio")
    , @NamedQuery(name = "AltaSocio.findByDescripcionSocio", query = "SELECT a FROM AltaSocio a WHERE a.descripcionSocio = :descripcionSocio")
    , @NamedQuery(name = "AltaSocio.findByFechaCreacion", query = "SELECT a FROM AltaSocio a WHERE a.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "AltaSocio.findByFechaVigenciaInicio", query = "SELECT a FROM AltaSocio a WHERE a.fechaVigenciaInicio = :fechaVigenciaInicio")
    , @NamedQuery(name = "AltaSocio.findByFechaVigenciaFinal", query = "SELECT a FROM AltaSocio a WHERE a.fechaVigenciaFinal = :fechaVigenciaFinal")
    , @NamedQuery(name = "AltaSocio.findByClaveSocio", query = "SELECT a FROM AltaSocio a WHERE a.claveSocio = :claveSocio")
    , @NamedQuery(name = "AltaSocio.findByTipo", query = "SELECT a FROM AltaSocio a WHERE a.tipo = :tipo")})
public class AltaSocio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ID")
    private String id;
    @Size(max = 100)
    @Column(name = "NOMBRE_SOCIO")
    private String nombreSocio;
    @Size(max = 150)
    @Column(name = "DESCRIPCION_SOCIO")
    private String descripcionSocio;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "FECHA_VIGENCIA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVigenciaInicio;
    @Column(name = "FECHA_VIGENCIA_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVigenciaFinal;
    @Size(max = 20)
    @Column(name = "CLAVE_SOCIO")
    private String claveSocio;
    @Column(name = "TIPO")
    private Long tipo;

    public AltaSocio() {
    }

    public AltaSocio(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreSocio() {
        return nombreSocio;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public String getDescripcionSocio() {
        return descripcionSocio;
    }

    public void setDescripcionSocio(String descripcionSocio) {
        this.descripcionSocio = descripcionSocio;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaVigenciaInicio() {
        return fechaVigenciaInicio;
    }

    public void setFechaVigenciaInicio(Date fechaVigenciaInicio) {
        this.fechaVigenciaInicio = fechaVigenciaInicio;
    }

    public Date getFechaVigenciaFinal() {
        return fechaVigenciaFinal;
    }

    public void setFechaVigenciaFinal(Date fechaVigenciaFinal) {
        this.fechaVigenciaFinal = fechaVigenciaFinal;
    }

    public String getClaveSocio() {
        return claveSocio;
    }

    public void setClaveSocio(String claveSocio) {
        this.claveSocio = claveSocio;
    }

    public Long getTipo() {
        return tipo;
    }

    public void setTipo(Long tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AltaSocio)) {
            return false;
        }
        AltaSocio other = (AltaSocio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject2.AltaSocio[ id=" + id + " ]";
    }    
}
