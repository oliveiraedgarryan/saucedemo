package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.HomePage;
import runner.Navegadores;

public class LoginTeste {
	
	
	
	HomePage home = new HomePage();
	
	String password = "secret_sauce";
	String username = "standard_user";
	
	
	
	@Before
	public void iniciarTeste() {
		Navegadores.abrirNavegador();
		
	}
	@After 
	public void depoisDosTeste() {
		Navegadores.fecharNavegador();
	}
	
	@Test
	public void loginComSucesso(){
		home.login(username,password ,"Swag Labs");
		
		
	}
	
	
	
	@Test
	public void usuarioEmBranco() {
		home.login("",password,"Epic sadface: Username is required");
		
	}
	@Test
	public void senhaEmBranco() {
		home.login(username, "","Epic sadface: Password is required");
		
	}

}
