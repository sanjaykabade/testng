package com.testparameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_Param
{
    @Test(dataProvider="getData")    
	public void doLogin(String username,String password)
   {
	 System.out.println(username+".."+password);
    	
   }
	
    
    @DataProvider
	public Object[][] getData()
	{
		
		Object[][] data=new Object[3][2];
	
		data[0][0]="vaibhavkabadecsn@gmail.com";
		data[0][1]="vaibhav7798";
		
		data[1][0]="vaibhavkabadecsn1@gmail.com";
		data[1][1]="vaibhav77985";
		
		data[2][0]="vaibhavkabadecsn2@gmail.com";
		data[2][1]="vaibhav779853";
		
		
	  return data;
	}
	
	
}
