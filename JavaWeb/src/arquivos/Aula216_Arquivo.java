package arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;

public class Aula216_Arquivo {
	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream arquivo = new FileInputStream("C:\\Users\\Josevan\\git\\repository\\senhas_boti.txt");
		Scanner scanner = new Scanner(arquivo);

		List<Funcionario> funcionarios = new ArrayList<>();

		while (scanner.hasNext()) {

			String linha = scanner.nextLine();

			if (linha != null && !linha.isEmpty()) {

				String[] dado = linha.split(" ");

				Funcionario funcionario = new Funcionario();
				funcionario.setLogin(dado[0]);
				funcionario.setSenha(dado[1]);

				funcionarios.add(funcionario);
			} else {
				break;
			}
		}

		for (Funcionario f : funcionarios) {
			System.out.println("_______________________________");
			System.out.println("Login:" + f.getLogin());
			System.out.println("Senha:" + f.getSenha());
		}
		scanner.close();
	}
}
