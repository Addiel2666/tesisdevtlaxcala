package org.servicios.configuracion.genericos;

import org.servicios.configuracion.entidades.ConfiguracionSeguroParte;

public class MetodosEspecificos {

	final String MESSAGE_OK = "Valido";
	final String MESSAGE_FALLIDO_NOMBRE = "Nombre de proceso de seguro no valido";
	final String MESSAGE_FALLIDO_ID_PROCESO = "Serie error";
	final String MESSAGE_FALLIDO_PROCESO = "Proceso error";
	final String MESSAGE_FALLIDO_NOMBRE_NEGOCIO = "Negocio error";
	
	public String validaAltaSeguro(ConfiguracionSeguroParte conf) {
		String mensaje = null;
		String nombre = conf.getNombreCarga();
		if(nombre.length() < 7 && nombre.length() > 7){
			mensaje = MESSAGE_FALLIDO_NOMBRE;
			return mensaje;
		}else{
			boolean bandera = nombre.matches("[A-Z]+-\\d{1,10}");
			if(bandera == false){
				mensaje = MESSAGE_FALLIDO_NOMBRE;
				return mensaje;
			}
		}
		if(conf.getSerie() != null){
			mensaje = MESSAGE_FALLIDO_ID_PROCESO;
			return mensaje;
		}
		if(conf.getIdProceso() != 0){
			mensaje = MESSAGE_FALLIDO_PROCESO;
			return mensaje;
		}
		if(conf.getNombreNegocio() != null){
			mensaje = MESSAGE_FALLIDO_NOMBRE_NEGOCIO;
			return mensaje;
		}
		return null;
			
	}

	
	
}
