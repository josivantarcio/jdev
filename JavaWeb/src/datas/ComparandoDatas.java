package datas;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ComparandoDatas {

	public static void main(String[] args) throws ParseException, InterruptedException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm.ss");
		
		Date dataAniversario = sdf.parse("04/01/2023 03:25.30");
		System.out.println(dataAniversario);
		
		int i = 1;
		boolean stop = true;
		while(stop) {
			Date dataAtual = sdf.parse(sdf.format(Calendar.getInstance().getTime()));
			System.out.println(i++);
			if(dataAniversario.equals(dataAtual)) {
				stop = false;
			}
			System.out.println(dataAtual);
			Thread.sleep(1000);
			
		}
		System.out.println("Fim");
	}

}
