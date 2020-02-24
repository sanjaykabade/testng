package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends BaseTest
{

    @Test(priority=2,dependsOnMethods= "doUserReg",groups= {"functional","smoke"})
	public void doLogin()
	{
		System.out.println("execuiting login test");
		
	}
	
    @Test(priority=1,groups= {"functional","smoke"})
   	public void doUserReg()
   	{
   		System.out.println("execuiting douserlogin test");
   	
   		//Assert.fail("user reg failed");
   		
   	}

	@Test(priority=3,dependsOnMethods= "doUserReg",alwaysRun=true,groups= {"functional","smoke"})
	public static void thirdTest()
	{
		
		System.out.println("third test");
		
	}
	
	@Test(priority=4,groups="bvt")
	public static void fourTest()
	{
		
		System.out.println("four test");
		
	}
	
	
	
}
