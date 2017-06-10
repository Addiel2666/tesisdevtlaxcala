package org.servicios.configuracion.servicio;

import java.util.List;

import org.servicios.configuracion.entidades.ConfiguracionSeguroParte;

public interface IConfiguracionSeguroService {

	public String addSeguro(ConfiguracionSeguroParte conf) throws Exception;
	public List<ConfiguracionSeguroParte> getConfSeguroList() throws Exception;
	public ConfiguracionSeguroParte getConfSeguroById(long id) throws Exception;
	public ConfiguracionSeguroParte getElimConfSeguroById(long id) throws Exception;
	
}
