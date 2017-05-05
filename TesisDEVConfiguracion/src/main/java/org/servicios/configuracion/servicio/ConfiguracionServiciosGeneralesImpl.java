package org.servicios.configuracion.servicio;

import java.util.Arrays;
import java.util.List;

import org.servicios.configuracion.entidades.CatalogoProceso;
import org.springframework.stereotype.Service;


@Service
public class ConfiguracionServiciosGeneralesImpl implements ConfiguracionServiciosGenerales{

	public static final String id1 = "1";
	public static final String tipo1 = "APT";
	public static final String Descripcion1 = "Texto";
	
	public static final String id2 = "2";
	public static final String tipo2 = "APC";
	public static final String Descripcion2 = "Texto";
	
	public List<CatalogoProceso> findAll() {
		return Arrays.asList(
				new CatalogoProceso()
						.setId(id1)
						.setTipoProceso(tipo1)
						.setTipoDesc(Descripcion1),
						new CatalogoProceso()
						.setId(id2)
						.setTipoProceso(tipo2)
						.setTipoDesc(Descripcion2));
									
				
	}

}
