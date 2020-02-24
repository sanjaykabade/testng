package com.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest 
{
    @BeforeSuite
	public void setUp()
	{
		
		System.out.println("initializing everything");
		
	}
	
	
   @AfterSuite
	public void tearDown()
	{
		
		System.out.println("quite everything");
		
	}
	
	
	
	
}
