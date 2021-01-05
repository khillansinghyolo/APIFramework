package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HttpMethods;
import org.testing.Utilities.JsonParsingUsingJsonPath;
import org.testing.Utilities.JsonReplacement;
import org.testing.Utilities.LoadJson;
import org.testing.Utilities.LoadProperties;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC1_Post_Request {
	static String idValue;
	@Test
	public void tc1_Post_Request() throws IOException
	{
		Random rendom=new Random();
		Integer id=rendom.nextInt();
		
		Properties pr=	LoadProperties.properties("../WizdomAPI.com/src/test/java/org/testing/Utilities/URI.properties");
		String body=LoadJson.jsonPath("../WizdomAPI.com/src/test/java/org/testing/Resources$PayLoad/body.json");
		body =JsonReplacement.jsonReplaceValueUsingJsonPath(body,"id",id.toString());
		
		HttpMethods http=new HttpMethods(pr);
		
		Response res=http.post_Request(body,"QA_URI");
		
		idValue=JsonParsingUsingJsonPath.jsonParse(res,"id");
		System.out.println("Id value :"+idValue);
		
		ResponseValidation.statusCodeValidate(201, res);
	}

}
