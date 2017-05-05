package org.servicios.configuracion.entidades;

import java.io.Serializable;

public class CatalogoProceso implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String tipoProceso;
	private String tipoDesc;
	public String getTipoDesc() {
		return tipoDesc;
	}
	public CatalogoProceso setTipoDesc(String tipoDesc) {
		this.tipoDesc = tipoDesc;
		return this;
	}
	public String getId() {
		return id;
	}
	public CatalogoProceso setId(String id) {
		this.id = id;
		return this;
	}
	public String getTipoProceso() {
		return tipoProceso;
	}
	public CatalogoProceso setTipoProceso(String tipoProceso) {
		this.tipoProceso = tipoProceso;
		return this;
	}
	@Override
    public String toString() {
        return "CatalogoProceso{" +
                "id=" + id +
                ", tipoProceso='" + tipoProceso + '\'' +
                ", tipoDesc=" + tipoDesc +
                '}';
    }
	
}
