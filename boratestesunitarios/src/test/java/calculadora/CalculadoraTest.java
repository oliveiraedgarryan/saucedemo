package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	
	 Calculadora calc = new Calculadora();
			 
	@Test
	public void testSoma() {
		calc.soma(10, 5);
		
		// vamos usar o junit atraves do metodo assertEquals 
		assertEquals(15, calc.soma(5, 10));
	}
	public void testsubtraçao() {
		calc.subtraçao(10, 5);
		
		// vamos usar o junit atraves do metodo assertEquals 
		assertEquals(0, calc.subtraçao(5, 10));
	}


}
