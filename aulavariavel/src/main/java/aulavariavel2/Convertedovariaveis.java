package aulavariavel2;

public class Convertedovariaveis {

	public static void main(String[] args) {
		// Conversão de int para String:
		int  numero = 123;
		String numeroEmString=
		Integer.toString(numero);
		System.out.println(numeroEmString + 1);
		
		//Coversão de String para int:
		String numero1EmString = "123";
		int numero1 = Integer.parseInt(numeroEmString);
		System.out.println(numero1 + 1);
		
		// Coversão de double para int :
		double numeroDouble = 3.14 ;
		int numeroInteiro = (int) numeroDouble;
		System.out.println(numeroInteiro);

	}
	
	
}
