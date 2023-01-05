package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ComparandoDatas {

	public static void main(String[] args) throws ParseException, InterruptedException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		Date dataFinal = sdf.parse("05/01/2023 03:35");
		System.out.println(sdf.format(dataFinal));

		while (true) {
			Date dataAtual = Calendar.getInstance().getTime();
			System.out.println(sdf.format(dataAtual));
			
			if(dataAtual.equals(dataFinal)) {
				break;
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.getMessage();
			}
			
		}
		System.out.println("Fim");
	}

}
