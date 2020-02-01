package RestApiPractice;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicChallangingAuthentication {
	
	
		
		@Test
		
		public void tryAuthentication() {
			
			
			Response resp = given()
					.auth()
					
					.basic("ToolsQA", "TestPassword")
					.get("http://restpi.demoqa.com/" + "authentication/Check");
			resp.then().log().all();

}
}
