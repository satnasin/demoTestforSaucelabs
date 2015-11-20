package com.parent.scholastic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.runconfig.Config;

public class ParentsURL extends Config{
	
	@Test
	public void openApp(){
		//WebDriver d = setDriver();
		WebDriver d = setDriver();
		d.get("http://www.scholastic.com/parents/");
		System.out.println("page title "+d.getTitle());
		d.quit();
		 
		 
		
		
		
	}

	
	

}
