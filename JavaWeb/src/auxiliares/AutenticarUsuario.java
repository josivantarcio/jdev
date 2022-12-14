package auxiliares;

import interfaces.PermitirAcesso;

public class AutenticarUsuario {
	
	/*chaves de interfaces*/
	public boolean chave(PermitirAcesso acesso) {
		return acesso.autenticar();
		
	}
	
}
