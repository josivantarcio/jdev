package executaveis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import auxiliares.AutenticarUsuario;
import constantes.StatusAluno;
import entidades.Aluno;
import entidades.Disciplina;
import entidades.Secretario;
import interfaces.PermitirAcesso;

public class Conversao {

	public static void main(String[] args) {
		try {
		HashMap<String, List<Aluno>> maps = new HashMap<>();

		String login = JOptionPane.showInputDialog(null, "Login");
		String senha = JOptionPane.showInputDialog(null, "Senha");

		
		//Secretario sec = new Secretario(login, senha); /*Trabalhando Diretamento do Objeto*/
		AutenticarUsuario autenticarUsuario = new AutenticarUsuario();
		PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		/* Login do Secreatio do Sistema */
		if (autenticarUsuario.chave(permitirAcesso)) {

			List<Aluno> alunos = new ArrayList<>();
		

			for (int i = 1; i <= 5; i++) {

				String nome = JOptionPane.showInputDialog("Nome do Aluno");
				String idade = JOptionPane.showInputDialog("Idade do Aluno " + nome);
				String cpf = JOptionPane.showInputDialog("CPF");

				Aluno aluno1 = new Aluno();

				aluno1.setAluno(nome);
				aluno1.setCpf(cpf);
				aluno1.setIdade(Integer.valueOf(idade));

				for (int j = 0; j < 1; j++) {
					Disciplina disciplina = new Disciplina();
					String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina?");
					double notaDisciplina = (Double.parseDouble(JOptionPane.showInputDialog("Nota da " + nomeDisciplina)));

					disciplina.setNomeDisciplina(nomeDisciplina);
					disciplina.setNotaDisciplina(notaDisciplina);

					aluno1.getDisciplinas().add(disciplina);
				}

				/* Remover Disciplinas */
				int desejaRemoverDisciplina = JOptionPane.showConfirmDialog(null, "Deseja Remover alguma disciplina?");

				while (aluno1.getDisciplinas().size() > 0 && desejaRemoverDisciplina == 0) {
					int indexDisciplina = Integer.valueOf(JOptionPane.showInputDialog(
							"Digite Index da Disciplina. Tamanho Max." + (aluno1.getDisciplinas().size() - 1)));
					while (indexDisciplina >= aluno1.getDisciplinas().size()) {
						indexDisciplina = Integer.valueOf(
								JOptionPane.showInputDialog("ERRO! Digite NOVAMENTE o Index da Disciplina. Tamanho Max."
										+ (aluno1.getDisciplinas().size() - 1)));
					}
					aluno1.getDisciplinas().remove(indexDisciplina);

					desejaRemoverDisciplina = JOptionPane.showConfirmDialog(null, "Continuar Excluindo?");
				}

				alunos.add(aluno1);

			}

			/* Imprimir Relatorio dos alunos */
			for (Aluno aluno1 : alunos) {
				System.out.println(aluno1);
				System.out.println("Media: " + aluno1.media());
				System.out.println(
						"Situação do Aluno " + aluno1.getAluno() + ": " + (aluno1.situacao() ? StatusAluno.APROVADO
								: (aluno1.media() >= 5 ? StatusAluno.RECUPERACAO : StatusAluno.REPROVADO)));
				System.out.println("---------------------");
			}
			System.out.println("\n#####################\n");

			/* Localizar Aluno na Lista */
			String nomeProcurado = JOptionPane.showInputDialog("Digite o nome do aluno procurado");

			for (Aluno aluno : alunos) {
				if (aluno.getAluno().equalsIgnoreCase(nomeProcurado)) {

					/* Remover aluno da lista */
					// alunos.remove(aluno);

					/* Mostrar media do aluno selecionado */
					System.out.println("Media do Aluno Localizado: " + aluno.getAluno() + " ==> " + aluno.media());

				}
			}

			/* Mostrar os Alunos Ativos */
			System.out.println("Restantes...");
			for (Aluno a : alunos) {
				System.out.println(a.getAluno());
			}

			System.out.println("\n******************************");

			/**
			 * Alterar Aluno do quadro de alunos
			 */
			int desejaAlterar = JOptionPane.showConfirmDialog(null, "Deseja Alterar algum Aluno?");
			while (desejaAlterar == 0) {
				String alunoAlterar = JOptionPane.showInputDialog("Nome do Aluno para Alterar?");
				for (Aluno aluno : alunos) {
					if (alunoAlterar.equalsIgnoreCase(aluno.getAluno())) {
						alunos.remove(aluno);
						Aluno newAluno = new Aluno();
						String nome = JOptionPane.showInputDialog("Nome do Aluno");
						String idade = JOptionPane.showInputDialog("Idade do aluno " + nome);
						String cpf = JOptionPane.showInputDialog("CPF");

						newAluno.setAluno(nome);
						newAluno.setIdade(Integer.parseInt(idade));
						newAluno.setCpf(cpf);
						alunos.add(newAluno);

						for (int j = 0; j < 1; j++) {
							Disciplina newDisciplina = new Disciplina();

							String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina?");
							double notaDisciplina = (Double
									.parseDouble(JOptionPane.showInputDialog("Nota da " + nomeDisciplina)));

							newDisciplina.setNomeDisciplina(nomeDisciplina);
							newDisciplina.setNotaDisciplina(notaDisciplina);

							newAluno.getDisciplinas().add(newDisciplina);
						}

						break;
					}
				}
				desejaAlterar = JOptionPane.showConfirmDialog(null, "Deseja continuar Alterando?");
			}

			/**
			 * Apos Possiveis Alterações
			 */
			System.out.println("Após Possiveis Alterações...");
			for (Aluno a : alunos) {
				System.out.println(a.getAluno());
			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {
				if (aluno.situacao2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.situacao2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}

			System.out.println("===" + StatusAluno.APROVADO + "===");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println(aluno);
				System.out.println("---");
			}

			System.out.println("===" + StatusAluno.RECUPERACAO + "===");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println(aluno);
				System.out.println("---");
			}

			System.out.println("===" + StatusAluno.REPROVADO + "===");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println(aluno);
				System.out.println("---");
			}
		}
		else {
			System.out.println("Login ou Senha Errado.");
		}
		System.out.println("FIM");
		}catch (NullPointerException e) {
			System.out.println(e.getStackTrace().getClass());
		}
	}
}