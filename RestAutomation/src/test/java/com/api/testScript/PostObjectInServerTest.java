package com.api.testScript;

	
	import org.testng.annotations.Test;

	import com.api.rootRepo.RootClass;

	import io.restassured.response.Response;

	public class PostObjectInServerTest extends RootClass {
	   @Test
	   public void createData() {
	  String apiData = config.getPropertyObject("createPost");
	  Response resp = config.executeRequest(apiData);
	  resp.then().log().all();
	   }
	}



