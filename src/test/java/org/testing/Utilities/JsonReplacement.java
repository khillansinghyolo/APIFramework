package org.testing.Utilities;

import java.util.regex.Pattern;

public class JsonReplacement {
	
	public static String jsonReplaceValueUsingJsonPath(String body,String variableName,String variableValue)
	{
	 body=body.replaceAll(Pattern.quote("{{"+variableName+"}}"),variableValue);
	 System.out.println("jsonReplacement method called successfully");	
		return body;
	}

}
