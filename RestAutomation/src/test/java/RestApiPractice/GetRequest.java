package RestApiPractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {

	@Test 
		public void fetchdata() {
			Response resp = RestAssured.get("http://localhost:3000/posts");
			
			int statuscode = resp.getStatusCode();
			System.out.println("Status code is:" + statuscode);
			
			String responseInString = resp.asString();
			
			System.out.println("Complete Respose:" + responseInString);
			
			String contentType = resp.getContentType();
			
			System.out.println("Contenttype is:" + contentType);
		}
		
	}
	


