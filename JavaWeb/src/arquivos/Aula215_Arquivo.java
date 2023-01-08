package arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aula215_Arquivo {
	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream arquivoTXT = new FileInputStream("C:\\Users\\Josevan\\git\\repository\\senhas_boti.txt");
		Scanner lerArquivo = new Scanner(arquivoTXT);
		
		while(lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();
			
			if(!(linha == null) & (!linha.isEmpty())){
				System.out.println(linha);		
			}
			
		}
		
		lerArquivo.close();
	}
}
