package RestApiPractice;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class AssertTestAllheaders {
	
	@Test
	public void assertionTestForRespTime() {
		
		
		Response resp = given()
		.param("userId", "7")
		.param("id", "64")
		.pathParam("X", "posts")
		.when()
		.get("https://jsonplaceholder.typicode.com" + "/{X}");
		resp.then().assertThat().statusCode(200);
		
		resp.then().assertThat().contentType(ContentType.JSON);
		
		//To fetch all headers
		
		Headers headers =resp.getHeaders();
		System.out.println(headers);
		
		System.out.println("+++++++++++++++++++++++++++++");
		
		//To fetch specific headre
		
		String contype  =resp.getHeader("Content-Type");
		System.out.println(contype);
		
		
		//To fetch only Body
		
		
		System.out.println(resp.asString());
		
		
		
		
		
		

}
}
