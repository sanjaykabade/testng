package com.regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 
{
	

	  @BeforeTest
	   	public void launchDB()
	   	{
	   		System.out.println("launch DB test");
	   		
	   	}
	
	  @AfterTest
	   	public void closeDB()
	   	{
	   		System.out.println("close DB test");
	   		
	   	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@BeforeMethod
	   	public void launchBrowser()
	   	{
	   		System.out.println("launch browser test");
	   		
	   	}
	
	  @AfterMethod
	   	public void closeBrowser()
	   	{
	   		System.out.println("close browser test");
	   		
	   	}

	  
    @Test(priority=2)
	public void doLogin()
	{
		System.out.println("execuiting login test");
		
	}
	
    @Test(priority=1)
   	public void doUserReg()
   	{
   		System.out.println("execuiting douserlogin test");
   		
   	}
	
}
