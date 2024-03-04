package metodos;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento,String texto) {
		driver.findElement(null).sendKeys(null);

	}



	public void validarTexto() {

	}
	

	public void clicarPorTexto(String atributo,String texto) {
		driver.findElement(By.xpath("//"+atributo+"[text()='"+texto+"']")).click();
		
	}
}
