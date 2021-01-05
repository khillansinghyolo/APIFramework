package org.testing.TestScripts;

import static com.jayway.restassured.RestAssured.*; 

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.TestSteps.HttpMethods;
import org.testing.Utilities.LoadProperties;

import com.jayway.restassured.response.Response;

public class TC4_Put_Request {
	
	public void tc4_Put_Request() throws IOException
	{
		JSONObject json=new JSONObject();
		json.put("firstname", "ShivSankar");
		json.put("lastname", "Singh");
		json.put("age", "35");
		json.put("designation", "Manager");
		json.put("id" ,TC1_Post_Request.idValue );
		
		Properties pr=LoadProperties.properties("../WizdomAPI.com/src/test/java/org/testing/Utilities/URI.properties");
		HttpMethods http=new HttpMethods(pr);
	Response res=	http.put_Request(json.toString(), "QA_URI",TC1_Post_Request.idValue);
		
	}
	

}
