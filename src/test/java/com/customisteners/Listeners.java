package com.customisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener 
{

	
	public void onTestStart(ITestResult result)
	{  

		 System.out.println(result.getName()+" test case started");					
	}  
		  
		public void onTestSuccess(ITestResult result) 
		{  
		
			System.out.println("pass test result : "+result.getName());  
		}  
		  
		public void onTestFailure(ITestResult result)
		{  
		    Reporter.log("<a href=\"C:\\Users\\Vaibhav\\Pictures\\Screenshots\\Screenshot (1).png\" target=\"_black\"><img src=\"C:\\Users\\Vaibhav\\Pictures\\Screenshots\\Screenshot (1).png\"></img>screenshot link</a>");
			System.out.println("capturing screenshot for the failed test--:"+result.getName());  
		}  
		  
		public void onTestSkipped(ITestResult result)
		{  
		
			System.out.println("Skip of test cases and its details are : "+result.getName());  
		}  
		  
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
		{  
		
			System.out.println("Failure of test cases and its details are : "+result.getName());  
		}  
		  
		public void onStart(ITestContext context) 
		{  

		
		}  
		  
		public void onFinish(ITestContext context)
		{  
		//System.out.println("hello");
		
		}  
	
	
	
}
