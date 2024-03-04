package elementos;

import org.openqa.selenium.By;

/**
 * Class responsavel por armazenar elementos web
 * 
 * @param elemento
 * @author Edgar Ryan
 */

public class Elementos {

	// Esse By guarda o elemento para acessar a aba Alerts
	public static By alerts = By.xpath("//div[@class='element-list collapse show']//li[2]");

	// Aqui estão os elementos para acessar os botoês click
	public static By click1 = By.xpath("//button[@id='alertButton']");
	public static By click2 = By.xpath("//button[@id='timerAlertButton']");
	public static By click3 = By.xpath("//button[@id='confirmButton']");
	public static By click4 = By.xpath("//button[@id='promtButton']");

	// Aqui estão as mensagens exibidas após clicar nos botoês 3 e 4
	public static By msgBt3 = By.xpath("//span[@id='confirmResult']");
	public static By msgbt4 = By.xpath("//span[@id='promptResult']");

}
