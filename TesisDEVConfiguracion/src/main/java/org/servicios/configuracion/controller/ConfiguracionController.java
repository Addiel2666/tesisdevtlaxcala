package org.servicios.configuracion.controller;

import java.util.List;

import org.servicios.configuracion.entidades.AltaSocio;
import org.servicios.configuracion.entidades.ConfiguracionProducto;
import org.servicios.configuracion.entidades.Status;
import org.servicios.configuracion.entidades.TipoEntrada;
import org.servicios.configuracion.servicio.ConfiguracionProductoService;
import org.servicios.configuracion.servicio.TipoEntradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.http.MediaType;  

@Controller
@RequestMapping("/configuracion")
public class ConfiguracionController {

	@Autowired
	TipoEntradaService entradaService;
	@Autowired
	ConfiguracionProductoService confProducto;
	
	@RequestMapping(value="/creacion_entrada_archivos",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)  
public @ResponseBody Status addTipoEntrada(@RequestBody TipoEntrada entrada){
		try {
			entradaService.addConfPr(entrada);
			return new Status(1,"Creacion finalizada");
		} catch (Exception e) {
			  return new Status(0, e.toString());  
		}
}
	 @RequestMapping(value = "/entrada/{id}", method = RequestMethod.GET)  
	 public @ResponseBody  TipoEntrada getTipoEntrada(@PathVariable("id")long id){
		TipoEntrada tipoEntrada = null;
		 try {
			tipoEntrada = entradaService.getTipoEntradaById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 return tipoEntrada;
		 
	 }
	 
	 @RequestMapping(value = "/lista_configuraciones", method = RequestMethod.GET)
	 public @ResponseBody List<TipoEntrada> getTipoEntrada(){
		List<TipoEntrada> entradas = null;
		try {
			entradas = entradaService.getTipoEntradaList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return entradas;
		 
	 }
	 
	 @RequestMapping(value="/configuracion_productos",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody Status addNuevoProducto(@RequestBody ConfiguracionProducto producto){
		 try {
			confProducto.addProducto(producto);
			return new Status(1,"Creacion finalizada");
		} catch (Exception e) {
			return new Status(0,"Carga Fallida");
		}
	 }
	 
	 @RequestMapping(value = "/producto/{id}", method = RequestMethod.GET)  
	 public @ResponseBody  ConfiguracionProducto getByProducto(@PathVariable("id")String id){
		ConfiguracionProducto configuracionProducto = null;
		 try {
			 configuracionProducto = confProducto.getByConfProd(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 return configuracionProducto;
		 
	 }
	 
	 @RequestMapping(value = "/altaSocio", method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody AltaSocio addSocio(@RequestBody AltaSocio socio){
		return socio;
		 
	 }
}
