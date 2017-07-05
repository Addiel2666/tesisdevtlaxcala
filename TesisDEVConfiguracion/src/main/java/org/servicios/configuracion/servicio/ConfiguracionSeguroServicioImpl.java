package org.servicios.configuracion.servicio;

import java.util.List;

import org.servicios.configuracion.dao.IConfiguracionSeguroPDAO;
import org.servicios.configuracion.entidades.ConfiguracionParte1;
import org.servicios.configuracion.entidades.ConfiguracionSeguroParte;
import org.springframework.beans.factory.annotation.Autowired;

public class ConfiguracionSeguroServicioImpl implements IConfiguracionSeguroServicio{

	@Autowired
	IConfiguracionSeguroPDAO configSeguro;
	
	@Override
	public List<ConfiguracionParte1> getListaSeguroConf() {
		// TODO Auto-generated method stub
		return configSeguro.getListaSeguroConf();
	}

	@Override
	public boolean ingresaNuevaCarga(ConfiguracionParte1 parte1) {
		// TODO Auto-generated method stub
		return configSeguro.ingresaNuevaCarga(parte1);
	}

	@Override
	public ConfiguracionParte1 eliminaLista(String id) {
		// TODO Auto-generated method stub
		return configSeguro.eliminaLista(id);
	}

}
