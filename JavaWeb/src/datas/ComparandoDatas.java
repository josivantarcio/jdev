package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ComparandoDatas {

	public static void main(String[] args) throws ParseException, InterruptedException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

		Date dataFinal = sdf.parse("05/01/2023 04:05:40");
		System.out.println(sdf.format(dataFinal));

		Date dataAtual = null;

		Boolean iniciar = true;
		while (iniciar) {
			dataAtual = Calendar.getInstance().getTime();
			System.out.println(sdf.format(dataAtual));

			if (dataFinal.after(dataAtual)) {
				iniciar = false;
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
