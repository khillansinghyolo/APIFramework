package org.testing.Utilities;

import com.jayway.restassured.response.Response;

public class JsonParsingUsingJsonPath {
	
	public static String jsonParse(Response res ,String jsonpath)
	{
		return res.jsonPath().get(jsonpath);
	}

}
