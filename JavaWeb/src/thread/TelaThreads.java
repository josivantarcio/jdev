package thread;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class TelaThreads extends JDialog {
	private JPanel painel1 = new JPanel(new GridBagLayout());

	private JLabel labelTexto0 = new JLabel("Tempo do Campo 1");
	private JTextField campoTexto0 = new JTextField();

	private JLabel labelTexto1 = new JLabel("Tempo do Campo 2");
	private JTextField campoTexto1 = new JTextField();
<<<<<<< HEAD

	private JButton bSalvar = new JButton("Salvar");
=======
	
	private JButton bIniciar = new JButton("Start");
>>>>>>> branch 'main' of https://github.com/josivantarcio/jdev.git
	private JButton bParar = new JButton("Parar");
<<<<<<< HEAD

	private Runnable runThread = new Runnable() {
		@Override
		public void run() {
			while (true) {
				campoTexto0.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
				campoTexto1.setText(new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	};

	private Thread threadTempo1;
	private Thread threadTempo2;

	public TelaThreads() {
=======
	
	private Runnable threadTempo = new Runnable() {
		@Override
		public void run() {
			while(true) {
				campoTexto0.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	

	private Runnable threadTempo1 = new Runnable() {
		public void run() {
			while(true) {
				campoTexto1.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	
	private Thread threadTime1;
	private Thread threadTime2;
			
	public TelaThreads()
	{
>>>>>>> branch 'main' of https://github.com/josivantarcio/jdev.git
		setTitle("Marcação de Tempo");
		setSize(new Dimension(400, 200));
		setLocationRelativeTo(null);
		setResizable(false);

		GridBagConstraints gridBag = new GridBagConstraints();
		gridBag.gridx = 0;
		gridBag.gridy = 0;
		gridBag.insets = new Insets(5, 5, 5, 5);

		labelTexto0.setPreferredSize(new Dimension(120, 25));
		painel1.add(labelTexto0, gridBag);
<<<<<<< HEAD

		campoTexto0.setPreferredSize(new Dimension(200, 25));
=======
		
		campoTexto0.setPreferredSize(new Dimension(120, 25));
>>>>>>> branch 'main' of https://github.com/josivantarcio/jdev.git
		campoTexto0.setEditable(false);
		gridBag.gridx++;
		painel1.add(campoTexto0, gridBag);

		gridBag.gridy++;
		labelTexto1.setPreferredSize(new DimensionUIResource(120, 25));
		gridBag.gridx--;
		painel1.add(labelTexto1, gridBag);

		campoTexto1.setPreferredSize(new Dimension(200, 25));
		campoTexto1.setEditable(false);
		gridBag.gridx++;
		painel1.add(campoTexto1, gridBag);

		gridBag.gridy++;
		bIniciar.setPreferredSize(new Dimension(80, 25));
		gridBag.gridx--;
<<<<<<< HEAD
		painel1.add(bSalvar, gridBag);

=======
		painel1.add(bIniciar, gridBag);
		
>>>>>>> branch 'main' of https://github.com/josivantarcio/jdev.git
		bParar.setPreferredSize(new Dimension(80, 25));
		gridBag.gridx++;
		painel1.add(bParar, gridBag);
		
		/*Ações dos botoes*/
		bIniciar.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				threadTime1 = new Thread(threadTempo);	
				threadTime2 = new Thread(threadTempo1);
				threadTime1.start();
				threadTime2.start();
				
				bIniciar.setEnabled(false);
				bParar.setEnabled(true);
			}
		});
		
		bParar.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				threadTime1.stop();
				threadTime2.stop();
				
				bIniciar.setEnabled(true);
				bParar.setEnabled(false);
			}
		});
		
		bParar.setEnabled(false);

		bSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				threadTempo1 = new Thread(runThread);
				threadTempo1.start();
				threadTempo2 = new Thread(runThread);
				threadTempo2.start();
			}
		});
		
		bParar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				threadTempo1.stop();				
				threadTempo2.stop();
			}
		});

		add(painel1);
		setVisible(true);
	}
}
