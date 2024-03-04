package metodos;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import drivers.Drivers;

public class Metodos extends Drivers {
	// ex: como inspeciona com WebElement

	public void escrever(WebElement elemento, String texto) {
		elemento.sendKeys(texto);

	}
	@Before
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}
	@After
	public void clicar(WebElement elemento) {
		elemento.click();

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void validarTitulo(String tituloEsperado) {
		assertEquals(tituloEsperado,driver.getTitle());

	}
	public void validarTexto(By elemento,String textoEsperado) {
	String textoCapturado = driver.findElement(elemento).getText();
	assertEquals(textoEsperado, textoCapturado);

	}

}
