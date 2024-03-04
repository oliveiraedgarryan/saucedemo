package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	// Método responsável por guardar os elementos usados durante a automação
	
		public By buscar = By.id("twotabsearchtextbox");
		public By produto = By.xpath("//span[text()='Smartphone Positivo Twist 5 Pro S640, 2GB 64GB, Tela Notch de 6.26” - BLACK RUBBER']");
		public By addCart = By.id("add-to-cart-button");
		public By msgAdicionado = By.xpath("//span[contains(text(),'Adicionado ao carrinho')]");

	

}
