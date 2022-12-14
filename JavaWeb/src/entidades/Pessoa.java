package entidades;

import java.util.Objects;

public abstract class Pessoa{
	
	private String aluno;
	private int idade;
	private String cpf;
	
	
	
	public String getAluno() {
		return aluno;
	}
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(aluno, cpf, idade);
	}

	@Override
	public String toString() {
		return "Pessoa [aluno=" + aluno + ", idade=" + idade + ", cpf=" + cpf + "]";
	}

}
