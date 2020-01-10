package com.claimaster.adjudication.baseTest;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import com.claimaster.utils.Driver.BrowserDriver;

public class BaseTest {
	
	public WebDriver driver;
	
	public static Logger log = Logger.getLogger("errorLogger");
	
	@BeforeMethod
	public void setUp() {			
		driver = new BrowserDriver("chrome"); 	
		driver.manage().window().maximize(); 
		
	}   
	      
	/*@AfterMethod
	public void tearDown() { 
		driver.quit(); 
		
	}*/

}

