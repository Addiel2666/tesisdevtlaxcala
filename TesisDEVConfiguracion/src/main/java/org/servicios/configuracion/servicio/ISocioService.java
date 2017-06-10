package org.servicios.configuracion.servicio;

import java.util.List;

import org.servicios.configuracion.entidades.AltaSocio;

public interface ISocioService {

	public boolean addAltaSocio(AltaSocio socio) throws Exception;
	public List<AltaSocio> getSocioList() throws Exception;
	public AltaSocio getSocioById(long id) throws Exception;
	public AltaSocio getEliminaSocio(long id) throws Exception;
	
}
