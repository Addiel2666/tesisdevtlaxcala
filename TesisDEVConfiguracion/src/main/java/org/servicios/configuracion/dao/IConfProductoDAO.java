package org.servicios.configuracion.dao;

import java.util.List;

import org.servicios.configuracion.entidades.ConfiguracionProducto;

public interface IConfProductoDAO {

	public boolean addProducto(ConfiguracionProducto prod) throws Exception;
	public List<ConfiguracionProducto> getProdList() throws Exception;
	public ConfiguracionProducto getProdById(long id) throws Exception;
	public ConfiguracionProducto getEliminaProd(long id) throws Exception;
	
}
