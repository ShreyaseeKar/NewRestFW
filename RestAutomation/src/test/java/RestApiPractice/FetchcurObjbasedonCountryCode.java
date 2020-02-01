package RestApiPractice;

import static io.restassured.RestAssured.get;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class FetchcurObjbasedonCountryCode {
	
	@Test
	
	public void fetch()
	{
		Response resp = get("https://restcountries.eu/rest/v2/all");
		String expCode = "[INR]";
		
		ArrayList<Object> obj =resp.jsonPath().get("currencies.code");
		
		System.out.println(obj.size());
		
		ArrayList<String> stringList = convertToStringlist(obj);
		
		Object currancyObj = getCurrancyObj(expCode, stringList, resp);
		
		System.out.println(currancyObj);
		
		
	}
    public ArrayList<String> convertToStringlist (ArrayList<Object> lst)
    
    {
    	
    	ArrayList<String> l= new ArrayList<String>();
    	for (Object o : lst)
    		
    		
    	{
    		String str =o.toString();
    		l.add(str);
    	}
    	return l;
    	
    	
    	}
    
    public Object getCurrancyObj (String CountryCode,  ArrayList<String> lst, Response resp)
    
    {
    	
    	Object reqCurrency = null;
    	
    	int count =0;
    	
    	for (String str: lst) {
    		
    		if (str.contentEquals(CountryCode)) {
    			
    			reqCurrency =resp.jsonPath().get("currencies["  + count+"]");
    		}
    		
    		count++;
    	}
    	
    	if (reqCurrency == null)
    	{
    		throw new RuntimeException ("Country code invalid!!!");
    	}
    	
    	return reqCurrency;
    }
    }

