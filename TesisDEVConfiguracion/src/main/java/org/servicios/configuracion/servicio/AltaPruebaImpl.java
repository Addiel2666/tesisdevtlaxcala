package org.servicios.configuracion.servicio;

import org.servicios.configuracion.dao.IngresaP;
import org.servicios.configuracion.entidades.Prueba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AltaPruebaImpl implements IngresaPS{

	@Autowired
	IngresaP ing;
	
	@Override
	public boolean pruba(Prueba prueba) {
		// TODO Auto-generated method stub
		return ing.pruba(prueba);
	}

}
