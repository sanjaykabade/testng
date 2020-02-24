package com.testparameterization;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameterFromXML
{
    
	@Parameters({"browser"})
    @Test
	public void getBrowser(String browser)
   {
	   
	   System.out.println(browser);
	   
	   
	   
   }
	
	
	
	
	
	
	
}
