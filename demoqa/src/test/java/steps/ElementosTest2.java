package steps;

import org.junit.Before;
import org.junit.Test;

import pages.HomePages;
import runeer.Navegadores;

public class ElementosTest2 {

	HomePages home = new HomePages();

	@Before
	public void setup() {
		Navegadores.abrirNavegador();
	}

	@Test
	public void enviarUmTextBox() {
		home.selecionarMenu("Elements");

	}

}
