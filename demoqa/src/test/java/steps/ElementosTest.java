package steps;

import org.junit.Before;
import org.junit.Test;

import pages.HomePages;
import runeer.Navegadores;

public class ElementosTest {

	HomePages home = new HomePages();

	//@Before
	public void setup() {
		Navegadores.abrirNavegador();
	}

	//@Test
	public void enviarUmTextBox() {
		home.selecionarMenu("Elements");

	}
	
	//@Test
	public void clicarEmForms() {
		home.selecionarMenu("Forms");
	}
	//@Test
	public void clicarEmAlertsFrameWindows() {
		home.selecionarMenu("Alerts, Frame & Windows");
	}
	//@Test
	public void clicarEmWidgets() {
		home.selecionarMenu("Widgets");
	}
	
	
	

}
