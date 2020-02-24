package com.testparameterization;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Paraller_DP 
{

	
	
	@Test(dataProvider="getData")
	public void doLogin(String b) throws InterruptedException
	{
		
		Date d=new Date();
		System.out.println("browser name:"+b+"--"+d);
		Thread.sleep(5000);
		 
	}
	

	@DataProvider(parallel=true)
	public Object[][] getData()
  {
		  Object[][] data=new Object[2][1];

       data[0][0]="chrome";
  

       data[1][0]="firefox";

    return data;
  }
	
	
	
	
	
}
