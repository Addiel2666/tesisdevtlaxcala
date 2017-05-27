package org.servicios.configuracion.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.servicios.configuracion.entidades.ConfiguracionProducto;
import org.servicios.configuracion.genericos.MetodosGenericos;
import org.springframework.beans.factory.annotation.Autowired;

public class ConfiguracionProductoDAOImpl implements ConfiguracionProductoDAO{

	@Autowired
	SessionFactory sessionFactory;
	Session session = null;
	Transaction tx = null;
	MetodosGenericos metodos;
	
	@Override
	public boolean addProducto(ConfiguracionProducto configuracionProducto) throws Exception {
		configuracionProducto.setFechaCreacion(new Date());
		String nuevoId = metodos.nuevoId(configuracionProducto.getNombreProducto(),configuracionProducto.getFechaCreacion());
		configuracionProducto.setId(nuevoId);
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(configuracionProducto);
		tx.commit();
		session.close();
		
		return false;
	}

	@Override
	public ConfiguracionProducto getByConfProd(String id) throws Exception {
		session = sessionFactory.openSession();
		ConfiguracionProducto producto = (ConfiguracionProducto)session.load(ConfiguracionProductoDAOImpl.class, new String(id));
		 tx = session.getTransaction();  
		  session.beginTransaction();  
		  tx.commit();  
		return producto;
	}

	@Override
	public List<ConfiguracionProducto> listConfProd() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<ConfiguracionProducto> lista = session.createCriteria(ConfiguracionProductoDAOImpl.class).list();
		 tx.commit();  
		  session.close();  
		return lista;
	}

}
