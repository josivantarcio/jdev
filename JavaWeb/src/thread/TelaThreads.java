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

	public TelaThreads() {
		setTitle("Tela com Tempos em Threads");
		setSize(new Dimension(320, 320));
		setLocation(null);
		
		

		GridBagConstraints grid = new GridBagConstraints();
		grid.gridx = 0;
		grid.gridy = 0;
		

		
		setVisible(true);
	}
}
