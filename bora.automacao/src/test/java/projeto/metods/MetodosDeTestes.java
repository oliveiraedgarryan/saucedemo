package projeto.metods;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import projeto.factory.Drivers;

public class MetodosDeTestes extends Drivers {

	
	@Test
	public void validarTitle(String tituloEsperado) {
		assertEquals(driver.getTitle(), tituloEsperado);
		
	}

	
	public static void print() {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	}
	
}