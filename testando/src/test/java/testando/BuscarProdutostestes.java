package testando;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.MetodosDeTestes;

public class BuscarProdutostestes {
	
//	ponteiro para usarmos métodos da class Métodos de Testes
	MetodosDeTestes metodo = new MetodosDeTestes();
	
//	ponteiro para usarmos métodos da class Elementos 
	Elementos el = new Elementos();
	
//	Método executado antes do teste
	@Before
	public void  abrirNavegador(){
		metodo.abirNavegador();
		
	}
	
//	Método executado depois do teste

	@After
	public void fecharNavegador(){
		metodo.fecharNavegador();
		
	}
//	Método icluir produto no carrinho

	@Test
	public void incluirProdutoNoCarrinho() {
		metodo.escrever(el.buscar,"smartphone positivo twist 5 pro");
		metodo.submit(el.buscar);
		metodo.clicar(el.produto);
		metodo.clicar(el.addCart);
		metodo.validarTexto(el.msgAdicionado,"Adicionado ao carrinho" );
	}

}
