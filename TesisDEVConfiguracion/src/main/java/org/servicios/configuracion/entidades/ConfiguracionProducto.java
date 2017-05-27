package org.servicios.configuracion.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "C##TESIS.CONFIGURACION_PRODUCTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfiguracionProducto.findAll", query = "SELECT c FROM ConfiguracionProducto c")
    , @NamedQuery(name = "ConfiguracionProducto.findById", query = "SELECT c FROM ConfiguracionProducto c WHERE c.id = :id")
    , @NamedQuery(name = "ConfiguracionProducto.findByNombreProducto", query = "SELECT c FROM ConfiguracionProducto c WHERE c.nombreProducto = :nombreProducto")
    , @NamedQuery(name = "ConfiguracionProducto.findByNombreSocio", query = "SELECT c FROM ConfiguracionProducto c WHERE c.nombreSocio = :nombreSocio")
    , @NamedQuery(name = "ConfiguracionProducto.findByDescripcioInstitucion", query = "SELECT c FROM ConfiguracionProducto c WHERE c.descripcioInstitucion = :descripcioInstitucion")
    , @NamedQuery(name = "ConfiguracionProducto.findBySbrProducto", query = "SELECT c FROM ConfiguracionProducto c WHERE c.sbrProducto = :sbrProducto")
    , @NamedQuery(name = "ConfiguracionProducto.findByFechaCreacion", query = "SELECT c FROM ConfiguracionProducto c WHERE c.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "ConfiguracionProducto.findByFechaVigenciaInicio", query = "SELECT c FROM ConfiguracionProducto c WHERE c.fechaVigenciaInicio = :fechaVigenciaInicio")
    , @NamedQuery(name = "ConfiguracionProducto.findByFechaVidenciaFin", query = "SELECT c FROM ConfiguracionProducto c WHERE c.fechaVidenciaFin = :fechaVidenciaFin")})
public class ConfiguracionProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ID")
    private String id;
    @Size(max = 100)
    @Column(name = "NOMBRE_PRODUCTO")
    private String nombreProducto;
    @Size(max = 100)
    @Column(name = "NOMBRE_SOCIO")
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="NOMBRE_SOCIO")
    private AltaSocio nombreSocio;
    @Size(max = 100)
    @Column(name = "DESCRIPCIO_INSTITUCION")
    private String descripcioInstitucion;
    @Size(max = 20)
    @Column(name = "SBR_PRODUCTO")
    private String sbrProducto;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "FECHA_VIGENCIA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVigenciaInicio;
    @Size(max = 20)
    @Column(name = "FECHA_VIDENCIA_FIN")
    private String fechaVidenciaFin;

    public ConfiguracionProducto() {
    }

    public ConfiguracionProducto(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public AltaSocio getNombreSocio() {
        return nombreSocio;
    }

    public void setNombreSocio(AltaSocio nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public String getDescripcioInstitucion() {
        return descripcioInstitucion;
    }

    public void setDescripcioInstitucion(String descripcioInstitucion) {
        this.descripcioInstitucion = descripcioInstitucion;
    }

    public String getSbrProducto() {
        return sbrProducto;
    }

    public void setSbrProducto(String sbrProducto) {
        this.sbrProducto = sbrProducto;
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

    public String getFechaVidenciaFin() {
        return fechaVidenciaFin;
    }

    public void setFechaVidenciaFin(String fechaVidenciaFin) {
        this.fechaVidenciaFin = fechaVidenciaFin;
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
        if (!(object instanceof ConfiguracionProducto)) {
            return false;
        }
        ConfiguracionProducto other = (ConfiguracionProducto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject2.ConfiguracionProducto[ id=" + id + " ]";
    }
    
}
