package org.testing.ResponseValidation;

import org.testing.Utilities.JsonParsingUsingJsonPath;

import com.jayway.restassured.response.Response;

public class ResponseValidation {

	public static void 	statusCodeValidate(int expectedStatusCode ,Response res)
	{
		if(expectedStatusCode==res.getStatusCode())
		{
			System.out.println("Matching the status code ");
		}
		else 
		{
			System.out.println("Not Matching the status code ");
			
		}
	}
	public static void dataValidation(String expectedData,Response res,String jsonpath)
	{
		if(expectedData.equals(JsonParsingUsingJsonPath.jsonParse(res, jsonpath)))
		{
			System.out.println("data matching");
		}
		else 
		{
			System.out.println("data is not matching ");
		}
		
	}
}
