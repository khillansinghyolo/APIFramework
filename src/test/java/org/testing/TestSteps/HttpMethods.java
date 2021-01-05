package org.testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class HttpMethods {
	Properties pr;
	
	public HttpMethods(Properties pr)
	{
		this.pr=pr;
	}
	public Response post_Request(String body,String URIKey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.post(pr.getProperty(URIKey));
         System.out.println("Post method called successfully");		
		return res;
		
	}
	public Response  get_Request(String uriKey ,String idValue)
	{
		String uri=pr.getProperty("QA_URI")+"/"+idValue;
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		System.out.println("status code :"+res.statusCode());
		System.out.println("data :"+res.asString());
		return res;
	}
	public Response get_Request(String uri)
	{
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(uri));
		System.out.println("All data using get method ");
		return res;
	}
    public  Response put_Request(String body,String uriKey,String idValue)
   {
    	String uri=pr.getProperty("QA_URI")+"/"+idValue;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(body)
				.when()
				.put(pr.getProperty(uri));
		
		return res;
    	
	}
}
