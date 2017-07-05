package org.servicios.configuracion.dao;

import java.util.List;

import org.servicios.configuracion.entidades.AltaSocio;

public interface IAltaSocioDAO {

	public boolean addAltaSocio(AltaSocio socio) throws Exception;
	public List<AltaSocio> getSocioList() throws Exception;
	public AltaSocio getSocioById(String id) throws Exception;
	public AltaSocio getEliminaSocio(String id) throws Exception;
	
}
