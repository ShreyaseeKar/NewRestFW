package RestApiPractice;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class FetchAllCurenInobject {
	
	@Test
	
	public void checkCurrencyObj() {
		
		
		Response resp = get("https://restcountries.eu/rest/v2/all");
		
		//Fetch all countries codes in object
		
		
		ArrayList <Object> obj = resp.jsonPath().get("currencies.code");
		
		for (Object o: obj) {
			System.out.println(o);
			
		}
		
		System.out.println("+++++++++++++++++++++++++");
		
		
		Object obj1 = resp.jsonPath().get("currencies.code[0]");
		
		System.out.println("First code is:" + obj1);
		
		Object obj2 =resp.jsonPath().get("currencies.code[3]");
		System.out.println("Fourth code is:" + obj2);
		
			
		}
	}
	


