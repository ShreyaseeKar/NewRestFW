package com.api.testScript;

import org.testng.annotations.Test;

import com.api.rootRepo.RootClass;

import io.restassured.response.Response;

public class FetchAllCountries extends  RootClass{
	
	
	@Test
	
	public void getCountries() {
		
		String apiData = config.getPropertyObject("fetchAllDetailCountries");
		
		Response resp = config.executeRequest(apiData);
		
		resp.then().log().all();
		
		
		
	}

}
