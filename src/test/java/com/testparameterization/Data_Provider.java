package com.testparameterization;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Provider
{

	/*//code inside new login test
	@Test(dataProvider="dp1")
	public void testData(String username,String password)
	{
		
	  System.out.println(username+"--"+password);	
		
	}
	*/
	
	@DataProvider(name="dp1")
	public Object[][] getData(Method m)
	{
		Object[][] data=null;
		if(m.getName().equals("testLogin"))
		{
			
			data=new Object[2][2];
	
			 
			data[0][0]="vaibhav";
			data[0][1]="asfa";
			
			data[1][0]="pari";
			data[1][1]="brd";
	   	
		 	
		}else if(m.getName().equals("testUserReg"))
		{
			data=new Object[2][3];
			
			data[0][0]="vaibhav";
			data[0][1]="bsda";
			data[0][2]="asfa";
			
			data[1][0]="pari";
			data[1][1]="brd";
			data[1][2]="wefgsad";
			
		}
		return data;
	
	}
	


	
	
	
	
	
	
	/*
	
	@DataProvider(name="dp1")
	public Object[][] getData()
	{
		
		Object[][] data=new Object[2][2];
	 
		data[0][0]="vaibhav";
		data[0][1]="asfa";
		
		data[1][0]="pari";
		data[1][1]="brd";
		
		return data;
		
		
		
	}
	
	
	@DataProvider(name="dp2")
	public Object[][] getData2()
	{
		
		Object[][] data=new Object[2][3];
	 
		data[0][0]="vaibhav";
		data[0][1]="bsda";
		data[0][2]="asfa";
		
		data[1][0]="pari";
		data[1][1]="brd";
		data[1][2]="wefgsad";
		
		return data;
		
		
		
		
	}
	
	*/
	
	
	
}
