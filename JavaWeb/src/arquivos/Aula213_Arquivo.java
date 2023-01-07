package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entidades.Aluno;

public class Aula213_Arquivo {
	public static void main(String[] args) throws IOException {

		List<Aluno> pessoas = new ArrayList<>();
		File file = new File("C:\\Users\\Josevan\\git\\repository\\JavaWeb\\cadastroUsuario.txt");

		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter escrever = new FileWriter(file);
		LocalDate hoje = LocalDate.now();
		for (int i = 0; i < 24; i++) {
			hoje = hoje.plusMonths(1);
			escrever.write("Parcela de Nº " + (1 + i) + ": " + hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n");
		}

		escrever.write("______________________ \n");

		for (int i = 0; i < 4; i++) {

			Aluno p = new Aluno();

			p.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
			p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade")));
			p.setEndereco(JOptionPane.showInputDialog("email"));

			pessoas.add(p);
		}

		for (Aluno aluno : pessoas) {
			escrever.write(aluno.getNome() + ";" + aluno.getIdade() + ";" + aluno.getEndereco()+"\n");
		}

		escrever.flush();
		escrever.close();
		System.out.println("Fim");

	}

}
