package org.servicios.configuracion.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
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
		char[] arr = new char[] {'A','C','D','E','F','G','H','I','J','1','2','3'};
		char elegido = arr[(int) (Math.random()*5)];
		socio.setId(String.valueOf(elegido));
		socio.setTipo(new Long(1));
		socio.setFechaCreacion(new Date());
		session.save(socio);
		tx.commit();
		session.close();
		return false;
	}

	@Override
	public List<AltaSocio> getSocioList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<AltaSocio> lista = session.createCriteria(AltaSocio.class).
				add(Restrictions.eq("tipo",new Long(1))).list();
		tx.commit();
		session.close();
		return lista;
	}

	public AltaSocio getSocioById(String id) throws Exception {
		session = sessionFactory.openSession();
		AltaSocio alta = (AltaSocio)session.load(AltaSocio.class, id);
		alta.setClaveSocio("AAA");
		session.save(alta);
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return alta;
	}

	
	public AltaSocio getEliminaSocio(String id) throws Exception {
		session = sessionFactory.openSession();
		AltaSocio alta = (AltaSocio)session.load(AltaSocio.class, id);
		alta.setTipo(new Long(0));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return alta;
	}

}
