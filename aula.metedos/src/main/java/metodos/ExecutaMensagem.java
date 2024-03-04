package metodos;

public class ExecutaMensagem {
	
	public static void  main(String [] args ) {
		BomDia dia = new BomDia();
			dia.mensagemDia();
		
		BoaTarde tarde = new BoaTarde();
			tarde.mensagenTarde();
			
		BoaNoite noite = new BoaNoite();
			noite.mensagemNoite();
	}
	

}
