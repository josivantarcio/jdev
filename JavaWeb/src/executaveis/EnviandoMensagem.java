package executaveis;

import javax.swing.JOptionPane;

import thread.AulaThreads;

public class EnviandoMensagem {

	public static void main(String[] args) {

	
		Thread msn = new Thread(new AulaThreads().threadOne);
		msn.start();
		
		Thread email = new Thread(new AulaThreads().threadTwo);
		email.start();
		

		JOptionPane.showMessageDialog(null, "Sistema Continuar Processando. \nFavor Aguarde!");

	}
}
