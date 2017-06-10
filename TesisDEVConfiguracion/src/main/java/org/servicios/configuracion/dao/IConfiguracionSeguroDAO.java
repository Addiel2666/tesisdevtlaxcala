package org.servicios.configuracion.dao;

import java.util.List;

import org.servicios.configuracion.entidades.ConfiguracionSeguroParte;

public interface IConfiguracionSeguroDAO {

	public String addSeguro(ConfiguracionSeguroParte conf) throws Exception;
	public List<ConfiguracionSeguroParte> getConfSeguroList() throws Exception;
	public ConfiguracionSeguroParte getConfSeguroById(long id) throws Exception;
	public ConfiguracionSeguroParte getElimConfSeguroById(long id) throws Exception;
}
