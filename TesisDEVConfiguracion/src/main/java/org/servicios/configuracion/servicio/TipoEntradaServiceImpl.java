package org.servicios.configuracion.servicio;

import java.util.List;

import org.servicios.configuracion.dao.TipoEntradaDAO;
import org.servicios.configuracion.entidades.TipoEntrada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEntradaServiceImpl implements TipoEntradaService{

	@Autowired
	TipoEntradaDAO tipo;
	
	@Override
	public boolean addConfPr(TipoEntrada entrada) throws Exception {
		// TODO Auto-generated method stub
		return tipo.addConfPr(entrada);
	}

	@Override
	public TipoEntrada getTipoEntradaById(long id) throws Exception {
		// TODO Auto-generated method stub
		return tipo.getTipoEntradaById(id);
	}

	@Override
	public List<TipoEntrada> getTipoEntradaList() throws Exception {
		// TODO Auto-generated method stub
		return tipo.getTipoEntradaList();
	}

}
