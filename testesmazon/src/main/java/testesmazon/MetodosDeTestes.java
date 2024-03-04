package testesmazon;

public class MetodosDeTestes {
	//Modificadores de acesso 
	
	//public - qualquer class pode acessar
	//protected - class do mesmo pacote ou com herança com pacotes diferentes 
	//default - apenas do mesmo pacote  
	//private - somente a mesma class 
	
	public void abrirNavegador (String navegador ) {
		String site = "https://www.amazon.com.br";
		System.out.println("Você acessou o site no " + navegador);
		
		
	}
	public void clicar (String elemento) {
		System.out.println("clicamos no elemento " + elemento);
		
	}
	
	public void escrever (String elemento,String texto) {
		System.out.println("escrevemos no elemento " + elemento + " o texto "+ texto );
	}
	
	public void tiratPrint (String nomeEvidencia) {
		System.out.println("tiramos o print  " + nomeEvidencia );
	}
	
	public void vailidarMensagem (String elemento,String mensagemEsperada) {
		System.out.println("validamos a mensagem esperada " + mensagemEsperada + "no elemento " + elemento);
	}
	
	public void fecharNavegador () {
		System.out.println("fechamos o navegador ");
		
	}
	
	public void submit (String elemento) {
		
		System.out.println("enviamos o submit no elemento  " + elemento  );
	}
	
	
}
