package org.servicios.configuracion.controller;

import java.util.List;


import org.servicios.configuracion.entidades.CatalogoProceso;
import org.servicios.configuracion.servicio.ConfiguracionServiciosGenerales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/configuracion")
public class ConfiguracionController {

	@Autowired
	private ConfiguracionServiciosGenerales generales;
	
	 @RequestMapping(value="/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	    @ResponseStatus(HttpStatus.OK)
	    public List<CatalogoProceso> getAllUsers() {
	        return generales.findAll();
	    }
}
