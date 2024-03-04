package e2ecar;

public class finaceiro {
	public static void main (String[] args ) {
	//credito / debito / pix 
	
	String tipoPagamento = "credito";
		int valorProduto = 100;
		int qtd = 1 ;
		int valorTotal = valorProduto * qtd ;
		int contaCorrente =90;
		int saldoCartaoCredito = 20000;
		int vzCartao = 4;
		int juros = (valorTotal * 15) / 100;
		
		
		if (tipoPagamento.equalsIgnoreCase("Pix")) {
			int Desconto = 10;
			 valorProduto = valorProduto - Desconto ;
			 
			if(contaCorrente >= valorTotal) {
				System.out.println("Compra aprovada!");
			}else {
				System.out.println("Compra reprovada!");
			 }
			
			
			
		} else if(tipoPagamento.equalsIgnoreCase("Credito")) {
			valorTotal = valorTotal + juros;
			if (vzCartao  <=5) {
				System.out.println("Compra parcelada em "+ vzCartao +" com 15% de juros");
				System.out.println("valor total com juros "+ valorTotal  );
			}else  {
				System.out.println("Parcelamento reprovado  ");
			}if (saldoCartaoCredito >= valorTotal ) {
				System.out.println("Compra aprovada");
			}else {
				System.out.println("Compra reprovada ");
			}
			
			
			
			
		}else if(tipoPagamento.equalsIgnoreCase("Debito")) {
			if(contaCorrente >= valorTotal) {
				System.out.println("Compra aprovada!");
			}else {
				System.out.println("Compra reprovada!");
			 }
			
			
		}else {
			System.out.println("Não aceitamos essa opção de pagamento");
			System.out.println("Somente PIX, DEBITO OU CREDITO");
		}	
	}
}
