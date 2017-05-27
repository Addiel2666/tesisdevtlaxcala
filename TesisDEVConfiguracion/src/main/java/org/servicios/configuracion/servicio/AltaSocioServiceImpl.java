package org.servicios.configuracion.servicio;

import java.util.List;

import org.servicios.configuracion.dao.AltaSocioDAO;
import org.servicios.configuracion.entidades.AltaSocio;
import org.springframework.beans.factory.annotation.Autowired;

public class AltaSocioServiceImpl implements AltaSocioService{
	
	@Autowired
	AltaSocioDAO alta;

	@Override
	public boolean addSocio(AltaSocio altaSocio) throws Exception {
		// TODO Auto-generated method stub
		return alta.addSocio(altaSocio);
	}

	@Override
	public AltaSocio getByIdSocio(String id) throws Exception {
		// TODO Auto-generated method stub
		return getByIdSocio(id);
	}

	@Override
	public List<AltaSocio> listSocio() throws Exception {
		// TODO Auto-generated method stub
		return alta.listSocio();
	}

}
