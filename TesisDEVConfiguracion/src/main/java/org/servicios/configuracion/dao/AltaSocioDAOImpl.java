package org.servicios.configuracion.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.servicios.configuracion.entidades.AltaSocio;
import org.servicios.configuracion.entidades.ConfiguracionProducto;
import org.servicios.configuracion.genericos.MetodosGenericos;
import org.springframework.beans.factory.annotation.Autowired;

public class AltaSocioDAOImpl implements AltaSocioDAO{

	@Autowired
	SessionFactory sessionFactory;
	Session session = null;
	Transaction tx = null;
	MetodosGenericos metodos;
	
	@Override
	public boolean addSocio(AltaSocio altaSocio) throws Exception {
		altaSocio.setFechaCreacion(new Date());
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(altaSocio);
		tx.commit();
		session.close();

		return false;
	}

	@Override
	public AltaSocio getByIdSocio(String id) throws Exception {
		session = sessionFactory.openSession();
		AltaSocio producto = (AltaSocio)session.load(AltaSocioDAOImpl.class, new String(id));
		 tx = session.getTransaction();  
		  session.beginTransaction();  
		  tx.commit();  
		return producto;
	}

	@Override
	public List<AltaSocio> listSocio() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<AltaSocio> lista = session.createCriteria(AltaSocioDAOImpl.class).list();
		 tx.commit();  
		  session.close();  
		return lista;
	}

}
