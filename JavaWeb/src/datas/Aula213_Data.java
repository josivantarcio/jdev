package datas;

import java.time.LocalDate;

public class Aula213_Data {
	public static void main(String[] args) {

		LocalDate dataAtual = LocalDate.now();

		for (int i = 0; i < 12; i++) {
			dataAtual = dataAtual.plusMonths(1);
			System.out.println(dataAtual);
		}

		
	}

}
