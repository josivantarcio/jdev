package thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoThreads extends Thread {

	private ConcurrentLinkedQueue<FilaPilha> trabalhoForcado = new ConcurrentLinkedQueue<>();

	public void add(FilaPilha filaPilha) {
		trabalhoForcado.add(filaPilha);
	}

	@Override
	public void run() {
		Iterator iterator = trabalhoForcado.iterator();

		synchronized (iterator) {

			while (iterator.hasNext()) {
				FilaPilha processar = (FilaPilha) iterator.next();
				
				
				System.out.println("-----------------");
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());

				iterator.remove();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
