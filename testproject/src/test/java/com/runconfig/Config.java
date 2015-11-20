package com.runconfig;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
		
	public static final String USERNAME = "Satnam_Singh";
	  public static final String ACCESS_KEY = "1487948d-6389-4270-8d57-49267de9daf2";	  
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	 
	 // TRY TO USE DATAPROVIDER FOR PARAMETERIZATION 
	  
	  /*@Test(dataProvider="getDataforTest")
	  public static WebDriver setDriver(Capabilities caps) {
	   WebDriver driver = null;
		try {
			driver = new RemoteWebDriver(new URL(URL), caps);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    *//**
	    * Goes to Sauce Lab's guinea-pig page and prints title
	    *//*

	    
	    return driver;
	    
	  }
	
	  @DataProvider
	   public static Object[][] getDataforTest(){
			Object data[][]=new Object[1][1];
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			  caps.setCapability("platform", "Windows 10");
			  caps.setCapability("version", "42.0");
			  data[0][1]= caps;
			  return data;
	  }*/
	  
	  
	  
	  // WORKING CODE WHERE HARD CODED ONE ENV SETUP 
	  
	  @Test
	  public static WebDriver setDriver() {
			  DesiredCapabilities caps = DesiredCapabilities.chrome();
			  caps.setCapability("platform", "Windows 10");
			  caps.setCapability("version", "42.0");

		   WebDriver driver = null;
			try {
				driver = new RemoteWebDriver(new URL(URL), caps);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		    /**
		    * Goes to Sauce Lab's guinea-pig page and prints title
		    */
		    
		    return driver;
	  	}
}  
