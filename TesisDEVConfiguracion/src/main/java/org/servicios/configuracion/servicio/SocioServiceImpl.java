package org.servicios.configuracion.servicio;

import java.util.List;

import org.servicios.configuracion.dao.IAltaSocioDAO;
import org.servicios.configuracion.entidades.AltaSocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocioServiceImpl implements ISocioService{

	@Autowired
	IAltaSocioDAO aSocio;
	
	@Override
	public boolean addAltaSocio(AltaSocio socio) throws Exception {
		// TODO Auto-generated method stub
		return aSocio.addAltaSocio(socio);
	}

	@Override
	public List<AltaSocio> getSocioList() throws Exception {
		// TODO Auto-generated method stub
		return aSocio.getSocioList();
	}

	@Override
	public AltaSocio getSocioById(String id) throws Exception {
		// TODO Auto-generated method stub
		return aSocio.getSocioById(id);
	}

	@Override
	public AltaSocio getEliminaSocio(String id) throws Exception {
		// TODO Auto-generated method stub
		return aSocio.getEliminaSocio(id);
	}

}
