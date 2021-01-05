package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.TestSteps.HttpMethods;
import org.testing.Utilities.LoadProperties;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

@Test
public class TC3_Get_Request_AllData {
	@Test
	public static void tc3_Get_Request_AllData() throws IOException
	{
	Properties pr=LoadProperties.properties("../WizdomAPI.com/src/test/java/org/testing/Utilities/URI.properties");
	HttpMethods http=new HttpMethods(pr);
	Response res =http.get_Request("QA_URI");
	
	ResponseValidation.statusCodeValidate(201, res);
	//ResponseValidation.dataValidation(, res, null);
	}

}
