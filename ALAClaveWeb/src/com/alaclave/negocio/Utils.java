package com.alaclave.negocio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

	/** Da formato a una fecha para que sea aceptada por la base de datos. **/
	public static String getFechaActual(String formato) {
		String resultado = "";
		try {
			SimpleDateFormat formatter = new SimpleDateFormat(formato);
			Date currentTime_1 = new Date();
			resultado = formatter.format(currentTime_1);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return resultado;
	}

	/** Da formato a una fecha para que sea aceptada por la base de datos. **/
	public static String getFechaActual() {
		return getFechaActual("dd/MM/yyyy HH:mm");
	}
	}
