package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidarAutomacao {
	
	WebDriver driver;
	
	@Test
	public void abrirPaginaTeste() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Tatiana/Desktop/index.html");
		String titulo = driver.getTitle();
		assertEquals(" E2E treinamentos - Formulario ", titulo);
		assertTrue(titulo.equalsIgnoreCase(titulo));
		
	}

}
