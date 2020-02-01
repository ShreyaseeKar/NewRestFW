package RestApiPractice;

    import org.json.simple.JSONObject;
	import org.testng.annotations.Test;

	import io.restassured.RestAssured;
	import io.restassured.http.ContentType;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

	public class PatchRequest {
		
	
		@Test
		
		public void addData()
		{
			RequestSpecification req = RestAssured.given();
			
			JSONObject jobj = new JSONObject();
			jobj.put("id", 73);
			jobj.put("author", "Krishna");
			jobj.put("title", "TestLead");
			
			String jobjInJson = JSONObject.toJSONString(jobj);
			
			req.body(jobjInJson);
			req.contentType(ContentType.JSON);
			
			Response resp = req.patch("http://localhost:3000/posts/45");
			
			int statuscode = resp.getStatusCode();
			System.out.println("Status code is:" + statuscode);
			
			String responseInString = resp.asString();
			
			System.out.println("Complete Respose:" + responseInString);
			
			String contentType = resp.getContentType();
			
			System.out.println("Contenttype is:" + contentType);
			
			
			
			
		}

	}

	
