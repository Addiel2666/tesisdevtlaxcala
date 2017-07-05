package org.servicios.configuracion.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.servicios.configuracion.entidades.Prueba;
import org.springframework.beans.factory.annotation.Autowired;

public class AltaPruebaImpl implements IngresaP{

	@Autowired
	SessionFactory sessionFactory;
	Session session = null;
	Transaction tx = null;
	
	@Override
	public boolean pruba(Prueba prueba) {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(prueba);
		tx.commit();
		session.close();
		return false;
	}

}
