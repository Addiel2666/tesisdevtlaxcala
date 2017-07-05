package org.servicios.configuracion.client;

import java.net.URI;
import java.util.Date;

import org.servicios.configuracion.entidades.AltaSocio;
import org.servicios.configuracion.entidades.TipoEntrada;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClientConf {

	public void getListaConfiguraciones(){
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/TesisDEVConfiguracion/configuracion/lista_configuraciones";
		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<TipoEntrada[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, TipoEntrada[].class);
		TipoEntrada[] entradas = responseEntity.getBody();
		for(TipoEntrada entrada : entradas){
			System.out.println("Id: "+entrada.getId()+", Codigo:"+entrada.getCodigo()+", Descripcion:"+entrada.getDescripcion());
		}
	}
	
	public void addConf(){
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = " http://localhost:8080/TesisDEVConfiguracion/configuracion/creacion_entrada_archivos";
		TipoEntrada entrada = new TipoEntrada();
		entrada.setExtension("s");
		entrada.setDescripcion("dd");
		entrada.setCodigo("dd");
entrada.setId(new Long(2));
		HttpEntity<TipoEntrada> requestEntity = new HttpEntity<TipoEntrada>(entrada,headers);
		URI uri = restTemplate.postForLocation(url, requestEntity);
		System.out.println("Se hace insercion "+uri.getPath());
	}
	
	public void addSocio(){
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/TesisDEVConfiguracion/socio/alta";
		AltaSocio objAlta = new AltaSocio();
		objAlta.setId("ASDDFFGG");
		objAlta.setNombreSocio("Prueba");
		objAlta.setTipo(new Long(1));
		objAlta.setClaveSocio("ASDDF");
		objAlta.setDescripcionSocio("Socio prueba");
		objAlta.setFechaCreacion(new Date());
		objAlta.setFechaVigenciaFinal(new Date());
		objAlta.setFechaVigenciaInicio(new Date());
		HttpEntity<AltaSocio> requestEntity = new HttpEntity<AltaSocio>(objAlta,headers);
		
		URI uri = restTemplate.postForLocation(url, requestEntity);
		
		System.out.println(uri.getPath());
	}
	
	public static void main(String[] args) {
		RestClientConf util = new RestClientConf();
//		util.getListaConfiguraciones();
	util.addSocio();
//	util.addConf();

	}

}
