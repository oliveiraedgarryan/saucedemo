package aula.formulario.login;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
	@Test
	public void testLogin(){
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(" file:///C:/Users/Tatiana/Desktop/022023_aula_ui/index.html");
		driver.findElement(By.id("usuario")).sendKeys("E2E treinamentos");
		driver.findElement(By.name("senha")).sendKeys("senhaE2E");
		driver.manage().window().maximize();
		driver.findElement(By.id("Login"));
		driver.quit();
		
	}

}
