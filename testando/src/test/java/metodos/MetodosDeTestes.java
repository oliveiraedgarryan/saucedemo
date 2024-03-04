package metodos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import navegadores.Drivers;

public class MetodosDeTestes extends Drivers {

//	Método responsásvel por abrir o navegador
	@Test
	public void abirNavegador() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com.br");
		
	}
// Método responsásvel por escrever
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}
//	Método responsásvel por dar um submit
	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}
//	Método responsásvel por clicar
	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}
//	Método responsásvel por Validar  texto desejado
	public void validarTexto(By elemento, String textoEsperado) {
		assertEquals(textoEsperado, driver.findElement(elemento).getText());

	}
//	Método responsásvel por fechar o navegador
	public void fecharNavegador() {

		driver.quit();

	}
}
