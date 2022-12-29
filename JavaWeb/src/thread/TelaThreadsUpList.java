package thread;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class TelaThreadsUpList extends JDialog {
	private JPanel painel1 = new JPanel(new GridBagLayout());

	private JLabel labelTexto0 = new JLabel("Nome");
	private JTextField campoTexto0 = new JTextField();

	private JLabel labelTexto1 = new JLabel("Email");
	private JTextField campoTexto1 = new JTextField();
	
	private JButton bIniciar = new JButton("Gerar");
	private JButton bParar = new JButton("Parar");
	
	private ImplementacaoThreads tela = new ImplementacaoThreads();
	
			
	public TelaThreadsUpList()
	{
		setTitle("Marcação de Tempo");
		setSize(new Dimension(500, 200));
		setLocationRelativeTo(null);
		setResizable(false);

		GridBagConstraints gridBag = new GridBagConstraints();
		gridBag.gridx = 0;
		gridBag.gridy = 0;
		gridBag.insets = new Insets(5, 5, 5, 5);
		
		labelTexto0.setPreferredSize(new Dimension(120, 25));
		painel1.add(labelTexto0, gridBag);
		
		campoTexto0.setPreferredSize(new Dimension(200, 25));
		gridBag.gridx++;
		painel1.add(campoTexto0, gridBag);
		
		gridBag.gridy++;
		labelTexto1.setPreferredSize(new DimensionUIResource(120, 25));
		gridBag.gridx--;
		painel1.add(labelTexto1, gridBag);
		
		campoTexto1.setPreferredSize(new Dimension(200, 25));
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
				FilaPilha pilha = new FilaPilha();
				pilha.setNome(campoTexto0.getText());
				pilha.setEmail(campoTexto1.getText());
				tela.Empilhar(pilha);		
				
				
			}
		});
		
		bParar.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				tela.stop();
			}
		});
		
		

		tela.start();
		add(painel1);
		setVisible(true);
	}
}
