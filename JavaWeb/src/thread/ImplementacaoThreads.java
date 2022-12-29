package thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoThreads extends Thread {

	private static ConcurrentLinkedQueue<FilaPilha> concurrentLQ = new ConcurrentLinkedQueue<>();

	public static void Empilhar(FilaPilha filaPilha) {
		concurrentLQ.add(filaPilha);
	}
	
	

	@Override
	public void run() {
		System.out.println("Thread Funcionando...");
		while (true) {
			Iterator iterator = concurrentLQ.iterator();
			synchronized (iterator) {
				while (iterator.hasNext()) {
					FilaPilha pilhagem = (FilaPilha) iterator.next();

					System.out.println("---------------------------");
					System.out.println(pilhagem.getEmail());
					System.out.println(pilhagem.getNome());

					iterator.remove();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
