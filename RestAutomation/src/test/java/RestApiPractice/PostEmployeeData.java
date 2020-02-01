package RestApiPractice;



import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;




public class PostEmployeeData {
	@Test
	
	public void addEmpData()
	{
		
		RequestSpecification reqPreCond = given();
		
		JSONObject jobj = new JSONObject();
		
		jobj.put("name", "Maa");
		
		jobj.put("saary", "100000");
		
		jobj.put("age", "17");
		
		String jsonData =JSONObject.toJSONString(jobj);
		
		reqPreCond.body(jsonData);
		reqPreCond.contentType(ContentType.JSON);
		
		
		RequestSender sender = reqPreCond.when();
		
		Response resp =sender.post("http://dummy.restapiexample.com/api/v1/create");
		
		
		ValidatableResponse reqPostcond = resp.then();
		
		reqPostcond.log().all(); 
		
		
		
		
		
		
		
	}
	

}
