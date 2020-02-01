package RestApiPractice;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CheckBasicPreemptiveAuthentication {
	
	@Test
	
	public void tryAuthentication() {
		
		
		Response resp = given().auth()
				.preemptive()
				.basic("ToolsQA", "TestPassword")
				.get("http://restpi.demoqa.com/" + "authentication/Check");
		resp.then().log().all();
	}

}
