package thread;

import javax.swing.JOptionPane;

public class AulaThreads {

	public static void main(String[] args) throws InterruptedException {

		new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Enviando para o Servidor contato do WhatsApp");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("FIM");
			};
		}.start();
		
		new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Enviando para o Servidor contato do email");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}.start();
		
		
		JOptionPane.showMessageDialog(null, "Sistema ainda Rodando");
	}
}
