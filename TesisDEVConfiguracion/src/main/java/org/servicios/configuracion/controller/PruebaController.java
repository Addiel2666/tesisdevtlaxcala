package org.servicios.configuracion.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;
import org.servicios.configuracion.entidades.AltaSocio;
import org.servicios.configuracion.entidades.Prueba;
import org.servicios.configuracion.entidades.Status;
import org.servicios.configuracion.servicio.ISocioService;
import org.servicios.configuracion.servicio.IngresaPS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
@Produces("application/json")
public class PruebaController {

	private final static Logger log = Logger.getLogger(SocioController.class);
	@Autowired
	IngresaPS ingresaPS;
	
	@RequestMapping(value="/alta",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	 @Consumes("application/json")
	public @ResponseBody Status addSocio(@RequestBody Prueba alta){
		log.info("Entra aca");
		try {
			ingresaPS.pruba(alta);
			return new Status(1,"Creacion finalizada");
		} catch (Exception e) {
			 return new Status(0, e.toString());
		}
	}
	
}
