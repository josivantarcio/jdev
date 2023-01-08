package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class SomandoDatas {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);

		System.out.println("Data do Sistema: " + sdf.format(cal.getTime()));

		int quant = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de parcelas"));
		System.out.println("Parcelas:");
		int intervaloDias = 30;
		for (int i = 1; i <= quant; i++) {
			cal.add(Calendar.DATE, intervaloDias);
			System.out.println(sdf.format(cal.getTime()));

		}

	}

}
