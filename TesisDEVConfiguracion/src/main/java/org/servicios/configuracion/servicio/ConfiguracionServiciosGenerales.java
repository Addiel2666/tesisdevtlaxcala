package org.servicios.configuracion.servicio;

import java.util.List;

import org.servicios.configuracion.entidades.CatalogoProceso;

public interface ConfiguracionServiciosGenerales {

	List<CatalogoProceso> findAll();
	
}
