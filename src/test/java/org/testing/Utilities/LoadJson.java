package org.testing.Utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class LoadJson {
	
	public static String jsonPath(String jsonpath) throws IOException
	{
		File f=new File(jsonpath);
		FileReader fr=new FileReader(f);
		JSONTokener js=new JSONTokener(fr);
		JSONObject json=new JSONObject(js);
		 System.out.println("JsonPath method called successfully");	
		return	json.toString();
		 
	}
}
