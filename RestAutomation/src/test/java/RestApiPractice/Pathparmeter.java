package RestApiPractice;


	
	import org.testng.annotations.Test;

	import io.restassured.response.Response;

	import static io.restassured.RestAssured.*;
	public class Pathparmeter {
		
		@Test
		
		public void checkparameter()
		{
			//Response resp = get ("https:://jsonplaceholder.typicode.com/posts?userId=7");
			
			//resp.then().log().all();
			
			given()
			.param("userId", "7")
			.param("id", "64")
			.pathParam("X", "posts")
			.when()
			.get("https://jsonplaceholder.typicode.com" + "/{X}")
			.then()
			.log().all();
			
			
			
			
		}

	}





