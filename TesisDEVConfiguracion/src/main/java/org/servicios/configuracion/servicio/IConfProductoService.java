package org.servicios.configuracion.servicio;

import java.util.List;

import org.servicios.configuracion.entidades.ConfiguracionProducto;

public interface IConfProductoService {
	public boolean addProducto(ConfiguracionProducto prod) throws Exception;
	public List<ConfiguracionProducto> getProdList() throws Exception;
	public ConfiguracionProducto getProdById(long id) throws Exception;
	public ConfiguracionProducto getEliminaProd(long id) throws Exception;
	
}
