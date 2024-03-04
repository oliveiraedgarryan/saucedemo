package runeer;

import org.openqa.selenium.edge.EdgeDriver;

import drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navegadores extends Drivers {
	
	public static void abrirNavegador(){	
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
	}

}
