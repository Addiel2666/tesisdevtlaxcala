package org.servicios.configuracion.controller;
import org.servicios.configuracion.entidades.Status;

import java.util.List;

import org.servicios.configuracion.entidades.ConfiguracionProducto;
import org.servicios.configuracion.servicio.IConfProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	IConfProductoService serviceP;
	
	@RequestMapping(value="/alta",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status addSocio(@RequestBody ConfiguracionProducto alta){
		try {
			serviceP.addProducto(alta);
			return new Status(1,"Creacion finalizada");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}
	}
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public @ResponseBody List<ConfiguracionProducto> getAllProd(){
		List<ConfiguracionProducto> list = null;
		try {
			list = serviceP.getProdList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@RequestMapping(value = "/actualizar/{id}", method = RequestMethod.GET)
	public @ResponseBody ConfiguracionProducto getIdProducto(@PathVariable("id")long id){
		ConfiguracionProducto entradaUp = null;
		try {
			entradaUp = serviceP.getProdById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entradaUp;
	}
	
	@RequestMapping(value = "/eliminacion/{id}", method = RequestMethod.GET)
	public @ResponseBody ConfiguracionProducto getIdElimSocio(@PathVariable("id")long id){
		ConfiguracionProducto entradaUp = null;
		try {
			entradaUp = serviceP.getProdById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entradaUp;
	}
}
