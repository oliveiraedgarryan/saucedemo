package navagadores;


import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;


/**
 * Class responsável por criar a conexão e configuração do navegador
 * 
 * @param Navegadores
 * @author Edgar Ryan
 */
public class Navegadores  extends DriversFactory{
	
	
	
	public static void abrirNavegador() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();
		
		
		
	}
	
	
	public static void fecharNavegador() {
		driver.quit();
		
		
	}

	

}
