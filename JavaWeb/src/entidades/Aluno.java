package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import constantes.StatusAluno;

public class Aluno extends Pessoa{
	
	private String dataMatricula;
	private String nomeEscola;
	private String disciplina;
	
	private List<Disciplina> disciplinas = new ArrayList<>();
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public double media(){
		double soma = 0;
		for(Disciplina disciplina : disciplinas) {
			soma += disciplina.getNotaDisciplina();
		}
		return soma / disciplinas.size();
	}
	
	public boolean situacao() {
		if(media() > 7) {
			return true;
		}
		return false;
	}
	
	public String situacao2() {
		if(media() > 7) {
			return StatusAluno.APROVADO;
		}else if(media() > 5) {
			return StatusAluno.RECUPERACAO;
		}
		return StatusAluno.REPROVADO;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(dataMatricula, disciplina, nomeEscola);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula) && Objects.equals(disciplina, other.disciplina)
				&& Objects.equals(nomeEscola, other.nomeEscola);
	}
	
	

}
