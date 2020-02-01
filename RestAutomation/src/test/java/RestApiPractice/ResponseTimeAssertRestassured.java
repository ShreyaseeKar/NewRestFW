package RestApiPractice;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ResponseTimeAssertRestassured {
	
	
		@Test
		public void assertionTestForRespTime() {
			
			
			Response resp = given()
			.param("userId", "7")
			.param("id", "64")
			.pathParam("X", "posts")
			.when()
			.get("https://jsonplaceholder.typicode.com" + "/{X}");
			
			resp.then().assertThat().time(Matchers.lessThan(3000L));
			
			//resp.then().assertThat().time(Matchers.greaterThan(1000L));
			
			
			
			long actTimeInMS = resp.time();
			//Assert.assertTrue(actTimeInMS < 3500);
			
			long actTimeInSec = resp.timeIn(TimeUnit.SECONDS);
			//Assert.assertTrue(actTimeInSec < 5);
			
			System.out.println("Time in MS:" +actTimeInMS);
			System.out.println("Time in Sec:" +actTimeInSec);
			
		}	
	}

