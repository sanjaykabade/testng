package com.regression;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class TestCases2
{

	@Test
	public void validateTitle()
	{
		
		System.out.println("biggiing");
		
		String except_title="yahoo.com";
		String actual_title="Gmail.com";
		
		/*
		if(except_title.equals(actual_title))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
	    }
		*/
		
		/* //hard assertion when error occured then rest of the code will not be executed 
		System.out.println("validating title");
		Assert.assertEquals(except_title, actual_title);
		//Assert.assertTrue(false,"failed");
	   
	    System.out.println("ending");
	
		 Assert.fail("fourcefully failed");
	
	     System.out.println("ending");
	
	   */
		 
		 //soft assertion when error occured then rest of the code will be executed 
		
		
		
		 SoftAssert soft=new SoftAssert();
		 
		 soft.assertEquals(except_title, actual_title);
		 
	  	System.out.println("ending");

	  	
	  	//soft.assertAll(); in case failure status on running report but rest of code will be executed
	  	
	}
	
	
	
	
	
	
	
	
	
}
