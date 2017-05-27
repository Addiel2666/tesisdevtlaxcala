package org.servicios.configuracion.servicio;

import java.util.List;

import org.servicios.configuracion.entidades.ConfiguracionProducto;

public interface ConfiguracionProductoService {

	public boolean addProducto(ConfiguracionProducto configuracionProducto) throws Exception;;
	public ConfiguracionProducto getByConfProd(String id) throws Exception;
	public List<ConfiguracionProducto> listConfProd() throws Exception;;
	
}
