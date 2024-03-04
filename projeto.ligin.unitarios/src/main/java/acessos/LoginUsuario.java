package acessos;

public class LoginUsuario {

	private static String usuario = "admin";
	private static String senha = "123456";
	
	
	public static String login (String username,String password) {
		
		if (username == null || username.isEmpty()) {
			return "Usuario deve ser preenchido";
		}
	
		if (!username.equals(usuario)) {
			return "Username invalido";
		}
		if (!username.equals(usuario)) {
			return "Username invalido";
		}
		
		if (!password.equals(senha)) {
			return "Senha invalido";
		}
		
		return "login realizado com sucesso ";
	}

}
