package com.claimaster.adjudication.pageobjects.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DentalQueuePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By dentalTab=By.xpath("//*[@id='dental']/b");
	
	public DentalQueuePage(WebDriver driver){
		this.driver=driver;
		
		PageFactory.initElements(driver, this);

	}
	
	public void navigatedToFFSInst() throws Exception{
		wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(dentalTab));
		//System.out.println(driver.findElement(ffsTab).getText());
		if(!driver.findElement(dentalTab).getText().equalsIgnoreCase("Dental"))
			throw new Exception("Dentall Queue is not loaded");
		
	}

}
