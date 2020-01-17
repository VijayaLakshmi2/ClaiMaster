package com.claimaster.adjudication.pageobjects.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CAPProfessionalQueuePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By capProfTab=By.xpath("//*[@id='capprofessional']/b");
	
	public CAPProfessionalQueuePage(WebDriver driver){
		this.driver=driver;
		
		PageFactory.initElements(driver, this);

	}
	
	public void navigatedToFFSInst() throws Exception{
		wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(capProfTab));
		//System.out.println(driver.findElement(ffsTab).getText());
		if(!driver.findElement(capProfTab).getText().equalsIgnoreCase("CAP Professional"))
			throw new Exception("CAP Professional Queue is not loaded");
		
	}

}
