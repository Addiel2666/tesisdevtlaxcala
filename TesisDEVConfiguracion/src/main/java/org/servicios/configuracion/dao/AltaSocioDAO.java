package org.servicios.configuracion.dao;

import java.util.List;

import org.servicios.configuracion.entidades.AltaSocio;

public interface AltaSocioDAO {

	public boolean addSocio(AltaSocio altaSocio) throws Exception;
	public AltaSocio getByIdSocio(String id) throws Exception;
	public List<AltaSocio> listSocio() throws Exception;
	
}
