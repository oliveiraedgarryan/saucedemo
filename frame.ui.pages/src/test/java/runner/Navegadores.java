package runner;


 
import org.openqa.selenium.edge.EdgeDriver;
import driver.Driverfactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navegadores extends Driverfactory {
	
	
	public static void abrirNavegador () {
		WebDriverManager.edgedriver().setup(); 
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
	}

	public static void fecharNavegador() {
		driver.close();
		
	}
	
	

	

}
