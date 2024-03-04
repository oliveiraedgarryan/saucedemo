package tests;



import org.junit.jupiter.api.Test;

import navegadores.Navegadores;
import pages.HomePage;

public class PreencherFormularioTest {
	
	HomePage home = new HomePage();
	

	@Test
	public  void enviarFormulario() {
		Navegadores.iniciarTeste();
		home.escolherCard("Elements");
		
		
		
		
	}
}
