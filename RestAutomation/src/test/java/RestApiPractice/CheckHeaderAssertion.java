package RestApiPractice;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CheckHeaderAssertion {
	
	@Test
	public void assertionTest() {
		
		
		Response resp = given()
		.param("userId", "7")
		.param("id", "64")
		.pathParam("X", "posts")
		.when()
		.get("https://jsonplaceholder.typicode.com" + "/{X}");
		int actStatusCode = resp.getStatusCode();
		Assert.assertEquals(actStatusCode, 200);
		
		String actContentType = resp.getContentType();
		//system.out.println(actContentType);
		Assert.assertEquals(actContentType, "application/json; charset=utf-8");
		resp.then().log().all();
		
		
	}

}
