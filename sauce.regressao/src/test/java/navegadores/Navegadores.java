package navegadores;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;

public class Navegadores extends Drivers{

	public void abrirNavegador() {
		driver = new ChromeDriver();
		driver.get("demoqa.com");
	}

}
