package org.testing.Trigger;

import java.io.IOException;

import org.testing.TestScripts.TC1_Post_Request;
import org.testing.TestScripts.TC2_Get_Request;
import org.testing.TestScripts.TC3_Get_Request_AllData;

public class Runner {

	public static void main(String[] args) throws IOException {
		
		TC1_Post_Request TC1= new TC1_Post_Request();
		TC1.tc1_Post_Request();
		
		TC2_Get_Request tc2=new TC2_Get_Request();
		tc2.tc2_Get_Request();

		
		TC3_Get_Request_AllData tc3=new TC3_Get_Request_AllData();
		tc3.tc3_Get_Request_AllData();
		
		System.out.println("successfully run the trigger class");
	}

}
