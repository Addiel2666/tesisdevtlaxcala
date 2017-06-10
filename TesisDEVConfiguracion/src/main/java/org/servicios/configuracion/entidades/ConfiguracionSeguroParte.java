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
@Table(name = "CONFIGURACION_SEGURO_PARTE1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfiguracionSeguroParte1.findAll", query = "SELECT c FROM ConfiguracionSeguroParte1 c")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findById", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.id = :id")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux01", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux01 = :aux01")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux02", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux02 = :aux02")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux03", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux03 = :aux03")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux04", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux04 = :aux04")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux05", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux05 = :aux05")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux06", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux06 = :aux06")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux07", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux07 = :aux07")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux08", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux08 = :aux08")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux09", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux09 = :aux09")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux10", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux10 = :aux10")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux11", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux11 = :aux11")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux12", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux12 = :aux12")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux13", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux13 = :aux13")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux14", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux14 = :aux14")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux15", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux15 = :aux15")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux16", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux16 = :aux16")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux17", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux17 = :aux17")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux18", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux18 = :aux18")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux19", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux19 = :aux19")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux20", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux20 = :aux20")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux21", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux21 = :aux21")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux22", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux22 = :aux22")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux23", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux23 = :aux23")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux24", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux24 = :aux24")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux25", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux25 = :aux25")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux26", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux26 = :aux26")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux27", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux27 = :aux27")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux28", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux28 = :aux28")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux29", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux29 = :aux29")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux30", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux30 = :aux30")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux31", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux31 = :aux31")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux32", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux32 = :aux32")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux33", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux33 = :aux33")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux34", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux34 = :aux34")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux35", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux35 = :aux35")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux36", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux36 = :aux36")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux37", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux37 = :aux37")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux38", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux38 = :aux38")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux39", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux39 = :aux39")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux40", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux40 = :aux40")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux41", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux41 = :aux41")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux42", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux42 = :aux42")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux43", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux43 = :aux43")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux44", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux44 = :aux44")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByAux45", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.aux45 = :aux45")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByNombreCarga", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.nombreCarga = :nombreCarga")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByIdProceso", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.idProceso = :idProceso")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findBySeparador", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.separador = :separador")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByNombreNegocio", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.nombreNegocio = :nombreNegocio")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByActivo", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.activo = :activo")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByFechaAlta", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.fechaAlta = :fechaAlta")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByFechaActualizacion", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.fechaActualizacion = :fechaActualizacion")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findByFechaEliminacion", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.fechaEliminacion = :fechaEliminacion")
    , @NamedQuery(name = "ConfiguracionSeguroParte1.findBySerie", query = "SELECT c FROM ConfiguracionSeguroParte1 c WHERE c.serie = :serie")})
public class ConfiguracionSeguroParte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID")
    private String id;
    @Size(max = 250)
    @Column(name = "AUX01")
    private String aux01;
    @Size(max = 250)
    @Column(name = "AUX02")
    private String aux02;
    @Size(max = 250)
    @Column(name = "AUX03")
    private String aux03;
    @Size(max = 250)
    @Column(name = "AUX04")
    private String aux04;
    @Size(max = 250)
    @Column(name = "AUX05")
    private String aux05;
    @Size(max = 250)
    @Column(name = "AUX06")
    private String aux06;
    @Size(max = 250)
    @Column(name = "AUX07")
    private String aux07;
    @Size(max = 250)
    @Column(name = "AUX08")
    private String aux08;
    @Size(max = 250)
    @Column(name = "AUX09")
    private String aux09;
    @Size(max = 250)
    @Column(name = "AUX10")
    private String aux10;
    @Size(max = 250)
    @Column(name = "AUX11")
    private String aux11;
    @Size(max = 250)
    @Column(name = "AUX12")
    private String aux12;
    @Size(max = 250)
    @Column(name = "AUX13")
    private String aux13;
    @Size(max = 250)
    @Column(name = "AUX14")
    private String aux14;
    @Size(max = 250)
    @Column(name = "AUX15")
    private String aux15;
    @Size(max = 250)
    @Column(name = "AUX16")
    private String aux16;
    @Size(max = 250)
    @Column(name = "AUX17")
    private String aux17;
    @Size(max = 250)
    @Column(name = "AUX18")
    private String aux18;
    @Size(max = 250)
    @Column(name = "AUX19")
    private String aux19;
    @Size(max = 250)
    @Column(name = "AUX20")
    private String aux20;
    @Size(max = 250)
    @Column(name = "AUX21")
    private String aux21;
    @Size(max = 250)
    @Column(name = "AUX22")
    private String aux22;
    @Size(max = 250)
    @Column(name = "AUX23")
    private String aux23;
    @Size(max = 250)
    @Column(name = "AUX24")
    private String aux24;
    @Size(max = 250)
    @Column(name = "AUX25")
    private String aux25;
    @Size(max = 250)
    @Column(name = "AUX26")
    private String aux26;
    @Size(max = 250)
    @Column(name = "AUX27")
    private String aux27;
    @Size(max = 250)
    @Column(name = "AUX28")
    private String aux28;
    @Size(max = 250)
    @Column(name = "AUX29")
    private String aux29;
    @Size(max = 250)
    @Column(name = "AUX30")
    private String aux30;
    @Size(max = 250)
    @Column(name = "AUX31")
    private String aux31;
    @Size(max = 250)
    @Column(name = "AUX32")
    private String aux32;
    @Size(max = 250)
    @Column(name = "AUX33")
    private String aux33;
    @Size(max = 250)
    @Column(name = "AUX34")
    private String aux34;
    @Size(max = 250)
    @Column(name = "AUX35")
    private String aux35;
    @Size(max = 250)
    @Column(name = "AUX36")
    private String aux36;
    @Size(max = 250)
    @Column(name = "AUX37")
    private String aux37;
    @Size(max = 250)
    @Column(name = "AUX38")
    private String aux38;
    @Size(max = 250)
    @Column(name = "AUX39")
    private String aux39;
    @Size(max = 250)
    @Column(name = "AUX40")
    private String aux40;
    @Size(max = 250)
    @Column(name = "AUX41")
    private String aux41;
    @Size(max = 250)
    @Column(name = "AUX42")
    private String aux42;
    @Size(max = 250)
    @Column(name = "AUX43")
    private String aux43;
    @Size(max = 250)
    @Column(name = "AUX44")
    private String aux44;
    @Size(max = 250)
    @Column(name = "AUX45")
    private String aux45;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOMBRE_CARGA")
    private String nombreCarga;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PROCESO")
    private short idProceso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "SEPARADOR")
    private String separador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE_NEGOCIO")
    private String nombreNegocio;
    @Column(name = "ACTIVO")
    private Short activo;
    @Column(name = "FECHA_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Column(name = "FECHA_ACTUALIZACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaActualizacion;
    @Column(name = "FECHA_ELIMINACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEliminacion;
    @Size(max = 20)
    @Column(name = "SERIE")
    private String serie;

    public ConfiguracionSeguroParte() {
    }

    public ConfiguracionSeguroParte(String id) {
        this.id = id;
    }

    public ConfiguracionSeguroParte(String id, String nombreCarga, short idProceso, String separador, String nombreNegocio) {
        this.id = id;
        this.nombreCarga = nombreCarga;
        this.idProceso = idProceso;
        this.separador = separador;
        this.nombreNegocio = nombreNegocio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAux01() {
        return aux01;
    }

    public void setAux01(String aux01) {
        this.aux01 = aux01;
    }

    public String getAux02() {
        return aux02;
    }

    public void setAux02(String aux02) {
        this.aux02 = aux02;
    }

    public String getAux03() {
        return aux03;
    }

    public void setAux03(String aux03) {
        this.aux03 = aux03;
    }

    public String getAux04() {
        return aux04;
    }

    public void setAux04(String aux04) {
        this.aux04 = aux04;
    }

    public String getAux05() {
        return aux05;
    }

    public void setAux05(String aux05) {
        this.aux05 = aux05;
    }

    public String getAux06() {
        return aux06;
    }

    public void setAux06(String aux06) {
        this.aux06 = aux06;
    }

    public String getAux07() {
        return aux07;
    }

    public void setAux07(String aux07) {
        this.aux07 = aux07;
    }

    public String getAux08() {
        return aux08;
    }

    public void setAux08(String aux08) {
        this.aux08 = aux08;
    }

    public String getAux09() {
        return aux09;
    }

    public void setAux09(String aux09) {
        this.aux09 = aux09;
    }

    public String getAux10() {
        return aux10;
    }

    public void setAux10(String aux10) {
        this.aux10 = aux10;
    }

    public String getAux11() {
        return aux11;
    }

    public void setAux11(String aux11) {
        this.aux11 = aux11;
    }

    public String getAux12() {
        return aux12;
    }

    public void setAux12(String aux12) {
        this.aux12 = aux12;
    }

    public String getAux13() {
        return aux13;
    }

    public void setAux13(String aux13) {
        this.aux13 = aux13;
    }

    public String getAux14() {
        return aux14;
    }

    public void setAux14(String aux14) {
        this.aux14 = aux14;
    }

    public String getAux15() {
        return aux15;
    }

    public void setAux15(String aux15) {
        this.aux15 = aux15;
    }

    public String getAux16() {
        return aux16;
    }

    public void setAux16(String aux16) {
        this.aux16 = aux16;
    }

    public String getAux17() {
        return aux17;
    }

    public void setAux17(String aux17) {
        this.aux17 = aux17;
    }

    public String getAux18() {
        return aux18;
    }

    public void setAux18(String aux18) {
        this.aux18 = aux18;
    }

    public String getAux19() {
        return aux19;
    }

    public void setAux19(String aux19) {
        this.aux19 = aux19;
    }

    public String getAux20() {
        return aux20;
    }

    public void setAux20(String aux20) {
        this.aux20 = aux20;
    }

    public String getAux21() {
        return aux21;
    }

    public void setAux21(String aux21) {
        this.aux21 = aux21;
    }

    public String getAux22() {
        return aux22;
    }

    public void setAux22(String aux22) {
        this.aux22 = aux22;
    }

    public String getAux23() {
        return aux23;
    }

    public void setAux23(String aux23) {
        this.aux23 = aux23;
    }

    public String getAux24() {
        return aux24;
    }

    public void setAux24(String aux24) {
        this.aux24 = aux24;
    }

    public String getAux25() {
        return aux25;
    }

    public void setAux25(String aux25) {
        this.aux25 = aux25;
    }

    public String getAux26() {
        return aux26;
    }

    public void setAux26(String aux26) {
        this.aux26 = aux26;
    }

    public String getAux27() {
        return aux27;
    }

    public void setAux27(String aux27) {
        this.aux27 = aux27;
    }

    public String getAux28() {
        return aux28;
    }

    public void setAux28(String aux28) {
        this.aux28 = aux28;
    }

    public String getAux29() {
        return aux29;
    }

    public void setAux29(String aux29) {
        this.aux29 = aux29;
    }

    public String getAux30() {
        return aux30;
    }

    public void setAux30(String aux30) {
        this.aux30 = aux30;
    }

    public String getAux31() {
        return aux31;
    }

    public void setAux31(String aux31) {
        this.aux31 = aux31;
    }

    public String getAux32() {
        return aux32;
    }

    public void setAux32(String aux32) {
        this.aux32 = aux32;
    }

    public String getAux33() {
        return aux33;
    }

    public void setAux33(String aux33) {
        this.aux33 = aux33;
    }

    public String getAux34() {
        return aux34;
    }

    public void setAux34(String aux34) {
        this.aux34 = aux34;
    }

    public String getAux35() {
        return aux35;
    }

    public void setAux35(String aux35) {
        this.aux35 = aux35;
    }

    public String getAux36() {
        return aux36;
    }

    public void setAux36(String aux36) {
        this.aux36 = aux36;
    }

    public String getAux37() {
        return aux37;
    }

    public void setAux37(String aux37) {
        this.aux37 = aux37;
    }

    public String getAux38() {
        return aux38;
    }

    public void setAux38(String aux38) {
        this.aux38 = aux38;
    }

    public String getAux39() {
        return aux39;
    }

    public void setAux39(String aux39) {
        this.aux39 = aux39;
    }

    public String getAux40() {
        return aux40;
    }

    public void setAux40(String aux40) {
        this.aux40 = aux40;
    }

    public String getAux41() {
        return aux41;
    }

    public void setAux41(String aux41) {
        this.aux41 = aux41;
    }

    public String getAux42() {
        return aux42;
    }

    public void setAux42(String aux42) {
        this.aux42 = aux42;
    }

    public String getAux43() {
        return aux43;
    }

    public void setAux43(String aux43) {
        this.aux43 = aux43;
    }

    public String getAux44() {
        return aux44;
    }

    public void setAux44(String aux44) {
        this.aux44 = aux44;
    }

    public String getAux45() {
        return aux45;
    }

    public void setAux45(String aux45) {
        this.aux45 = aux45;
    }

    public String getNombreCarga() {
        return nombreCarga;
    }

    public void setNombreCarga(String nombreCarga) {
        this.nombreCarga = nombreCarga;
    }

    public short getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(short idProceso) {
        this.idProceso = idProceso;
    }

    public String getSeparador() {
        return separador;
    }

    public void setSeparador(String separador) {
        this.separador = separador;
    }

    public String getNombreNegocio() {
        return nombreNegocio;
    }

    public void setNombreNegocio(String nombreNegocio) {
        this.nombreNegocio = nombreNegocio;
    }

    public Short getActivo() {
        return activo;
    }

    public void setActivo(Short activo) {
        this.activo = activo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Date getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(Date fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
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
        if (!(object instanceof ConfiguracionSeguroParte)) {
            return false;
        }
        ConfiguracionSeguroParte other = (ConfiguracionSeguroParte) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject2.ConfiguracionSeguroParte1[ id=" + id + " ]";
    }
    
}
