package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import io.restassured.response.Response;

public class ValidarStatusCode {
		
	Response response;	
	
	@Test
	public void testeValidarStatusCode() {
		
		response = RestAssured.get("https://dadosabertos.camara.leg.br/api/v2/blocos");
		assertEquals(200, response.getStatusCode());
		System.out.println(response.asPrettyString());
		
		
	}
	@Test
	public void testeDeletar() {
		response = RestAssured.delete("https://reqres.in/api/users/2");
		assertEquals(204, response.getStatusCode());
		System.out.println(response.getStatusCode());
		
	}
	

}
