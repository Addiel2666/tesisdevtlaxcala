package org.servicios.configuracion.dao;

import java.util.List;

import org.servicios.configuracion.entidades.TipoEntrada;

public interface TipoEntradaDAO {

	public boolean addConfPr(TipoEntrada entrada) throws Exception;
	public TipoEntrada getTipoEntradaById(long id) throws Exception;
	public List<TipoEntrada> getTipoEntradaList() throws Exception;
	
}
