package org.servicios.configuracion.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.servicios.configuracion.entidades.AltaSocio;
import org.springframework.beans.factory.annotation.Autowired;

public class AltaSocioDAOImpl implements IAltaSocioDAO{

	@Autowired
	SessionFactory sessionFactory;
	Session session = null;
	Transaction tx = null;
	
	@Override
	public boolean addAltaSocio(AltaSocio socio) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(socio);
		tx.commit();
		session.close();
		return false;
	}

	@Override
	public List<AltaSocio> getSocioList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<AltaSocio> lista = session.createCriteria(AltaSocio.class).list();
		tx.commit();
		session.close();
		return lista;
	}

	@Override
	public AltaSocio getSocioById(long id) throws Exception {
		session = sessionFactory.openSession();
		AltaSocio alta = (AltaSocio)session.load(AltaSocio.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return alta;
	}

	@Override
	public AltaSocio getEliminaSocio(long id) throws Exception {
		session = sessionFactory.openSession();
		AltaSocio alta = (AltaSocio)session.load(AltaSocio.class, id);
		alta.setTipo(new Long(0));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return alta;
	}

}
