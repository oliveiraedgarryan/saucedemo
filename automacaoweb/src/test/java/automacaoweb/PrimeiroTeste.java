package automacaoweb;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	
public class PrimeiroTeste {

	@Test
	public void validarTitulo() {
		//Criar comunicação com navegador 
		WebDriver driver;
		
		
		//configurar o navegador 
		WebDriverManager.edgedriver().setup();
		
		//Receber uma nova instancia do navegador 
		driver = new EdgeDriver();
		
		//acessar site 
		driver.get("https://www.google.com.br");

		//maximar tela do navegador 
		driver.manage().window().maximize();
		
		
	}



}
