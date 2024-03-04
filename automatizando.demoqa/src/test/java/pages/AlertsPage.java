package pages;



import org.openqa.selenium.By;



/**
 * Class responsável por estrurar as ações  utilizadas na Page Alerts
 * 
 * @param Alerts Page
 * @author Edgar Ryan
 */

import metodos.Metodos;

public class AlertsPage {
	
	
	
	
		public static void escolherCard(String card) {
			Metodos.clicarPorTexto("h5",card );
			
			
		}
		
		public static void escolherAba(By elemento) {
			Metodos.clicar(elemento);
			
		}
		public static void escolherBotao(By elemento) {
			Metodos.clicar(elemento);
			
		}
		
		public static void validarTexto(By elemento,String textoEsperado) {
			Metodos.validarTexto(elemento, textoEsperado);
			
			
		}
		public static void validarTitle(String tituloEsperado) {
			Metodos.validarTitle(tituloEsperado);
			
			
		}
		public static void textAlert(String msgEsperada) {
			Metodos.validarMsgAlert(msgEsperada);
			
			
		}
		public static void pausaAlert() throws InterruptedException {
			Metodos.pausa();
			
		}
		public static void escreverAlert(String nome) {
			Metodos.escreverNoAlert(nome);
		}
		
		
		
		
		
		
		
		
	

	
}
