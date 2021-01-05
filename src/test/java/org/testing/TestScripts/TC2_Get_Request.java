package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HttpMethods;
import org.testing.Utilities.LoadJson;
import org.testing.Utilities.LoadProperties;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC2_Get_Request {
	@Test
	public void tc2_Get_Request() throws IOException
	{
		Properties pr=	LoadProperties.properties("../WizdomAPI.com/src/test/java/org/testing/Utilities/URI.properties");
		HttpMethods http=new HttpMethods(pr);
		Response res=http.get_Request("QA_URI", TC1_Post_Request.idValue);
		
		System.out.println("TC2 successfully executed");
		
		ResponseValidation.statusCodeValidate(200, res);
	}
	
}
