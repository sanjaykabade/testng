package com.testparameterization;

import org.testng.annotations.Test;

public class New_Login_Test
{
    /*
	@Test(dataProviderClass=Data_Provider.class,dataProvider="dp1")
	public void testLogin(String username,String password)
	{
		
	  System.out.println(username+"--"+password);	
		
	}
	
	
	@Test(dataProviderClass=Data_Provider.class,dataProvider="dp2")
	public void testUserReg(String firstname,String lastname,String email)
	{
		
	  System.out.println(firstname+"--"+lastname+"--"+email);	
		
	}
	*/
	
	@Test(dataProviderClass=Data_Provider.class,dataProvider="dp1")
	public void testLogin(String username,String password)
	{
		
	  System.out.println(username+"--"+password);	
		
	}
	
	
	@Test(dataProviderClass=Data_Provider.class,dataProvider="dp1")
	public void testUserReg(String firstname,String lastname,String email)
	{
		
	  System.out.println(firstname+"--"+lastname+"--"+email);	
		
	}
	
	
	
	
	
	
}
