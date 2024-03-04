package acessos;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginUsuarioTest {

	@Test
	public void LoginComSucesso() {
		
		String user = "admin";
		String password = "123456";
		String msgEsperada = "Login realizado com sucesso ";
		String resultado = LoginUsuario.login(user, password);
		assertEquals(msgEsperada,resultado);

	}
	@Test
	public void UsuarioVazio() {
		
		String user = "";
		String password = "123456";
		String msgEsperada = "Login realizado com sucesso ";
		String resultado = LoginUsuario.login(user, password);
		assertEquals(msgEsperada,resultado);

	}

}
