package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import drivers.DriversFactory;

public class MetodosDeTestes extends DriversFactory {

	/**
	 * Clicar em um elemento usando BY
	 * 
	 * @param elemento
	 * @param passo
	 * @author Edgar Ryan
	 */

	public static void clicar(By elemento, String passo) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("Erro ao clicar no elemento " + passo);
			System.err.println("Causa do erro " + e.getCause());
			System.err.println("Mensagem de erro " + e.getMessage());

		}
		driver.findElement(elemento).click();

	}

	/**
	 * Clicar em um elemento utilizando WebElement
	 * 
	 * @param elemento
	 * @param passo
	 * @author Edgar Ryan
	 */

	public static void clicar(WebElement elemento, String passo) {
		try {
			elemento.click();
		} catch (Exception e) {
			
			System.err.println("Causa do erro " + e.getCause());
			System.err.println("Mensagem de erro " + e.getMessage());

		}
	}
	
		/**
		 * Clicar em um elemento utlizando o texto igual ao html
		 * 
		 * @param elemento
		 * @param atributo
		 * @author Edgar Ryan
		 */
			

	public static void clicarPorTexto(String atributo, String card) {
		try {
			driver.findElement(By.xpath("//"+atributo+"[text()= '"+card+"']")).click();
		} catch (Exception e) {
			
			System.err.println("Causa do erro " + e.getCause());
			System.err.println("Mensagem de erro " + e.getMessage());
			
		}
	}
}
