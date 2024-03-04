package metodos;


import static org.junit.jupiter.api.Assertions.assertEquals;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import drivers.DriversFactory;



/**
 * Class responsável por estrurar os metodos que serão utilizados
 * 
 * @param Metodos
 * @author Edgar Ryan
 */

public class Metodos extends DriversFactory {

	public static void escrever(By elemnto,String texto) {
		driver.findElement(elemnto).sendKeys(texto);

	}

	public static void clicar(By elemento) {
		driver.findElement(elemento).click();

	}
	public static void clicarPorTexto(String atributo,String texto) {
		driver.findElement(By.xpath("//"+atributo+"[text()='"+texto+"']")).click();
		
	}

	public static void validarTexto(By elemento,String textoEsperado) {
	
		assertEquals(textoEsperado, driver.findElement(elemento).getText());

	}

	public static void validarTitle(String titleEsperado) {
		
		assertEquals(titleEsperado, driver.getTitle());

	}
	
	public static void validarMsgAlert(String msgEsperada) {
	 String msgAlert = driver.switchTo().alert().getText();
	 assertTrue(msgAlert.contains(msgEsperada));
	
	}
	
	public static void clicarAlert() {
		Alert alert =driver.switchTo().alert();
		alert.accept();
		
	}
	public static void pausa() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	public static void escreverNoAlert(String nome) {
		Alert alert =driver.switchTo().alert();
		alert.sendKeys(nome);
		
	}
	
}
