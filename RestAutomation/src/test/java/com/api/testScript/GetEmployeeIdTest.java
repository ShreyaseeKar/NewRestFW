package com.api.testScript;


	
	import org.testng.annotations.Test;

	import com.api.rootRepo.RootClass;

	import io.restassured.response.Response;

	public class GetEmployeeIdTest extends RootClass {
	@Test
	    public void fetchEmployeeID()
	    {
	String apiData = config.getPropertyObject("getEmployeeIDTest");
	Response resp = config.executeRequest(apiData);
	resp.then().log().all();
	    }
	}



