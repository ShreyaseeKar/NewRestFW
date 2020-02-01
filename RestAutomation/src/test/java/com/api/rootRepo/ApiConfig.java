package com.api.rootRepo;


	import java.io.FileInputStream;
	import java.util.Properties;

	import org.json.simple.JSONObject;

	import io.restassured.RestAssured;
	import io.restassured.http.ContentType;
	import io.restassured.response.Response;

	public class ApiConfig {
	  Properties pobj = new Properties();
	  Response resp;
	  String[] keyvalue;
	 
	  public String getPropertyObject (String key)
	  {
	 try {
	 FileInputStream file = new FileInputStream ("./apiList.properties");
	 pobj.load(file);
	 } catch (Exception e)
	 {
	 e.printStackTrace();
	 }
	      return pobj.getProperty(key);
	  }
	 
	 public Response executeRequest (String apiData)
	 {
	String[] arr = apiData.split(";");
	if (arr[0].equals ("get"))
	{
	resp = RestAssured.given()

			.formParam("userId", "7")
	         .when()
	         .get(arr[1]);
	} else if(arr[0].equals ("post"))
	{
	String postobj = createJsonObject(arr[2]);
	resp = RestAssured.given()
	         .contentType(ContentType.JSON)
	         .body (postobj)
	         .when()
	         .post(arr[1]);
	} else if (arr[0].equals ("patch"))
	{
	String postobj = createJsonObject(arr[2]);
	resp = RestAssured.given()
	         .contentType(ContentType.JSON)
	         .body(postobj)
	         .when()
	         .patch(arr[1]);
	         
	} else if (arr[0].equals("put"))
	{
	String postobj = createJsonObject(arr[2]);
	resp = RestAssured.given()
	         .contentType(ContentType.JSON)
	         .body(postobj)
	         .when()
	         .put(arr[1]);
	} else if (arr[0].equals("delete"))
	{
	resp = RestAssured.delete(arr[1]);
	}
	  return resp;
	 }
	 
	   public String createJsonObject (String data)
	   {
	  JSONObject jobj = new JSONObject();
	  String[] arrJsonData = data.split(",");
	  for (int i=0; i<arrJsonData.length; i++)
	  {
	  keyvalue = arrJsonData[i].split(":");
	  jobj.put(keyvalue[0], keyvalue[1]);
	  }
	  return jobj.toJSONString();
	   }
	}



