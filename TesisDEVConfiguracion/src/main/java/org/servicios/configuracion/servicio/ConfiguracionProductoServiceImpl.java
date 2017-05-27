package org.servicios.configuracion.servicio;

import java.util.List;

import org.servicios.configuracion.dao.ConfiguracionProductoDAO;
import org.servicios.configuracion.entidades.ConfiguracionProducto;
import org.springframework.beans.factory.annotation.Autowired;

public class ConfiguracionProductoServiceImpl implements ConfiguracionProductoService{

	@Autowired
	ConfiguracionProductoDAO confi;
	
	@Override
	public boolean addProducto(ConfiguracionProducto configuracionProducto) throws Exception {
		// TODO Auto-generated method stub
		return confi.addProducto(configuracionProducto);
	}

	@Override
	public ConfiguracionProducto getByConfProd(String id) throws Exception {
		// TODO Auto-generated method stub
		return confi.getByConfProd(id);
	}

	@Override
	public List<ConfiguracionProducto> listConfProd() throws Exception {
		// TODO Auto-generated method stub
		return confi.listConfProd();
	}

}
