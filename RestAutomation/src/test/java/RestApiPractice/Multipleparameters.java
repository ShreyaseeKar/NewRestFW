package RestApiPractice;

    import org.testng.annotations.Test;

	import io.restassured.response.Response;

	import static io.restassured.RestAssured.*;
	public class Multipleparameters {
		
		@Test
		
		public void checkparameter()
		{
			//Response resp = get ("https:://jsonplaceholder.typicode.com/posts?userId=7");
			
			//resp.then().log().all();
			
			given()
			.param("userId", "7")
			.param("id", "64")
			.when()
			.get("https://jsonplaceholder.typicode.com/posts")
			.then()
			.log().all();
			
			
			
			
		}

	}


