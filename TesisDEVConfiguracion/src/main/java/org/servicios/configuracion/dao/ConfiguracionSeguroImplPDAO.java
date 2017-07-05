package org.servicios.configuracion.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.servicios.configuracion.entidades.AltaSocio;
import org.servicios.configuracion.entidades.ConfiguracionParte1;
import org.servicios.configuracion.entidades.ConfiguracionSeguroParte;
import org.springframework.beans.factory.annotation.Autowired;

public class ConfiguracionSeguroImplPDAO implements IConfiguracionSeguroPDAO{

	@Autowired
	SessionFactory sessionFactory;
	Session session = null;
	Transaction tx = null;
	
	@Override
	public List<ConfiguracionParte1> getListaSeguroConf() {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<ConfiguracionParte1> lista =  session.createCriteria(ConfiguracionSeguroParte.class).
				add(Restrictions.eq("activo",new Short("1"))).list();
		tx.commit();
		session.close();
		return lista;
	}

	@Override
	public boolean ingresaNuevaCarga(ConfiguracionParte1 parte1) {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(parte1);
		tx.commit();
		session.close();
		return false;
	}

	@Override
	public ConfiguracionParte1 eliminaLista(String id) {
		session = sessionFactory.openSession();
		ConfiguracionParte1 alta = (ConfiguracionParte1)session.load(ConfiguracionParte1.class, id);
		alta.setActivo(new Short("0"));;
		session.save(alta);
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return alta;
	}
	
	

	
	
}
