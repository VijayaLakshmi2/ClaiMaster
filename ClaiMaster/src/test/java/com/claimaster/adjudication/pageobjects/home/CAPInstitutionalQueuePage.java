package com.claimaster.adjudication.pageobjects.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CAPInstitutionalQueuePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By capInstTab=By.xpath("//*[@id='capinstitutional']/b");
	
	public CAPInstitutionalQueuePage(WebDriver driver){
		this.driver=driver;
		
		PageFactory.initElements(driver, this);

	}
	
	public void navigatedToFFSInst() throws Exception{
		wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(capInstTab));
		//System.out.println(driver.findElement(ffsTab).getText());
		if(!driver.findElement(capInstTab).getText().equalsIgnoreCase("CAP Institutional"))
			throw new Exception("CAP Institutional Queue is not loaded");
		
	}

}
