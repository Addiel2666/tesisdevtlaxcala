package org.servicios.configuracion.controller;

import java.util.List;

import org.servicios.configuracion.entidades.ConfiguracionSeguroParte;
import org.servicios.configuracion.entidades.Status;
import org.servicios.configuracion.servicio.IConfiguracionSeguroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/confSeguro")
public class ConfSeguroController {

	@Autowired
	IConfiguracionSeguroService serviceCfS;
	
	@RequestMapping(value="/alta",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status addSocio(@RequestBody ConfiguracionSeguroParte seguroParte){
		try {
			serviceCfS.addSeguro(seguroParte);
			return new Status(1,"Creacion finalizada");
		} catch (Exception e) {
			 return new Status(0, e.toString());
		}
	}
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public @ResponseBody List<ConfiguracionSeguroParte> getAllConfS(){
		List<ConfiguracionSeguroParte> list = null;
		try {
			list = serviceCfS.getConfSeguroList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@RequestMapping(value = "/actualizar/{id}", method = RequestMethod.GET)
	public @ResponseBody ConfiguracionSeguroParte getIdSeguroC(@PathVariable("id")long id){
		ConfiguracionSeguroParte upSeguro = null;
		try {
			upSeguro = serviceCfS.getConfSeguroById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return upSeguro;
	}
	
	@RequestMapping(value = "/eliminacion/{id}", method = RequestMethod.GET)
	public @ResponseBody ConfiguracionSeguroParte getIdElimSeguro(@PathVariable("id")long id){
		ConfiguracionSeguroParte upSeguro = null;
		try {
			upSeguro = serviceCfS.getElimConfSeguroById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return upSeguro;
	}
}
