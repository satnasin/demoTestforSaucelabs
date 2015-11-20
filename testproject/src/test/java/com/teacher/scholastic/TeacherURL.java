package com.teacher.scholastic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.runconfig.Config;

public class TeacherURL extends Config{
	
	@Test
	public void openApp(){
		WebDriver d = setDriver();
		d.get("http://www.scholastic.com/teachers/");
		System.out.println("page title "+d.getTitle());
		d.quit();
		 
		 
		
		
		
	}

	
	

}