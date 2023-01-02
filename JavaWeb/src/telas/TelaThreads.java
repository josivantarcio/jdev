package telas;

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
	

	private Thread threadTemp;
	private Thread threadTemp2;
			
	public TelaThreads()
	{

		setTitle("Marcação de Tempo");
		setSize(new Dimension(550, 350));
		setLocationRelativeTo(null);
		setResizable(true);

		GridBagConstraints gridBag = new GridBagConstraints();
		gridBag.gridx = 0;
		gridBag.gridy = 0;
		gridBag.insets = new Insets(5, 5, 5, 5);

		labelTexto0.setPreferredSize(new Dimension(100, 25));
		painel1.add(labelTexto0, gridBag);

		campoTexto0.setPreferredSize(new Dimension(200,25));
		campoTexto0.setEditable(false);
		gridBag.gridx++;
		painel1.add(campoTexto0, gridBag);

		
		labelTexto1.setPreferredSize(new DimensionUIResource(100, 25));
		gridBag.gridy++;
		gridBag.gridx--;
		painel1.add(labelTexto1, gridBag);

		campoTexto1.setPreferredSize(new Dimension(200, 25));
		campoTexto1.setEditable(false);
		gridBag.gridx++;
		painel1.add(campoTexto1, gridBag);


		bIniciar.setPreferredSize(new Dimension(80, 25));
		gridBag.gridy++;
		gridBag.gridx--;
		painel1.add(bIniciar, gridBag);


		bParar.setPreferredSize(new Dimension(80, 25));
		gridBag.gridx++;
		painel1.add(bParar, gridBag);
		
		
		/*Ações dos botoes*/
		bIniciar.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				threadTemp = new Thread(runThread);	
				threadTemp2 = new Thread(runThread);
				threadTemp.start();
				threadTemp2.start();
				
				bIniciar.setEnabled(false);
				bParar.setEnabled(true);
			}
		});
		
		bParar.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				threadTemp.stop();
				threadTemp2.stop();
				
				bIniciar.setEnabled(true);
				bParar.setEnabled(false);
			}
		});
		
		bParar.setEnabled(false);

		add(painel1);
		setVisible(true);
	}
}
