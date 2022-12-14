package entidades;

public class Diretor extends Pessoa{

	private String registroEducacao;
	private String Titularizacao;
	
	private String login;
	private String senha;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public String getTitularizacao() {
		return Titularizacao;
	}
	public void setTitularizacao(String titularizacao) {
		Titularizacao = titularizacao;
	}
	
	
}
