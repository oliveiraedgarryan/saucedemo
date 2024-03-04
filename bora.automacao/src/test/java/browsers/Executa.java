package browsers;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import projeto.factory.Drivers;

public class Executa extends Drivers{

	
	
	public void  iniciarTest() {
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
			
	}
	
	@Test
	public void finalizarTest() {
		driver.quit();
	}
	

}
