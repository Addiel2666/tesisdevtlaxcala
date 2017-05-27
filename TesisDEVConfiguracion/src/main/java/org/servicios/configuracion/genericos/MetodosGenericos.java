package org.servicios.configuracion.genericos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MetodosGenericos {
	
	public String nuevoId(String nombreProducto, Date date) {
		String subCadena = nombreProducto.substring(0,3);
		date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
		String today = dateFormat.format(date);
		
		String creacionId = subCadena+today;
		return creacionId;
	}

	
}
