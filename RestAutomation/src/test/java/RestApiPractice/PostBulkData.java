package RestApiPractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostBulkData {
	
	@Test
	public void addBulkDaata() {
		
		RequestSpecification req = RestAssured.given();
	
		JSONObject jobj1 = new JSONObject();
		
		jobj1.put("java", 75);
		jobj1.put("SQL", 80);
		jobj1.put("API", 90);
		
		JSONObject jobj2 = new JSONObject();
		
		
		jobj2.put("name", "Shreya");
		jobj2.put("subject", jobj1);
		jobj2.put("status", "pass");
		
		
		JSONObject jobj3 = new JSONObject();
		
		jobj3.put("student", jobj2);
		
String jobjInJson = JSONObject.toJSONString(jobj3);
		
		req.body(jobjInJson);
		req.contentType(ContentType.JSON);
		
		Response resp = req.post("http://localhost:3000/posts");
		
		int statuscode = resp.getStatusCode();
		System.out.println("Status code is:" + statuscode);
		
		String responseInString = resp.asString();
		
		System.out.println("Complete Respose:" + responseInString);
		
		String contentType = resp.getContentType();
		
		System.out.println("Contenttype is:" + contentType);
		
		
		
	}
	}


