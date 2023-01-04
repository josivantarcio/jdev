package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data1 {

	public static void main(String[] args) throws ParseException {
		Date data = new Date();
		Calendar calendar = Calendar.getInstance();
		
		//Brincando com Datas
		
		System.out.println("data em milissegundos "+data.getDate());
		System.err.println("Calendar data em milissegundos "+ calendar.get(Calendar.DATE));
		System.out.println("Milissegundos: " + calendar.getTimeInMillis());
		
		System.out.println("dia da semana "+data.getDay());
		System.err.println("Calendar dia da semana "+calendar.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("horas "+data.getHours());
		System.err.println("Calendar horas "+ calendar.get(Calendar.HOUR));
		
		System.out.println("minutos "+data.getMinutes());
		System.err.println("Calendar minutos "+ calendar.get(Calendar.MINUTE));
		
		System.out.println("seguundos "+data.getSeconds());
		System.err.println("Calendar seguundos "+calendar.get(Calendar.SECOND));
		
		System.out.println("Mes "+data.getMonth());
		System.err.println("Calendar Mes "+calendar.get(Calendar.MONTH));
		
		System.out.println("Ano "+(data.getYear()+1900));
		System.err.println("Calendar Ano "+calendar.get(Calendar.YEAR));
				
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		System.out.println("Formato Americano de data: " + sdf.format(data));
		System.out.println("Calendar Formato Americano de data: " + sdf.format(calendar.getTime()));
		
		
		sdf = new SimpleDateFormat("dd/MM/yyyy ss");
		System.out.println("Formato Brasileiro de data: " + sdf.format(data));
		System.out.println("Calendar Formato Brasileiro de data: " + sdf.format(calendar.getTime()));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Formato db de data: " + sdf.format(data));
		
		System.out.println(sdf.format(calendar.getTime()));

	}

}
