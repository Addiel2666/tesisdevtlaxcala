package org.servicios.configuracion.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.servicios.configuracion.entidades.ConfiguracionSeguroParte;
import org.servicios.configuracion.genericos.MetodosEspecificos;
import org.springframework.beans.factory.annotation.Autowired;

public class ConfiguracionSeguroDAOImpl implements IConfiguracionSeguroDAO{

	@Autowired
	SessionFactory sessionFactory;
	Session session = null;
	Transaction tx = null;
	
	MetodosEspecificos validacion;
	
	@Override
	public String addSeguro(ConfiguracionSeguroParte conf) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		conf.setActivo(new Short("1"));
		String val = validacion.validaAltaSeguro(conf);
		if(val != null){
			return val;
		}else{
		session.save(conf);
		tx.commit();
		session.close();
		return null;
		}
	}

	@Override
	public List<ConfiguracionSeguroParte> getConfSeguroList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<ConfiguracionSeguroParte> lista = session.createCriteria(ConfiguracionSeguroParte.class).list();
		tx.commit();
		session.close();
		return lista;
	}

	@Override
	public ConfiguracionSeguroParte getConfSeguroById(long id) throws Exception {
		session = sessionFactory.openSession();
		ConfiguracionSeguroParte act = (ConfiguracionSeguroParte)session.load(ConfiguracionSeguroParte.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return act;
	}

	@Override
	public ConfiguracionSeguroParte getElimConfSeguroById(long id) throws Exception {
		session = sessionFactory.openSession();
		ConfiguracionSeguroParte act = (ConfiguracionSeguroParte)session.load(ConfiguracionSeguroParte.class, id);
		act.setActivo(new Short("0"));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return act;
	}

}
