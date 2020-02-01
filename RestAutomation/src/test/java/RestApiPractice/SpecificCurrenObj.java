package RestApiPractice;

import static io.restassured.RestAssured.get;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class SpecificCurrenObj {
	
@Test
	
	public void fetchcountrycode() {
		
		
		Response resp = get("https://restcountries.eu/rest/v2/all");
		
		//Fetch specific currencies object
		
		
		ArrayList <Object> obj = resp.jsonPath().get("currencies[0]");
		
		System.out.println(obj);
		
		
		//Fetch all currencies Object
		
		
		//ArrayList <Object> obj = resp.jsonPath().get("currencies");
		
		
		
	//	for (Object o: obj) {
		//	System.out.println(o);
			
		//}

}

}
