package com.testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip extends BaseTest
{

	@Test
	public void isSkip()
	{
        //fourcefully skipping the test  
		throw new SkipException("skipping the test as the constion is not meet");
		
	}
	
	
	
	
	
	
	
	
	
}
