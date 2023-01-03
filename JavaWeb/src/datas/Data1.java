package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data1 {

	public static void main(String[] args) throws ParseException {
		Date data = new Date();
		
		//Brincando com Datas
		
		System.out.println("data em milissegundos "+data.getDate());
		System.out.println("dia da semana "+data.getDay());
		System.out.println("horas "+data.getHours());
		System.out.println("minutos "+data.getMinutes());
		System.out.println("seguundos "+data.getSeconds());
		System.out.println("Mes "+data.getMonth());
		System.out.println("Ano "+(data.getYear()+1900));
		System.out.println("timeZone "+data.getTimezoneOffset());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		System.out.println("Formato Americano de data: " + sdf.format(data));
		
		
		sdf = new SimpleDateFormat("dd/MM/yyyy ss");
		System.out.println("Formato Brasileiro de data: " + sdf.format(data));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Formato db de data: " + sdf.format(data));
		
		String niverBranca = "1977-02-07";
		Date branca = sdf.parse(niverBranca);
		System.out.println(branca);

	}

}
