package org.servicios.configuracion.servicio;

import java.util.List;

import org.servicios.configuracion.entidades.ConfiguracionParte1;
import org.servicios.configuracion.entidades.ConfiguracionSeguroParte;

public interface IConfiguracionSeguroServicio {

	public List<ConfiguracionParte1> getListaSeguroConf();
	public boolean ingresaNuevaCarga(ConfiguracionParte1 parte1);
	public ConfiguracionParte1 eliminaLista(String id);
}
