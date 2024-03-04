package e2ecar;

public class LojaCarro {

	public static void main(String[] args) {
		
		boolean LojaAberta = true;
		int valorDocarro = 100;
		int qtd = 1;
		int saldoCliente = 200;
		int valorTotal = valorDocarro * qtd;
		int saldoAposcompra = valorTotal - saldoCliente;
		
		if (LojaAberta) {
			System.out.println("****** Bem vindos na E2E car *****");
			
			if(valorTotal<= saldoCliente){
				System.out.print("Parabéns pela compra ");
				
			}else {
				System.out.println("compra reprovada ");
			}
		}else {
			System.out.println("****** Loja fechada *****");
			System.out.println("****** Horario 08:00 ás 19:00 *****");
		}
		System.out.println("saldo do cliente apos compra " + saldoAposcompra );
		
		
		
		
	}

}
