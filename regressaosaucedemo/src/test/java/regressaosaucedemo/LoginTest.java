package regressaosaucedemo;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Element;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import drivers.DriversFactory;
import elementos.Elementos;
import io.github.bonigarcia.wdm.WebDriverManager;
import metodos.MetodosDeTest;
import navegadores.Executa;

public class LoginTest extends DriversFactory {

	MetodosDeTest metodos = new MetodosDeTest();
	Elementos el = new Elementos();

	String navegador = "Chrome";

	@Before
	public void antesDoTeste() {
		Executa.abrirNavegador();
	}

	@After
	public void loginSucesso() {
		Executa.fecharNavegador();
	}

	@Test
	public void LoginSucesso() {

		metodos.escrever(el.username, "standard_user");
		metodos.escrever(el.password, "secret_sauce");
		metodos.clicar(el.btnLogin);
		metodos.validarTexto(el.msg, "Swag Labs");
		metodos.validarTitulo("Swag Labs");
		metodos.validarUrl("https://www.saucedemo.com/inventory.html");

	}

}
