package pages;

import metodos.Metodos;

public class HomePages {
	
	Metodos metodo = new Metodos();

	public void seleniumTraining() {

	}
	/*Método responsásel por clicar usando o primeiro atributo do código html mais 
	 * o texto desejado,Usar o texto exatamente igual ao html
	 * @autor oliveiraedgarryan83@gmail.com
	 * @param atributo
	 * @param texto
	 */
	public void selecionarMenu(String menu) {
		metodo.clicarPorTexto("h5",menu);

	}

}
