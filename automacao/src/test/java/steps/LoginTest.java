package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;
import runner.Navegadores;

public class LoginTest {

	Elementos el = new Elementos();
	Metodos metodo= new Metodos();
	
	String usuario = "standard_user";
	String senha = "secret_sauce";
	String titulo ="Swag Labs";

	
	@Before
	public void abrirNavegador() {
		Navegadores.abrirNavegador();
		
	}
	@After
	public void fecharNavegador() {
		Navegadores.fecharNavegador();
	
	}
	
	//@Test
	public void loginValido() {
		metodo.escrever(el.usuario, usuario);
		metodo.escrever(el.senha,senha );
		metodo.clicar(el.btmLogin);
		metodo.validarTitulo(titulo);
		
	}

	
}
