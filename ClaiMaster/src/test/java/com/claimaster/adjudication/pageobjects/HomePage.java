package com.claimaster.adjudication.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By profClaimsCount=By.xpath("//*[@id='P1TC']");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void navigatedToHomePage() throws Exception{
		wait=new WebDriverWait(driver,240);
		wait.until(ExpectedConditions.visibilityOfElementLocated(profClaimsCount));
		/*System.out.println(driver.findElement(profClaimsCount).getText());
		wait.until(ExpectedConditions.presenceOfElementLocated(profClaimsCount));
		System.out.println(driver.findElement(profClaimsCount).getText());*/
		
		Thread.sleep(5000);
		if(!driver.findElement(profClaimsCount).isDisplayed())
			throw new Exception("FFS Institutional Queue is not loaded");
	}

}
