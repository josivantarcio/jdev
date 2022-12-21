package thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaThreads extends JDialog {
	private JPanel jpanel = new JPanel(new GridBagLayout());
	private JLabel jlabel1 = new JLabel("Time Thread 1");
	private JLabel jlabel2 = new JLabel("Time Thread 2");
	private JTextField jTextoField1 = new JTextField();
	private JTextField jTextoField2 = new JTextField();
	
	
	public TelaThreads() {
		setTitle("Minha Tela do Tempo"); // titulo da tela
		setSize(new Dimension(350, 250)); // tamanho da tela
		setLocationRelativeTo(null); // centralizar tela
		setResizable(false); // nao permite a tela ser ajustada de tamanho
		
		

		GridBagConstraints gridBagConstraints = new GridBagConstraints(); //gerenciador de telas
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		jlabel1.setPreferredSize(new Dimension(150, 25));
		jpanel.add(jlabel1, gridBagConstraints);
		
		jTextoField1.setPreferredSize(new Dimension(150, 25));
		gridBagConstraints.gridx++;
		jpanel.add(jTextoField1, gridBagConstraints);
		
		jlabel2.setPreferredSize(new Dimension(150, 25));
		gridBagConstraints.gridy++;
		gridBagConstraints.gridx--;
		jpanel.add(jlabel2, gridBagConstraints);
		
		jTextoField2.setPreferredSize(new Dimension(150, 25));
		gridBagConstraints.gridx++;
		jpanel.add(jTextoField2, gridBagConstraints);
		
		
		add(jpanel, BorderLayout.CENTER);
		setVisible(true); // mostrar todo o conteudo da tela
	}

}
