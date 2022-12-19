package thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaThreads extends JDialog{
	private JPanel jPainel = new JPanel(new GridBagLayout());
	private JLabel descricaoThread1 = new JLabel("Time da Thread 1");
	private JTextField caixaTexto1 = new JTextField();
	private JLabel descricaoThread2 = new JLabel("Time da Thread 2");
	private JTextField caixaTexto2 = new JTextField();
	
	private JButton jbSalvar = new JButton();
	private JButton jbParar = new JButton();
	

	public TelaThreads() {
		/*Cabeçalho do construtor sempre!!!*/
		setTitle("Minha Tela do Tempo com Thread");
		setSize(new Dimension(360, 280));
		setLocationRelativeTo(null);
		setResizable(false);
		/*Fim do cabeçalho*/
		
		/*gerenciado de posicionamento de componentes*/
		GridBagConstraints gridBag = new GridBagConstraints();
		gridBag.gridx = 0;
		gridBag.gridy = 0;
		
		/*criação dos componentes*/
		descricaoThread1.setPreferredSize(new Dimension(200, 25));
		jPainel.add(descricaoThread1, gridBag);
		
		caixaTexto1.setPreferredSize(new Dimension(200,25));
		gridBag.gridy++;
		jPainel.add(caixaTexto1, gridBag);
		
		descricaoThread2.setPreferredSize(new Dimension(200, 25));
		gridBag.gridy++;
		jPainel.add(descricaoThread2, gridBag);
		
		caixaTexto2.setPreferredSize(new Dimension(200, 25));
		gridBag.gridy++;
		jPainel.add(caixaTexto2, gridBag);
		
		jbSalvar.setPreferredSize(new Dimension(100, 25));
		gridBag.gridy++;
		jPainel.add(jbSalvar, gridBag);
		
		jbParar.setPreferredSize(new Dimension(100, 25));
		gridBag.gridx++;
		jPainel.add(jbParar, gridBag);
		
		
		add(jPainel, BorderLayout.WEST);
		
		
		/*Rodapé do construtor sempre*/
		setVisible(true);
	}
}

