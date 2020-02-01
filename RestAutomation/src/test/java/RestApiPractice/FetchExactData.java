package RestApiPractice;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class FetchExactData {
	
	@Test
	public void checkJsonPath()
	{
		Response resp =get ("http://localhost:3000/posts/t6CYrK0");
		
		Object obj= resp.jsonPath().get("student.status");

System.out.println("Api Marks is:" + obj);
		
		
	}
	
	

}
