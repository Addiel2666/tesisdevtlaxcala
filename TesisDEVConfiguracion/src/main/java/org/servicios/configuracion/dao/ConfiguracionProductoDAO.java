package org.servicios.configuracion.dao;

import java.util.List;

import org.servicios.configuracion.entidades.ConfiguracionProducto;

public interface ConfiguracionProductoDAO {

	public boolean addProducto(ConfiguracionProducto configuracionProducto) throws Exception;;
	public ConfiguracionProducto getByConfProd(String id) throws Exception;
	public List<ConfiguracionProducto> listConfProd() throws Exception;;
	
}
