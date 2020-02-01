package RestApiPractice;

import static io.restassured.RestAssured.get;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TofetchAllCountrycode {
	
@Test
	
	public void fetchcountrycode() {
		
		
		Response resp = get("https://restcountries.eu/rest/v2/all");
		
		//Fetch all countries codes in object
		
		
		//ArrayList <Object> obj = resp.jsonPath().get("currencies.code");
		
		//To fetch the specific country code
		
		ArrayList <Object> obj = resp.jsonPath().get("currencies.code[5]");
		
		for (Object o: obj) {
			System.out.println(o);
			
		}

}




}