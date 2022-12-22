package thread;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

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
	
	private JButton bSalvar = new JButton("Salvar");
	private JButton bParar = new JButton("Parar");
			
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
		campoTexto0.setEnabled(false);
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
		bSalvar.setPreferredSize(new Dimension(80, 25));
		gridBag.gridx--;
		painel1.add(bSalvar, gridBag);
		
		bParar.setPreferredSize(new Dimension(80, 25));
		gridBag.gridx++;
		painel1.add(bParar, gridBag);

		add(painel1);
		setVisible(true);
	}
}
