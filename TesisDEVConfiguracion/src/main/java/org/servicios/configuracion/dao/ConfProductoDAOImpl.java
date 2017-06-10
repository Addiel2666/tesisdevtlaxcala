package org.servicios.configuracion.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.servicios.configuracion.entidades.AltaSocio;
import org.servicios.configuracion.entidades.ConfiguracionProducto;
import org.springframework.beans.factory.annotation.Autowired;

public class ConfProductoDAOImpl implements IConfProductoDAO{

	@Autowired
	SessionFactory sessionFactory;
	Session session = null;
	Transaction tx = null;
	
	@Override
	public boolean addProducto(ConfiguracionProducto prod) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(prod);
		tx.commit();
		session.close();
		return false;
	}

	@Override
	public List<ConfiguracionProducto> getProdList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<ConfiguracionProducto> lista = session.createCriteria(ConfiguracionProducto.class).list();
		tx.commit();
		session.close();
		return lista;
	}

	@Override
	public ConfiguracionProducto getProdById(long id) throws Exception {
		session = sessionFactory.openSession();
		ConfiguracionProducto alta = (ConfiguracionProducto)session.load(ConfiguracionProducto.class, new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return alta;
	}

	@Override
	public ConfiguracionProducto getEliminaProd(long id) throws Exception {
		session = sessionFactory.openSession();
		ConfiguracionProducto alta = (ConfiguracionProducto)session.load(ConfiguracionProducto.class, new Long(id));
		alta.setActivo(new Short("0"));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return alta;
	}

}
