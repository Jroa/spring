package pe.com.siraywasi.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date getDateFromString(String fecha) {
		Date date = null;
		try {
			if (fecha.equals("")) {
				return null;
			}

			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			date = (Date) formato.parse(fecha);
			return date;
		} catch (Exception ex) {
			return date;
		}
	}
	
	public static String convertDateToString(Date fecha){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateString = dateFormat.format(fecha);
		return dateString;
	}
}
