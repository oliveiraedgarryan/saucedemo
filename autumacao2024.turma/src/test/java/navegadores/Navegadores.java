package navegadores;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import drivers.DriversFactory;

public class Navegadores extends DriversFactory {
	
	/**
	 * Abrir navegador chrome
	 * @author Edgar Ryan
	 * 
	 * 
	 */
	 
	public static void iniciarTeste() {
		String ambiente ="https://demoqa.com";
		
		try {
			driver = new ChromeDriver();
			driver.get(ambiente);
			driver.manage().window().maximize();
			
		} catch (Exception e) {
			System.err.println("Causa do erro " + e.getCause());
			
		}
	}




}
