package entidades;

import interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

	private String Registro;
	private String nivelCargo;
	private String Experiencia;
	private String login;
	private String senha;

	public Secretario() {
	}

	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public String getRegistro() {
		return Registro;
	}

	public void setRegistro(String registro) {
		Registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return Experiencia;
	}

	public void setExperiencia(String experiencia) {
		Experiencia = experiencia;
	}

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

	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("1234");
	}

	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}

}
