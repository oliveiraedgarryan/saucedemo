package runner;

import org.openqa.selenium.edge.EdgeDriver;

import drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Navegadores extends Drivers {
	
	public static void  abrirNavegador() {
		// criar uma validaçao do chrome ou firefox
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
	}
	
	public static void fecharNavegador() {
		driver.close();
	}

}
