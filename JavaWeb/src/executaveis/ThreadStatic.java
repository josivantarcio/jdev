package executaveis;

import javax.swing.JOptionPane;

public class ThreadStatic {
	
	public static void main(String[] args) {
		
		Thread email = new Thread(thread1);
		email.start();
		Thread msn = new Thread(thread2);
		msn.start();
		JOptionPane.showMessageDialog(null, "Sistema Processando...");
		
	}
	
	
	
	static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
	
			for(int i =0; i < 10; i++) {
				System.out.println("Enviando email...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};

	static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			for(int i =0; i < 10; i++) {
				System.out.println("Enviando MSN...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
}
