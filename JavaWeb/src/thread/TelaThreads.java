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
	
	private JButton bIniciar = new JButton("Start");
	private JButton bParar = new JButton("Parar");
	
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
		setTitle("Marcação de Tempo");
		setSize(new Dimension(300, 200));
		setLocationRelativeTo(null);
		setResizable(false);

		GridBagConstraints gridBag = new GridBagConstraints();
		gridBag.gridx = 0;
		gridBag.gridy = 0;
		gridBag.insets = new Insets(5, 5, 5, 5);
		
		labelTexto0.setPreferredSize(new Dimension(120, 25));
		painel1.add(labelTexto0, gridBag);
		
		campoTexto0.setPreferredSize(new Dimension(120, 25));
		campoTexto0.setEditable(false);
		gridBag.gridx++;
		painel1.add(campoTexto0, gridBag);
		
		gridBag.gridy++;
		labelTexto1.setPreferredSize(new DimensionUIResource(120, 25));
		gridBag.gridx--;
		painel1.add(labelTexto1, gridBag);
		
		campoTexto1.setPreferredSize(new Dimension(120, 25));
		campoTexto1.setEditable(false);
		gridBag.gridx++;
		painel1.add(campoTexto1, gridBag);
		
		gridBag.gridy++;
		bIniciar.setPreferredSize(new Dimension(80, 25));
		gridBag.gridx--;
		painel1.add(bIniciar, gridBag);
		
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

		add(painel1);
		setVisible(true);
	}
}
