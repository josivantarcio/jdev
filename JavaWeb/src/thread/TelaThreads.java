package thread;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaThreads extends JDialog {
	private JPanel telaTimes = new JPanel(new GridBagLayout());
	
	private JLabel texto1 = new JLabel("Texto 1");
	private JTextField caixaTexto1 = new JTextField();
	
	private JLabel texto2 = new JLabel("Texto 2");
	private JTextField caixaTexto2 = new JTextField();

	public TelaThreads() {
		setTitle("Tela com Tempos em Threads");
		setSize(new Dimension(300, 180));
		setLocationRelativeTo(null);
		setResizable(false);
		
		GridBagConstraints grid = new GridBagConstraints();
		grid.gridx = 0;
		grid.gridy = 0;
		
		texto1.setPreferredSize(new Dimension(100,25));
		telaTimes.add(texto1, grid);
		
		caixaTexto1.setPreferredSize(new Dimension(100, 25));
		grid.gridx++;
		telaTimes.add(caixaTexto1, grid);
		
		texto2.setPreferredSize(new Dimension(100, 25));
		grid.gridy++;
		telaTimes.add(texto2, grid);
		
		caixaTexto2.setPreferredSize(new Dimension(100, 25));
		grid.gridx++;
		telaTimes.add(caixaTexto2, grid);
		
		
		
		add(telaTimes);
		setVisible(true);
	}
}
