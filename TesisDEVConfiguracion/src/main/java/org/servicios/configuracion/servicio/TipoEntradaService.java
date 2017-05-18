package org.servicios.configuracion.servicio;

import java.util.List;

import org.servicios.configuracion.entidades.TipoEntrada;

public interface TipoEntradaService {

	public boolean addConfPr(TipoEntrada entrada) throws Exception;
	public TipoEntrada getTipoEntradaById(long id) throws Exception;
	public List<TipoEntrada> getTipoEntradaList() throws Exception;
	
}
