package org.servicios.configuracion.servicio;

import java.util.List;

import org.servicios.configuracion.dao.IConfProductoDAO;
import org.servicios.configuracion.entidades.ConfiguracionProducto;
import org.springframework.beans.factory.annotation.Autowired;

public class ConfProductoServiceImpl implements IConfProductoService{

	@Autowired
	IConfProductoDAO cProducto;
	
	@Override
	public boolean addProducto(ConfiguracionProducto prod) throws Exception {
		// TODO Auto-generated method stub
		return cProducto.addProducto(prod);
	}

	@Override
	public List<ConfiguracionProducto> getProdList() throws Exception {
		// TODO Auto-generated method stub
		return cProducto.getProdList();
	}

	@Override
	public ConfiguracionProducto getProdById(long id) throws Exception {
		// TODO Auto-generated method stub
		return cProducto.getProdById(id);
	}

	@Override
	public ConfiguracionProducto getEliminaProd(long id) throws Exception {
		// TODO Auto-generated method stub
		return cProducto.getEliminaProd(id);
	}

}
