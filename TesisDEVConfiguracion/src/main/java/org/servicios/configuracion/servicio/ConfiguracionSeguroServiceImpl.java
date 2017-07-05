package org.servicios.configuracion.servicio;

import java.util.List;

import org.servicios.configuracion.dao.IConfiguracionSeguroDAO;
import org.servicios.configuracion.entidades.ConfiguracionSeguroParte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfiguracionSeguroServiceImpl implements IConfiguracionSeguroService{

	@Autowired
	IConfiguracionSeguroDAO imSeguro;
	
	@Override
	public String addSeguro(ConfiguracionSeguroParte conf) throws Exception {
		// TODO Auto-generated method stub
		return imSeguro.addSeguro(conf);
	}

	@Override
	public List<ConfiguracionSeguroParte> getConfSeguroList() throws Exception {
		// TODO Auto-generated method stub
		return imSeguro.getConfSeguroList();
	}

	@Override
	public ConfiguracionSeguroParte getConfSeguroById(long id) throws Exception {
		// TODO Auto-generated method stub
		return imSeguro.getConfSeguroById(id);
	}

	@Override
	public ConfiguracionSeguroParte getElimConfSeguroById(long id) throws Exception {
		// TODO Auto-generated method stub
		return imSeguro.getElimConfSeguroById(id);
	}

}
