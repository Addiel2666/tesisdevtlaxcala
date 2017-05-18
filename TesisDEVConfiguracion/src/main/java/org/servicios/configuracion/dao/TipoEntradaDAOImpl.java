package org.servicios.configuracion.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.servicios.configuracion.entidades.TipoEntrada;
import org.springframework.beans.factory.annotation.Autowired;

public class TipoEntradaDAOImpl implements TipoEntradaDAO{

	@Autowired
	SessionFactory sessionFactory;
	Session session = null;
	Transaction tx = null;
	
	@Override
	public boolean addConfPr(TipoEntrada entrada) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(entrada);
		tx.commit();
		session.close();
		return false;
	}

	@Override
	public TipoEntrada getTipoEntradaById(long id) throws Exception {
		session = sessionFactory.openSession();
		TipoEntrada entrada = (TipoEntrada)session.load(TipoEntrada.class, new Long(id));
		  tx = session.getTransaction();  
		  session.beginTransaction();  
		  tx.commit();  
		return entrada;
	}

	@Override
	public List<TipoEntrada> getTipoEntradaList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<TipoEntrada> lista = session.createCriteria(TipoEntrada.class).list();
		 tx.commit();  
		  session.close();  
		return lista;
	}

}
