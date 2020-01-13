package com.claimaster.adjudication.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void setup(){
		System.setProperty("webdriver.chrome.driver","D:\\Selenium dependencies\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	/* @AfterMethod
	public void tearDown() { 
		driver.quit(); 
		
	}*/

}
