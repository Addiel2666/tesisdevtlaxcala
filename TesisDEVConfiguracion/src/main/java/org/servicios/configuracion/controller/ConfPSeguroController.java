package org.servicios.configuracion.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;
import org.servicios.configuracion.entidades.ConfiguracionParte1;
import org.servicios.configuracion.entidades.ConfiguracionSeguroParte;
import org.servicios.configuracion.entidades.Status;
import org.servicios.configuracion.servicio.IConfiguracionSeguroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seguro")
@Produces("application/json")
public class ConfPSeguroController {
	private final static Logger log = Logger.getLogger(ConfPSeguroController.class);
	@Autowired
	IConfiguracionSeguroServicio servicio;
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public @ResponseBody List<ConfiguracionParte1> getAllSeguro(){
		List<ConfiguracionParte1> list = null;
		try {
			list = servicio.getListaSeguroConf();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@RequestMapping(value="/alta",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	 @Consumes("application/json")
	public @ResponseBody Status addSocio(@RequestBody ConfiguracionParte1 alta){
		try {
			servicio.ingresaNuevaCarga(alta);
			return new Status(1,"Creacion finalizada");
		} catch (Exception e) {
			 return new Status(0, e.toString());
		}
	}
	
	@RequestMapping(value = "/eliminacion/{id}", method = RequestMethod.GET)
	@Consumes("application/json")
	public @ResponseBody ConfiguracionParte1 getEliminaSeguro(@PathVariable("id")String id){
		ConfiguracionParte1 elimina = null;
		try {
			elimina = servicio.eliminaLista(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return elimina;
	}
}
