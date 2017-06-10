package org.servicios.configuracion.controller;

import java.util.List;

import org.servicios.configuracion.entidades.AltaSocio;
import org.servicios.configuracion.entidades.Status;
import org.servicios.configuracion.entidades.TipoEntrada;
import org.servicios.configuracion.servicio.ISocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/socio")
public class SocioController {

	@Autowired
	ISocioService service;
	
	@RequestMapping(value="/alta",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status addSocio(@RequestBody AltaSocio alta){
		try {
			service.addAltaSocio(alta);
			return new Status(1,"Creacion finalizada");
		} catch (Exception e) {
			 return new Status(0, e.toString());
		}
	}
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public @ResponseBody List<AltaSocio> getAllSocio(){
		
		List<AltaSocio> list = null;
		try {
			list = service.getSocioList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@RequestMapping(value = "/actualizar/{id}", method = RequestMethod.GET)
	public @ResponseBody AltaSocio getIdSocio(@PathVariable("id")long id){
		AltaSocio entradaUp = null;
		try {
			entradaUp = service.getSocioById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entradaUp;
	}
	
	@RequestMapping(value = "/eliminacion/{id}", method = RequestMethod.GET)
	public @ResponseBody AltaSocio getIdElimSocio(@PathVariable("id")long id){
		AltaSocio entradaUp = null;
		try {
			entradaUp = service.getSocioById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entradaUp;
	}
}
