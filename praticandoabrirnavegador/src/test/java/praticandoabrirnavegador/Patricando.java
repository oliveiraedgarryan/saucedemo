package praticandoabrirnavegador;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Patricando {
	
	WebDriver driver;
	
	String userName ="standard_user";
	String password ="secret_sauce";
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void AbrirNavagador () {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");

		
		
	}

}
