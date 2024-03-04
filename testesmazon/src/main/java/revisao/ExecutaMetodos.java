package revisao;

public class ExecutaMetodos {

	public static void  main(String [] args ) {
		
		RevisandoMetodos rMetodos = new RevisandoMetodos();
	
		MetodoComRetorno mcRetorno = new MetodoComRetorno();
	
	
		//rMetodos.mensagem () ;
		//rMetodos.outraMensagem("voce vai vencer ");
	
		
		mcRetorno.outraMensagem("Hoje sera o dia mais produtivo da minha vida");
		System.out.println(mcRetorno.mensagem());
	
		int valor = mcRetorno.soma(10,10 );
		System.out.println(valor);
		
	
	}
	}

