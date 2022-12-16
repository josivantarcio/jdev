package thread;

public class AulaThreads {

	public Runnable threadOne = new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("Mensagem para o Servidor");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	};

	public Runnable threadTwo = new Runnable() {

		@Override
		public void run() {

			for (int i = 0; i < 10; i++) {
				System.out.println("Mensagem para o Servidor de Email");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.getMessage();
				}
			}
			System.out.println("FIM");
		}

	};

}