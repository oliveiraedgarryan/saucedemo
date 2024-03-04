package pages;


import org.openqa.selenium.By;

import metodos.Metodos;


public class HomePage {
	
	Metodos metodo = new Metodos();
	
	
	// By é uma classe do selenium para guardar elementos web 
	
	/*By senha ;  
	By usuario;
	By btnLogin;
	By msgErro;
	*/
	
	
	public By usuario = By.id("user-name");
	public By senha = By.id("password");
	public By btnLogin = By.id("login-button");
	public By msgErro = By.xpath("//h3[@data-test='error']");
	public By titulo = By.xpath("//div[@class='app_logo']");
	
	
	

	public void login (String usuario ,String senha ,String texto ) {
		metodo.escrever(this.usuario,usuario);
		metodo.escrever(this.senha,senha);
		metodo.clicar(btnLogin);
		metodo.validarTexto(msgErro,texto);
		metodo.validarTitulo("Swag Labs");
	}

	
}
