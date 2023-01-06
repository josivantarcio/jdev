package datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Aula209_Data {

	public static void main(String[] args) throws InterruptedException {

		/*Data*/
		LocalDate data1 = LocalDate.now();
		System.out.println(data1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		LocalDate data2 = LocalDate.of(2023, 01, 14);
		System.out.println(data2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		if (data1.isBefore(data2)) {
			System.out.println("Ainda tem 22 anos");
		} else {
			System.out.println("Já possui 23 anos");
		}

		/*Data e Hora*/
		LocalDateTime data3 = LocalDateTime.now();
		LocalDateTime data4 = LocalDateTime.of(2023, 01, 05, 8, 48, 00);
		System.out.println(data4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));


		while (data3.isBefore(data4)) {
			data3 = LocalDateTime.now();
			System.out.println(data3.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
			Thread.sleep(1000);
		}
		System.out.println("Fim");
		
		
		/*Hora*/
		LocalTime horaAtual = LocalTime.now();
		System.out.println(horaAtual.format(DateTimeFormatter.ofPattern("hh:mm")));
		
		LocalTime horaFinal = LocalTime.of(9, 01);
		
		while (horaAtual.equals(horaFinal)) {
			horaAtual = LocalTime.now();
			System.out.println(horaAtual.format(DateTimeFormatter.ofPattern("hh:mm")));
			Thread.sleep(1000);
		}
		System.out.println("Fim");
		
	}	

}
