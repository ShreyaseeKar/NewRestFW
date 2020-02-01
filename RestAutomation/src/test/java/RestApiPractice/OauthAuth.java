package RestApiPractice;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class OauthAuth {

	@Test
	public void tokenBaseAuth() {
		
		given()
		.auth()
		.oauth2("TokenID")
		.get("URI");
	}
	
	public String 
	getToken() {
		Response resp = given().auth()
				.preemptive()
				.basic("ToolsQA", "TestPassword")
				.get("http://restpi.demoqa.com/" + "authentication/Check");
		
		
		Object obj =resp.jsonPath().get("Fault");
		
		String s = obj.toString();
		return s;
	}
}
