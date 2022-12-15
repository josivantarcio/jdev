package entidades;

import java.util.Date;
import java.util.Objects;

public abstract class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;
	private String cpf;
	private String endereco;
	private Date dataNascimento;
	private String rg;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getAluno() {
		return nome;
	}

	public void setAluno(String aluno) {
		this.nome = aluno;
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
		return Objects.hash(nome, cpf, idade);
	}

	@Override
	public String toString() {
		return "Pessoa [aluno=" + nome + ", idade=" + idade + ", cpf=" + cpf + "]";
	}

}
